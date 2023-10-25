package io.swagger.api;

import io.swagger.model.ApiAcknowledgeTasksBody;
import io.swagger.model.ApiCorrespondentsBody;
import io.swagger.model.ApiDocumentTypesBody;
import io.swagger.model.ApiGroupsBody;
import io.swagger.model.ApiSavedViewsBody;
import io.swagger.model.ApiStoragePathsBody;
import io.swagger.model.ApiTagsBody;
import io.swagger.model.ApiUiSettingsBody;
import io.swagger.model.ApiUsersBody;
import io.swagger.model.CorrespondentsIdBody;
import io.swagger.model.DocumentTypesIdBody;
import io.swagger.model.DocumentsBulkEditBody;
import io.swagger.model.DocumentsIdBody;
import io.swagger.model.DocumentsSelectionDataBody;
import io.swagger.model.GroupsIdBody;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse20010;
import io.swagger.model.InlineResponse20011;
import io.swagger.model.InlineResponse20012;
import io.swagger.model.InlineResponse20013;
import io.swagger.model.InlineResponse20014;
import io.swagger.model.InlineResponse20015;
import io.swagger.model.InlineResponse20016;
import io.swagger.model.InlineResponse20017;
import io.swagger.model.InlineResponse20018;
import io.swagger.model.InlineResponse20019;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.InlineResponse20020;
import io.swagger.model.InlineResponse20021;
import io.swagger.model.InlineResponse20022;
import io.swagger.model.InlineResponse20023;
import io.swagger.model.InlineResponse20024;
import io.swagger.model.InlineResponse20025;
import io.swagger.model.InlineResponse20026;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import io.swagger.model.InlineResponse2005;
import io.swagger.model.InlineResponse2006;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.InlineResponse2009;
import org.threeten.bp.OffsetDateTime;
import org.springframework.core.io.Resource;
import io.swagger.model.StoragePathsIdBody;
import io.swagger.model.TagsIdBody;
import io.swagger.model.UserInfo;
import io.swagger.model.UsersIdBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")
@RestController
public class ApiApiController implements ApiApi {

    private static final Logger log = LoggerFactory.getLogger(ApiApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ApiApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse20020> ackTasks(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ApiAcknowledgeTasksBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20020>(objectMapper.readValue("{\n  \"result\" : 0\n}", InlineResponse20020.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20020>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20020>(HttpStatus.OK);
    }

    public ResponseEntity<Void> apiGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<String>> autoComplete(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "term", required = false) String term,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<String>>(objectMapper.readValue("[ \"\", \"\" ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<String>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> bulkEdit(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody DocumentsBulkEditBody body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<ApiCorrespondentsBody> createCorrespondent(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ApiCorrespondentsBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ApiCorrespondentsBody>(objectMapper.readValue("{\n  \"owner\" : 6,\n  \"matching_algorithm\" : 0,\n  \"is_insensitive\" : true,\n  \"name\" : \"name\",\n  \"match\" : \"match\"\n}", ApiCorrespondentsBody.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ApiCorrespondentsBody>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ApiCorrespondentsBody>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2009> createDocumentType(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ApiDocumentTypesBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2009>(objectMapper.readValue("{\n  \"owner\" : 1,\n  \"matching_algorithm\" : 6,\n  \"user_can_change\" : true,\n  \"is_insensitive\" : true,\n  \"name\" : \"name\",\n  \"match\" : \"match\",\n  \"id\" : 0,\n  \"slug\" : \"slug\"\n}", InlineResponse2009.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2009>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2009>(HttpStatus.OK);
    }

    public ResponseEntity<Object> createGroup(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ApiGroupsBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Void> createSavedViews(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ApiSavedViewsBody body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20023> createStoragePath(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ApiStoragePathsBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20023>(objectMapper.readValue("{\n  \"owner\" : 1,\n  \"path\" : \"path\",\n  \"matching_algorithm\" : 6,\n  \"user_can_change\" : true,\n  \"is_insensitive\" : true,\n  \"name\" : \"name\",\n  \"match\" : \"match\",\n  \"id\" : 0,\n  \"slug\" : \"slug\"\n}", InlineResponse20023.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20023>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20023>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20017> createTag(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ApiTagsBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20017>(objectMapper.readValue("{\n  \"owner\" : 1,\n  \"matching_algorithm\" : 6,\n  \"user_can_change\" : true,\n  \"color\" : \"color\",\n  \"is_insensitive\" : true,\n  \"name\" : \"name\",\n  \"match\" : \"match\",\n  \"id\" : 0,\n  \"text_color\" : \"text_color\",\n  \"is_inbox_tag\" : true,\n  \"slug\" : \"slug\"\n}", InlineResponse20017.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20017>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20017>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20026> createUISettings(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ApiUiSettingsBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20026>(objectMapper.readValue("{\n  \"success\" : true\n}", InlineResponse20026.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20026>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20026>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20015> createUser(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ApiUsersBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20015>(objectMapper.readValue("{\n  \"is_active\" : true,\n  \"is_superuser\" : true,\n  \"user_permissions\" : [ \"\", \"\" ],\n  \"is_staff\" : true,\n  \"last_name\" : \"last_name\",\n  \"groups\" : [ \"\", \"\" ],\n  \"password\" : \"password\",\n  \"id\" : 5,\n  \"date_joined\" : \"date_joined\",\n  \"first_name\" : \"first_name\",\n  \"email\" : \"email\",\n  \"username\" : \"username\",\n  \"inherited_permissions\" : [ \"inherited_permissions\", \"inherited_permissions\" ]\n}", InlineResponse20015.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20015>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20015>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteCorrespondent(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteDocument(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteDocumentType(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteGroup(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteStoragePath(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteTag(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteUser(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Resource> downloadDocument(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "original", required = false) Boolean original) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Resource>(objectMapper.readValue("\"\"", Resource.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Resource>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200> getCorrespondents(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Integer page,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "full_perms", required = false) Boolean fullPerms) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{\n  \"next\" : 6,\n  \"all\" : [ 5, 5 ],\n  \"previous\" : 1,\n  \"count\" : 0,\n  \"results\" : [ {\n    \"owner\" : 9,\n    \"matching_algorithm\" : 2,\n    \"document_count\" : 7,\n    \"is_insensitive\" : true,\n    \"permissions\" : {\n      \"view\" : {\n        \"groups\" : [ \"\", \"\" ],\n        \"users\" : [ \"\", \"\" ]\n      }\n    },\n    \"name\" : \"name\",\n    \"match\" : \"match\",\n    \"id\" : 5,\n    \"last_correspondence\" : \"last_correspondence\",\n    \"slug\" : \"slug\"\n  }, {\n    \"owner\" : 9,\n    \"matching_algorithm\" : 2,\n    \"document_count\" : 7,\n    \"is_insensitive\" : true,\n    \"permissions\" : {\n      \"view\" : {\n        \"groups\" : [ \"\", \"\" ],\n        \"users\" : [ \"\", \"\" ]\n      }\n    },\n    \"name\" : \"name\",\n    \"match\" : \"match\",\n    \"id\" : 5,\n    \"last_correspondence\" : \"last_correspondence\",\n    \"slug\" : \"slug\"\n  } ]\n}", InlineResponse200.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2003> getDocument(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Integer page,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "full_perms", required = false) Boolean fullPerms) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2003>(objectMapper.readValue("{\n  \"owner\" : 7,\n  \"archive_serial_number\" : 2,\n  \"notes\" : [ {\n    \"note\" : \"note\",\n    \"created\" : \"created\",\n    \"document\" : 1,\n    \"id\" : 7,\n    \"user\" : 1\n  }, {\n    \"note\" : \"note\",\n    \"created\" : \"created\",\n    \"document\" : 1,\n    \"id\" : 7,\n    \"user\" : 1\n  } ],\n  \"added\" : \"added\",\n  \"created\" : \"created\",\n  \"title\" : \"title\",\n  \"content\" : \"content\",\n  \"tags\" : [ 5, 5 ],\n  \"storage_path\" : 5,\n  \"permissions\" : {\n    \"view\" : {\n      \"groups\" : [ 3, 3 ],\n      \"users\" : [ 9, 9 ]\n    }\n  },\n  \"archived_file_name\" : \"archived_file_name\",\n  \"modified\" : \"modified\",\n  \"correspondent\" : 6,\n  \"original_file_name\" : \"original_file_name\",\n  \"id\" : 0,\n  \"created_date\" : \"created_date\",\n  \"document_type\" : 1\n}", InlineResponse2003.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2003>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2003>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2007> getDocumentMetadata(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2007>(objectMapper.readValue("{\n  \"archive_size\" : 6,\n  \"archive_metadata\" : [ {\n    \"prefix\" : \"prefix\",\n    \"namespace\" : \"namespace\",\n    \"value\" : \"value\",\n    \"key\" : \"key\"\n  }, {\n    \"prefix\" : \"prefix\",\n    \"namespace\" : \"namespace\",\n    \"value\" : \"value\",\n    \"key\" : \"key\"\n  } ],\n  \"original_metadata\" : [ \"\", \"\" ],\n  \"original_filename\" : \"original_filename\",\n  \"original_mime_type\" : \"original_mime_type\",\n  \"archive_checksum\" : \"archive_checksum\",\n  \"original_checksum\" : \"original_checksum\",\n  \"lang\" : \"lang\",\n  \"media_filename\" : \"media_filename\",\n  \"has_archive_version\" : true,\n  \"archive_media_filename\" : \"archive_media_filename\",\n  \"original_size\" : 0\n}", InlineResponse2007.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2007>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2007>(HttpStatus.OK);
    }

    public ResponseEntity<Resource> getDocumentPreview(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Resource>(objectMapper.readValue("\"\"", Resource.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Resource>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2006> getDocumentSuggestions(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2006>(objectMapper.readValue("{\n  \"storage_paths\" : [ \"\", \"\" ],\n  \"document_types\" : [ \"\", \"\" ],\n  \"dates\" : [ \"\", \"\" ],\n  \"correspondents\" : [ \"\", \"\" ],\n  \"tags\" : [ \"\", \"\" ]\n}", InlineResponse2006.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2006>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2006>(HttpStatus.OK);
    }

    public ResponseEntity<Resource> getDocumentThumb(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Resource>(objectMapper.readValue("\"\"", Resource.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Resource>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2008> getDocumentTypes(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Integer page,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "full_perms", required = false) Boolean fullPerms) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2008>(objectMapper.readValue("{\n  \"next\" : 6,\n  \"all\" : [ 5, 5 ],\n  \"previous\" : 1,\n  \"count\" : 0,\n  \"results\" : [ {\n    \"owner\" : 9,\n    \"matching_algorithm\" : 2,\n    \"document_count\" : 7,\n    \"is_insensitive\" : true,\n    \"permissions\" : {\n      \"view\" : {\n        \"groups\" : [ \"\", \"\" ],\n        \"users\" : [ \"\", \"\" ]\n      }\n    },\n    \"name\" : \"name\",\n    \"match\" : \"match\",\n    \"id\" : 5,\n    \"slug\" : \"slug\"\n  }, {\n    \"owner\" : 9,\n    \"matching_algorithm\" : 2,\n    \"document_count\" : 7,\n    \"is_insensitive\" : true,\n    \"permissions\" : {\n      \"view\" : {\n        \"groups\" : [ \"\", \"\" ],\n        \"users\" : [ \"\", \"\" ]\n      }\n    },\n    \"name\" : \"name\",\n    \"match\" : \"match\",\n    \"id\" : 5,\n    \"slug\" : \"slug\"\n  } ]\n}", InlineResponse2008.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2008>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2008>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2002> getDocuments(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "Page", required = false) Integer page,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page_size", required = false) Integer pageSize,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "query", required = false) String query,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "ordering", required = false) String ordering,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "tags__id__all", required = false) List<Integer> tagsIdAll,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "document_type__id", required = false) Integer documentTypeId,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "storage_path__id__in", required = false) Integer storagePathIdIn,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "correspondent__id", required = false) Integer correspondentId,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "truncate_content", required = false) Boolean truncateContent) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2002>(objectMapper.readValue("{\n  \"next\" : 6,\n  \"all\" : [ 5, 5 ],\n  \"previous\" : 1,\n  \"count\" : 0,\n  \"results\" : [ {\n    \"owner\" : 4,\n    \"user_can_change\" : true,\n    \"archive_serial_number\" : 2,\n    \"notes\" : [ {\n      \"note\" : \"note\",\n      \"created\" : \"created\",\n      \"document\" : 1,\n      \"id\" : 7,\n      \"user\" : 1\n    }, {\n      \"note\" : \"note\",\n      \"created\" : \"created\",\n      \"document\" : 1,\n      \"id\" : 7,\n      \"user\" : 1\n    } ],\n    \"added\" : \"added\",\n    \"created\" : \"created\",\n    \"title\" : \"title\",\n    \"content\" : \"content\",\n    \"tags\" : [ 3, 3 ],\n    \"storage_path\" : 9,\n    \"archived_file_name\" : \"archived_file_name\",\n    \"modified\" : \"modified\",\n    \"correspondent\" : 2,\n    \"original_file_name\" : \"original_file_name\",\n    \"id\" : 5,\n    \"created_date\" : \"created_date\",\n    \"document_type\" : 7\n  }, {\n    \"owner\" : 4,\n    \"user_can_change\" : true,\n    \"archive_serial_number\" : 2,\n    \"notes\" : [ {\n      \"note\" : \"note\",\n      \"created\" : \"created\",\n      \"document\" : 1,\n      \"id\" : 7,\n      \"user\" : 1\n    }, {\n      \"note\" : \"note\",\n      \"created\" : \"created\",\n      \"document\" : 1,\n      \"id\" : 7,\n      \"user\" : 1\n    } ],\n    \"added\" : \"added\",\n    \"created\" : \"created\",\n    \"title\" : \"title\",\n    \"content\" : \"content\",\n    \"tags\" : [ 3, 3 ],\n    \"storage_path\" : 9,\n    \"archived_file_name\" : \"archived_file_name\",\n    \"modified\" : \"modified\",\n    \"correspondent\" : 2,\n    \"original_file_name\" : \"original_file_name\",\n    \"id\" : 5,\n    \"created_date\" : \"created_date\",\n    \"document_type\" : 7\n  } ]\n}", InlineResponse2002.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2002>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20012> getGroups(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Integer page,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page_size", required = false) Integer pageSize) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20012>(objectMapper.readValue("{\n  \"next\" : 6,\n  \"all\" : [ \"\", \"\" ],\n  \"previous\" : 1,\n  \"count\" : 0,\n  \"results\" : [ \"\", \"\" ]\n}", InlineResponse20012.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20012>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20012>(HttpStatus.OK);
    }

    public ResponseEntity<List<String>> getLog(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<String>>(objectMapper.readValue("[ \"\", \"\" ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<String>>(HttpStatus.OK);
    }

    public ResponseEntity<List<String>> getLogs() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<String>>(objectMapper.readValue("[ \"\", \"\" ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<String>>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20021> getSavedViews(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Integer page,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page_size", required = false) Integer pageSize) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20021>(objectMapper.readValue("{\n  \"next\" : 6,\n  \"all\" : [ 5, 5 ],\n  \"previous\" : 1,\n  \"count\" : 0,\n  \"results\" : [ {\n    \"owner\" : {\n      \"is_superuser\" : true,\n      \"is_active\" : true,\n      \"user_permissions\" : [ 9, 9 ],\n      \"is_staff\" : true,\n      \"last_login\" : \"last_login\",\n      \"last_name\" : \"last_name\",\n      \"groups\" : [ \"\", \"\" ],\n      \"password\" : \"password\",\n      \"id\" : 7,\n      \"date_joined\" : \"date_joined\",\n      \"first_name\" : \"first_name\",\n      \"email\" : \"email\",\n      \"username\" : \"username\"\n    },\n    \"user_can_change\" : true,\n    \"sort_field\" : \"sort_field\",\n    \"show_on_dashboard\" : true,\n    \"name\" : \"name\",\n    \"show_in_sidebar\" : true,\n    \"filter_rules\" : [ {\n      \"rule_type\" : 2,\n      \"value\" : \"value\"\n    }, {\n      \"rule_type\" : 2,\n      \"value\" : \"value\"\n    } ],\n    \"sort_reverse\" : true,\n    \"id\" : 5\n  }, {\n    \"owner\" : {\n      \"is_superuser\" : true,\n      \"is_active\" : true,\n      \"user_permissions\" : [ 9, 9 ],\n      \"is_staff\" : true,\n      \"last_login\" : \"last_login\",\n      \"last_name\" : \"last_name\",\n      \"groups\" : [ \"\", \"\" ],\n      \"password\" : \"password\",\n      \"id\" : 7,\n      \"date_joined\" : \"date_joined\",\n      \"first_name\" : \"first_name\",\n      \"email\" : \"email\",\n      \"username\" : \"username\"\n    },\n    \"user_can_change\" : true,\n    \"sort_field\" : \"sort_field\",\n    \"show_on_dashboard\" : true,\n    \"name\" : \"name\",\n    \"show_in_sidebar\" : true,\n    \"filter_rules\" : [ {\n      \"rule_type\" : 2,\n      \"value\" : \"value\"\n    }, {\n      \"rule_type\" : 2,\n      \"value\" : \"value\"\n    } ],\n    \"sort_reverse\" : true,\n    \"id\" : 5\n  } ]\n}", InlineResponse20021.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20021>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20021>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20022> getStoragePaths(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Integer page,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "full_perms", required = false) Boolean fullPerms) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20022>(objectMapper.readValue("{\n  \"next\" : true,\n  \"all\" : [ 6, 6 ],\n  \"previous\" : true,\n  \"count\" : 0,\n  \"results\" : [ {\n    \"owner\" : 2,\n    \"path\" : \"path\",\n    \"matching_algorithm\" : 5,\n    \"document_count\" : 5,\n    \"is_insensitive\" : true,\n    \"permissions\" : {\n      \"view\" : {\n        \"groups\" : [ \"\", \"\" ],\n        \"users\" : [ 7, 7 ]\n      }\n    },\n    \"name\" : \"name\",\n    \"match\" : \"match\",\n    \"id\" : 1,\n    \"slug\" : \"slug\"\n  }, {\n    \"owner\" : 2,\n    \"path\" : \"path\",\n    \"matching_algorithm\" : 5,\n    \"document_count\" : 5,\n    \"is_insensitive\" : true,\n    \"permissions\" : {\n      \"view\" : {\n        \"groups\" : [ \"\", \"\" ],\n        \"users\" : [ 7, 7 ]\n      }\n    },\n    \"name\" : \"name\",\n    \"match\" : \"match\",\n    \"id\" : 1,\n    \"slug\" : \"slug\"\n  } ]\n}", InlineResponse20022.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20022>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20022>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20016> getTags(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Integer page,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "full_perms", required = false) Boolean fullPerms) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20016>(objectMapper.readValue("{\n  \"next\" : 6,\n  \"all\" : [ 5, 5 ],\n  \"previous\" : 1,\n  \"count\" : 0,\n  \"results\" : [ {\n    \"owner\" : 9,\n    \"matching_algorithm\" : 2,\n    \"document_count\" : 7,\n    \"color\" : \"color\",\n    \"is_insensitive\" : true,\n    \"permissions\" : {\n      \"view\" : {\n        \"groups\" : [ \"\", \"\" ],\n        \"users\" : [ \"\", \"\" ]\n      }\n    },\n    \"name\" : \"name\",\n    \"match\" : \"match\",\n    \"id\" : 5,\n    \"text_color\" : \"text_color\",\n    \"is_inbox_tag\" : true,\n    \"slug\" : \"slug\"\n  }, {\n    \"owner\" : 9,\n    \"matching_algorithm\" : 2,\n    \"document_count\" : 7,\n    \"color\" : \"color\",\n    \"is_insensitive\" : true,\n    \"permissions\" : {\n      \"view\" : {\n        \"groups\" : [ \"\", \"\" ],\n        \"users\" : [ \"\", \"\" ]\n      }\n    },\n    \"name\" : \"name\",\n    \"match\" : \"match\",\n    \"id\" : 5,\n    \"text_color\" : \"text_color\",\n    \"is_inbox_tag\" : true,\n    \"slug\" : \"slug\"\n  } ]\n}", InlineResponse20016.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20016>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20016>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse20019>> getTasks() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<InlineResponse20019>>(objectMapper.readValue("[ {\n  \"date_done\" : \"date_done\",\n  \"result\" : \"result\",\n  \"acknowledged\" : true,\n  \"task_file_name\" : \"task_file_name\",\n  \"date_created\" : \"date_created\",\n  \"related_document\" : \"related_document\",\n  \"task_id\" : \"task_id\",\n  \"id\" : 0,\n  \"type\" : \"type\",\n  \"status\" : \"status\"\n}, {\n  \"date_done\" : \"date_done\",\n  \"result\" : \"result\",\n  \"acknowledged\" : true,\n  \"task_file_name\" : \"task_file_name\",\n  \"date_created\" : \"date_created\",\n  \"related_document\" : \"related_document\",\n  \"task_id\" : \"task_id\",\n  \"id\" : 0,\n  \"type\" : \"type\",\n  \"status\" : \"status\"\n} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<InlineResponse20019>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<InlineResponse20019>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getToken(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody UserInfo body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20025> getUISettings() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20025>(objectMapper.readValue("{\n  \"settings\" : {\n    \"update_checking\" : {\n      \"backend_setting\" : \"backend_setting\"\n    }\n  },\n  \"permissions\" : [ \"permissions\", \"permissions\" ],\n  \"display_name\" : \"display_name\",\n  \"user\" : {\n    \"is_superuser\" : true,\n    \"groups\" : [ \"\", \"\" ],\n    \"id\" : 0,\n    \"username\" : \"username\"\n  }\n}", InlineResponse20025.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20025>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20025>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20014> getUsers(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Integer page,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page_size", required = false) Integer pageSize) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20014>(objectMapper.readValue("{\n  \"next\" : 6,\n  \"all\" : [ 5, 5 ],\n  \"previous\" : 1,\n  \"count\" : 0,\n  \"results\" : [ {\n    \"is_active\" : true,\n    \"is_superuser\" : true,\n    \"user_permissions\" : [ \"\", \"\" ],\n    \"is_staff\" : true,\n    \"last_name\" : \"last_name\",\n    \"groups\" : [ \"\", \"\" ],\n    \"password\" : \"password\",\n    \"id\" : 5,\n    \"date_joined\" : \"date_joined\",\n    \"first_name\" : \"first_name\",\n    \"email\" : \"email\",\n    \"username\" : \"username\",\n    \"inherited_permissions\" : [ \"inherited_permissions\", \"inherited_permissions\" ]\n  }, {\n    \"is_active\" : true,\n    \"is_superuser\" : true,\n    \"user_permissions\" : [ \"\", \"\" ],\n    \"is_staff\" : true,\n    \"last_name\" : \"last_name\",\n    \"groups\" : [ \"\", \"\" ],\n    \"password\" : \"password\",\n    \"id\" : 5,\n    \"date_joined\" : \"date_joined\",\n    \"first_name\" : \"first_name\",\n    \"email\" : \"email\",\n    \"username\" : \"username\",\n    \"inherited_permissions\" : [ \"inherited_permissions\", \"inherited_permissions\" ]\n  } ]\n}", InlineResponse20014.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20014>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20014>(HttpStatus.OK);
    }

    public ResponseEntity<Void> root() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2005> selectionData(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody DocumentsSelectionDataBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2005>(objectMapper.readValue("{\n  \"selected_storage_paths\" : [ null, null ],\n  \"selected_document_types\" : [ null, null ],\n  \"selected_correspondents\" : [ {\n    \"document_count\" : 6,\n    \"id\" : 0\n  }, {\n    \"document_count\" : 6,\n    \"id\" : 0\n  } ],\n  \"selected_tags\" : [ null, null ]\n}", InlineResponse2005.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2005>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2005>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20011> statistics() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20011>(objectMapper.readValue("{\n  \"document_file_type_counts\" : [ {\n    \"mime_type\" : \"mime_type\",\n    \"mime_type_count\" : 5\n  }, {\n    \"mime_type\" : \"mime_type\",\n    \"mime_type_count\" : 5\n  } ],\n  \"documents_inbox\" : 6,\n  \"inbox_tag\" : 1,\n  \"documents_total\" : 0,\n  \"character_count\" : 5\n}", InlineResponse20011.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20011>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20011>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2001> updateCorrespondent(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody CorrespondentsIdBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2001>(objectMapper.readValue("{\n  \"owner\" : 5,\n  \"matching_algorithm\" : 6,\n  \"user_can_change\" : true,\n  \"document_count\" : 1,\n  \"is_insensitive\" : true,\n  \"name\" : \"name\",\n  \"match\" : \"match\",\n  \"id\" : 0,\n  \"last_correspondence\" : 5,\n  \"slug\" : \"slug\"\n}", InlineResponse2001.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2001>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2004> updateDocument(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody DocumentsIdBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2004>(objectMapper.readValue("{\n  \"owner\" : 7,\n  \"user_can_change\" : true,\n  \"archive_serial_number\" : 2,\n  \"notes\" : [ \"\", \"\" ],\n  \"added\" : \"added\",\n  \"created\" : \"created\",\n  \"title\" : \"title\",\n  \"content\" : \"content\",\n  \"tags\" : [ 5, 5 ],\n  \"storage_path\" : 5,\n  \"archived_file_name\" : \"archived_file_name\",\n  \"modified\" : \"modified\",\n  \"correspondent\" : 6,\n  \"original_file_name\" : \"original_file_name\",\n  \"id\" : 0,\n  \"created_date\" : \"created_date\",\n  \"document_type\" : 1\n}", InlineResponse2004.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2004>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2004>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20010> updateDocumentType(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody DocumentTypesIdBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20010>(objectMapper.readValue("{\n  \"owner\" : 5,\n  \"matching_algorithm\" : 6,\n  \"user_can_change\" : true,\n  \"document_count\" : 1,\n  \"is_insensitive\" : true,\n  \"name\" : \"name\",\n  \"match\" : \"match\",\n  \"id\" : 0,\n  \"slug\" : \"slug\"\n}", InlineResponse20010.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20010>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20010>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20013> updateGroup(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody GroupsIdBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20013>(objectMapper.readValue("{\n  \"permissions\" : [ \"permissions\", \"permissions\" ],\n  \"name\" : \"name\",\n  \"id\" : 0\n}", InlineResponse20013.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20013>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20013>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20024> updateStoragePath(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody StoragePathsIdBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20024>(objectMapper.readValue("{\n  \"owner\" : 5,\n  \"path\" : \"path\",\n  \"matching_algorithm\" : 6,\n  \"user_can_change\" : true,\n  \"document_count\" : 1,\n  \"is_insensitive\" : true,\n  \"name\" : \"name\",\n  \"match\" : \"match\",\n  \"id\" : 0,\n  \"slug\" : \"slug\"\n}", InlineResponse20024.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20024>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20024>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20018> updateTag(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody TagsIdBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20018>(objectMapper.readValue("{\n  \"owner\" : 5,\n  \"matching_algorithm\" : 6,\n  \"user_can_change\" : true,\n  \"document_count\" : 1,\n  \"color\" : \"color\",\n  \"is_insensitive\" : true,\n  \"name\" : \"name\",\n  \"match\" : \"match\",\n  \"id\" : 0,\n  \"text_color\" : \"text_color\",\n  \"is_inbox_tag\" : true,\n  \"slug\" : \"slug\"\n}", InlineResponse20018.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20018>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20018>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse20015> updateUser(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody UsersIdBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20015>(objectMapper.readValue("{\n  \"is_active\" : true,\n  \"is_superuser\" : true,\n  \"user_permissions\" : [ \"\", \"\" ],\n  \"is_staff\" : true,\n  \"last_name\" : \"last_name\",\n  \"groups\" : [ \"\", \"\" ],\n  \"password\" : \"password\",\n  \"id\" : 5,\n  \"date_joined\" : \"date_joined\",\n  \"first_name\" : \"first_name\",\n  \"email\" : \"email\",\n  \"username\" : \"username\",\n  \"inherited_permissions\" : [ \"inherited_permissions\", \"inherited_permissions\" ]\n}", InlineResponse20015.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20015>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20015>(HttpStatus.OK);
    }

    public ResponseEntity<Void> uploadDocument(@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="title", required=false)  String title,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="created", required=false)  OffsetDateTime created,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="document_type", required=false)  Integer documentType,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="tags", required=false)  List<Integer> tags,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="correspondent", required=false)  Integer correspondent,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="document", required=false)  List<Resource> document) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
