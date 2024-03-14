package dxcapimaven.api;

import dxcapimaven.model.Client;
import dxcapimaven.model.GetApiClientClientId200Response;
import dxcapimaven.model.GetApiClients201Response;
import dxcapimaven.model.PostApiClients201Response;
import dxcapimaven.model.PostApiClientsClientId201Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link ApiApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T10:41:44.990513500+01:00[Europe/Madrid]")
public interface ApiApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /api/clients/{client-id} : Delete Customer by ID
     * will delet costumer by ID
     *
     * @param clientIdPathParam 13 (required)
     * @param clientId client_id (required)
     * @return No Content (status code 204)
     *         or Example response (status code 400)
     *         or Example response (status code 401)
     *         or Example response (status code 403)
     *         or Example response (status code 404)
     *         or Example response (status code 500)
     * @see ApiApi#deleteApiClientClientId
     */
    default ResponseEntity<Void> deleteApiClientClientId(Integer clientIdPathParam,
        Integer clientId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/clients/{client-id} : Get Customer by ID
     * get costumer by ID
     *
     * @param clientIdPathParam 13 (required)
     * @param clientId client_id (required)
     * @return OK (status code 200)
     *         or Example response (status code 400)
     *         or Example response (status code 401)
     *         or Example response (status code 403)
     *         or Example response (status code 404)
     *         or Example response (status code 500)
     * @see ApiApi#getApiClientClientId
     */
    default ResponseEntity<GetApiClientClientId200Response> getApiClientClientId(Integer clientIdPathParam,
        Integer clientId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"pagination\" : { \"offset\" : 0, \"limit\" : 0, \"totalPages\" : 0, \"links\" : \"{}\", \"page\" : 0, \"totalElements\" : 0 }, \"data\" : { \"clientId\" : 0, \"surname\" : \"surname\", \"name\" : \"name\", \"isClient\" : false, \"age\" : 0 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<null> </null>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("multipart/form-data"))) {
                    String exampleString = "Custom MIME type example not yet supported: multipart/form-data";
                    ApiUtil.setExampleResponse(request, "multipart/form-data", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/clients : Get of Customers List
     * get list of existed clients
     *
     * @param limitParam 100 (optional, default to 10)
     * @param offsetParam 10 (optional, default to 10)
     * @param sortBy 2 (optional)
     * @return Created (status code 201)
     *         or Example response (status code 400)
     *         or Example response (status code 401)
     *         or Example response (status code 403)
     *         or Example response (status code 404)
     *         or Example response (status code 500)
     * @see ApiApi#getApiClients
     */
    default ResponseEntity<GetApiClients201Response> getApiClients(Integer limitParam,
        Integer offsetParam,
        Integer sortBy) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"pagination\" : { \"offset\" : 0, \"limit\" : 0, \"totalPages\" : 0, \"links\" : \"{}\", \"page\" : 0, \"totalElements\" : 0 }, \"data\" : [ null, null ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<null> </null>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("multipart/form-data"))) {
                    String exampleString = "Custom MIME type example not yet supported: multipart/form-data";
                    ApiUtil.setExampleResponse(request, "multipart/form-data", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /api/clients : 
     * Method will post array of clients objects
     *
     * @param client Requestin array of Client objects (optional)
     * @return Created (status code 201)
     *         or Example response (status code 400)
     *         or Example response (status code 401)
     *         or Example response (status code 403)
     *         or Example response (status code 500)
     * @see ApiApi#postApiClients
     */
    default ResponseEntity<PostApiClients201Response> postApiClients(List<Client> client) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : [ null, null ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<null> </null>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("multipart/form-data"))) {
                    String exampleString = "Custom MIME type example not yet supported: multipart/form-data";
                    ApiUtil.setExampleResponse(request, "multipart/form-data", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /api/clients/{client-id} : 
     * will post the data of client
     *
     * @param clientIdPathParam 13 (required)
     * @param clientId client_id (required)
     * @param body Requestin Object of Client (optional)
     * @return Created (status code 201)
     *         or Example response (status code 400)
     *         or Example response (status code 401)
     *         or Example response (status code 403)
     *         or Example response (status code 500)
     * @see ApiApi#postApiClientsClientId
     */
    default ResponseEntity<PostApiClientsClientId201Response> postApiClientsClientId(Integer clientIdPathParam,
        Integer clientId,
        Client body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"clientId\" : 0, \"surname\" : \"surname\", \"name\" : \"name\", \"isClient\" : false, \"age\" : 0 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<null> </null>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("multipart/form-data"))) {
                    String exampleString = "Custom MIME type example not yet supported: multipart/form-data";
                    ApiUtil.setExampleResponse(request, "multipart/form-data", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
