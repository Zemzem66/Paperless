package com.paperless;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;

import java.io.File;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PaperlessTests {

    @Test
    @DisplayName("Upload new document")
    @Order(1)
    public void uploadDocument() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;

        File testUploadFile = new File("src/test/resources/pdfs/test.pdf");

        Response response = given()
                .multiPart("document", testUploadFile)
                .accept(ContentType.JSON)
                .when()
                .post("/api/documents/post_document/")
                .then()
                .statusCode(201)
                .extract()
                .response();

        //validate that the response has the status code of 201
        response.then().assertThat().statusCode(201);

        //we upload a second file (so that we can later check that when searching we only get the file we want)
        File testUploadFile2 = new File("src/test/resources/pdfs/test2.pdf");

        Response response2 = given()
                .multiPart("document", testUploadFile2)
                .accept(ContentType.JSON)
                .when()
                .post("/api/documents/post_document/")
                .then()
                .statusCode(201)
                .extract()
                .response();

        //validate that the response has the status code of 201
        response2.then().assertThat().statusCode(201);
    }

    @Test
    @DisplayName("Get all documents")
    @Order(2)
    public void getDocuments() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;

        String response = given()
                .accept(ContentType.JSON)
                .when()
                .get("/api/documents/")
                .then()
                .statusCode(200)
                .body("results.title", hasItem("test.pdf")) // check that first file is in the results
                .body("results.title", hasItem("test2.pdf"))// check that second file is in the results
                .extract()
                .body()
                .asString();

        System.out.println(response);
    }

    @Test
    @DisplayName("Search for the word 'integration' in documents")
    @Order(3)
    public void searchDocuments() throws InterruptedException {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;

        // Wait for 10 seconds to ensure that indexing of the document is complete
        Thread.sleep(10000);

        String response = given()
                .accept(ContentType.JSON)
                .param("query", "integration") // the word "integration" is in the test.pdf file but not in the test2.pdf file
                .when()
                .get("/api/documents/")
                .then()
                .statusCode(200)
                .body("results.title", hasItem("test.pdf")) // check that first file is in the results
                .body("results.title", not(hasItem("test2.pdf"))) // check that second file is not in the results
                .extract()
                .body()
                .asString();

        System.out.println(response);

        // Parse the response body and extract the id of the test.pdf document
        JsonPath jsonPath = new JsonPath(response);
        List<Map<String, Object>> results = jsonPath.getList("results");
        for (Map<String, Object> result : results) {
            // print the result
            System.out.println(result);
            if ("test.pdf".equals(result.get("title"))) {
                getDocumentById((int) result.get("id"));
                return;
            }
        }

        // If we get here, we didn't find the test.pdf document
        fail();
    }

    public void getDocumentById(int documentId) {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;

        String response = given()
                .accept(ContentType.JSON)
                .when()
                .get("/api/documents/" + documentId + "/")
                .then()
                .statusCode(200)
                .body("content", containsString("This is a test pdf for an integration test."))
                .extract()
                .body()
                .asString();

        System.out.println(response);
    }

}