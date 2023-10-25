/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.48).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
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
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")
@Validated
public interface ApiApi {

    @Operation(summary = "", description = "", tags={ "Tasks" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse20020.class))) })
    @RequestMapping(value = "/api/acknowledge_tasks/",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse20020> ackTasks(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ApiAcknowledgeTasksBody body);


    @Operation(summary = "", description = "", tags={ "Login" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success") })
    @RequestMapping(value = "/api/",
        method = RequestMethod.GET)
    ResponseEntity<Void> apiGet();


    @Operation(summary = "", description = "", tags={ "Search" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class)))) })
    @RequestMapping(value = "/api/search/autocomplete/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<String>> autoComplete(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "term", required = false) String term, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit);


    @Operation(summary = "", description = "", tags={ "Documents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success") })
    @RequestMapping(value = "/api/documents/bulk_edit/",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> bulkEdit(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody DocumentsBulkEditBody body);


    @Operation(summary = "", description = "", tags={ "Correspondents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiCorrespondentsBody.class))) })
    @RequestMapping(value = "/api/correspondents/",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<ApiCorrespondentsBody> createCorrespondent(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ApiCorrespondentsBody body);


    @Operation(summary = "", description = "", tags={ "DocumentTypes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2009.class))) })
    @RequestMapping(value = "/api/document_types/",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2009> createDocumentType(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ApiDocumentTypesBody body);


    @Operation(summary = "", description = "", tags={ "Login" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))) })
    @RequestMapping(value = "/api/groups/",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Object> createGroup(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ApiGroupsBody body);


    @Operation(summary = "", description = "", tags={ "Config" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success") })
    @RequestMapping(value = "/api/saved_views/",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> createSavedViews(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ApiSavedViewsBody body);


    @Operation(summary = "", description = "", tags={ "Config" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse20023.class))) })
    @RequestMapping(value = "/api/storage_paths/",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse20023> createStoragePath(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ApiStoragePathsBody body);


    @Operation(summary = "", description = "", tags={ "Tags" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse20017.class))) })
    @RequestMapping(value = "/api/tags/",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse20017> createTag(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ApiTagsBody body);


    @Operation(summary = "", description = "", tags={ "Config" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse20026.class))) })
    @RequestMapping(value = "/api/ui_settings/",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse20026> createUISettings(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ApiUiSettingsBody body);


    @Operation(summary = "", description = "", tags={ "Login" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse20015.class))) })
    @RequestMapping(value = "/api/users/",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse20015> createUser(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ApiUsersBody body);


    @Operation(summary = "", description = "", tags={ "Correspondents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Success") })
    @RequestMapping(value = "/api/correspondents/{id}/",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCorrespondent(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "", description = "", tags={ "Documents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Success") })
    @RequestMapping(value = "/api/documents/{id}/",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDocument(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "", description = "", tags={ "DocumentTypes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Success") })
    @RequestMapping(value = "/api/document_types/{id}/",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDocumentType(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "", description = "", tags={ "Login" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Success") })
    @RequestMapping(value = "/api/groups/{id}/",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteGroup(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "", description = "", tags={ "Config" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Success") })
    @RequestMapping(value = "/api/storage_paths/{id}/",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteStoragePath(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "", description = "", tags={ "Tags" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Success") })
    @RequestMapping(value = "/api/tags/{id}/",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteTag(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "", description = "", tags={ "Login" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Success") })
    @RequestMapping(value = "/api/users/{id}/",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUser(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "", description = "", tags={ "Documents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/pdf", schema = @Schema(implementation = Resource.class))) })
    @RequestMapping(value = "/api/documents/{id}/download/",
        produces = { "application/pdf" }, 
        method = RequestMethod.GET)
    ResponseEntity<Resource> downloadDocument(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "original", required = false) Boolean original);


    @Operation(summary = "", description = "", tags={ "Correspondents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse200.class))) })
    @RequestMapping(value = "/api/correspondents/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> getCorrespondents(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Integer page, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "full_perms", required = false) Boolean fullPerms);


    @Operation(summary = "", description = "", tags={ "Documents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2003.class))) })
    @RequestMapping(value = "/api/documents/{id}/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2003> getDocument(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Integer page, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "full_perms", required = false) Boolean fullPerms);


    @Operation(summary = "", description = "", tags={ "Documents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2007.class))) })
    @RequestMapping(value = "/api/documents/{id}/metadata/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2007> getDocumentMetadata(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "", description = "", tags={ "Documents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/pdf", schema = @Schema(implementation = Resource.class))) })
    @RequestMapping(value = "/api/documents/{id}/preview/",
        produces = { "application/pdf" }, 
        method = RequestMethod.GET)
    ResponseEntity<Resource> getDocumentPreview(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "", description = "", tags={ "Documents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2006.class))) })
    @RequestMapping(value = "/api/documents/{id}/suggestions/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2006> getDocumentSuggestions(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "", description = "", tags={ "Documents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/pdf", schema = @Schema(implementation = Resource.class))) })
    @RequestMapping(value = "/api/documents/{id}/thumb/",
        produces = { "application/pdf" }, 
        method = RequestMethod.GET)
    ResponseEntity<Resource> getDocumentThumb(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "", description = "", tags={ "DocumentTypes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2008.class))) })
    @RequestMapping(value = "/api/document_types/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2008> getDocumentTypes(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Integer page, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "full_perms", required = false) Boolean fullPerms);


    @Operation(summary = "", description = "", tags={ "Documents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2002.class))) })
    @RequestMapping(value = "/api/documents/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2002> getDocuments(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "Page", required = false) Integer page, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page_size", required = false) Integer pageSize, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "query", required = false) String query, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "ordering", required = false) String ordering, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "tags__id__all", required = false) List<Integer> tagsIdAll, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "document_type__id", required = false) Integer documentTypeId, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "storage_path__id__in", required = false) Integer storagePathIdIn, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "correspondent__id", required = false) Integer correspondentId, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "truncate_content", required = false) Boolean truncateContent);


    @Operation(summary = "", description = "", tags={ "Login" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse20012.class))) })
    @RequestMapping(value = "/api/groups/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20012> getGroups(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Integer page, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page_size", required = false) Integer pageSize);


    @Operation(summary = "", description = "", tags={ "Config" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class)))) })
    @RequestMapping(value = "/api/logs/{id}/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<String>> getLog(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "", description = "", tags={ "Config" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class)))) })
    @RequestMapping(value = "/api/logs/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<String>> getLogs();


    @Operation(summary = "", description = "", tags={ "Config" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse20021.class))) })
    @RequestMapping(value = "/api/saved_views/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20021> getSavedViews(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Integer page, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page_size", required = false) Integer pageSize);


    @Operation(summary = "", description = "", tags={ "Config" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse20022.class))) })
    @RequestMapping(value = "/api/storage_paths/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20022> getStoragePaths(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Integer page, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "full_perms", required = false) Boolean fullPerms);


    @Operation(summary = "", description = "", tags={ "Tags" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse20016.class))) })
    @RequestMapping(value = "/api/tags/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20016> getTags(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Integer page, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "full_perms", required = false) Boolean fullPerms);


    @Operation(summary = "", description = "", tags={ "Tasks" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = InlineResponse20019.class)))) })
    @RequestMapping(value = "/api/tasks/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<InlineResponse20019>> getTasks();


    @Operation(summary = "", description = "", tags={ "Login" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success") })
    @RequestMapping(value = "/api/token/",
        consumes = { "application/json", "text/json", "application/_*+json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> getToken(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody UserInfo body);


    @Operation(summary = "", description = "", tags={ "Config" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse20025.class))) })
    @RequestMapping(value = "/api/ui_settings/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20025> getUISettings();


    @Operation(summary = "", description = "", tags={ "Login" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse20014.class))) })
    @RequestMapping(value = "/api/users/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20014> getUsers(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Integer page, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "page_size", required = false) Integer pageSize);


    @Operation(summary = "", description = "", tags={ "Login" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success") })
    @RequestMapping(value = "/api/",
        method = RequestMethod.POST)
    ResponseEntity<Void> root();


    @Operation(summary = "", description = "", tags={ "Documents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2005.class))) })
    @RequestMapping(value = "/api/documents/selection_data/",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2005> selectionData(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody DocumentsSelectionDataBody body);


    @Operation(summary = "", description = "", tags={ "Login" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse20011.class))) })
    @RequestMapping(value = "/api/statistics/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20011> statistics();


    @Operation(summary = "", description = "", tags={ "Correspondents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2001.class))) })
    @RequestMapping(value = "/api/correspondents/{id}/",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse2001> updateCorrespondent(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody CorrespondentsIdBody body);


    @Operation(summary = "", description = "", tags={ "Documents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2004.class))) })
    @RequestMapping(value = "/api/documents/{id}/",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse2004> updateDocument(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody DocumentsIdBody body);


    @Operation(summary = "", description = "", tags={ "DocumentTypes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse20010.class))) })
    @RequestMapping(value = "/api/document_types/{id}/",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse20010> updateDocumentType(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody DocumentTypesIdBody body);


    @Operation(summary = "", description = "", tags={ "Login" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse20013.class))) })
    @RequestMapping(value = "/api/groups/{id}/",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse20013> updateGroup(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody GroupsIdBody body);


    @Operation(summary = "", description = "", tags={ "Config" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse20024.class))) })
    @RequestMapping(value = "/api/storage_paths/{id}/",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse20024> updateStoragePath(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody StoragePathsIdBody body);


    @Operation(summary = "", description = "", tags={ "Tags" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse20018.class))) })
    @RequestMapping(value = "/api/tags/{id}/",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse20018> updateTag(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody TagsIdBody body);


    @Operation(summary = "", description = "", tags={ "Login" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse20015.class))) })
    @RequestMapping(value = "/api/users/{id}/",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse20015> updateUser(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody UsersIdBody body);


    @Operation(summary = "", description = "", tags={ "Documents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success") })
    @RequestMapping(value = "/api/documents/post_document/",
        consumes = { "multipart/form-data" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> uploadDocument(@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="title", required=false)  String title, @Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="created", required=false)  OffsetDateTime created, @Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="document_type", required=false)  Integer documentType, @Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="tags", required=false)  List<Integer> tags, @Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="correspondent", required=false)  Integer correspondent, @Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="document", required=false)  List<Resource> document);

}

