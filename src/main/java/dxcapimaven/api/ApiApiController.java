package dxcapimaven.api;

import dxcapimaven.model.*;
import dxcapimaven.repository.ClientRepo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@CrossOrigin(origins = "http://localhost:4200")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-13T13:41:52.185498100+01:00[Europe/Madrid]")
@Controller
@RequestMapping("${openapi.apiTest.base-path:}")


public class ApiApiController implements ApiApi
    {
        private final ClientRepo clientRepo;

        public ApiApiController(ClientRepo clientRepo) {
            this.clientRepo = clientRepo;
        }


        /**
         * POST /api/clients :
         * Method will post array of clients objects
         *
         * @param client Requestin array of Client objects (optional)
         * @return Created (status code 201)
         * or Example response (status code 400)
         * or Example response (status code 401)
         * or Example response (status code 403)
         * or Example response (status code 500)
         */
        @Operation(operationId = "postApiClients", summary = "", description = "Method will post array of clients objects", tags = {"clientPostAll"}, responses = {@ApiResponse(responseCode = "201", description = "Created", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = PostApiClients201Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = PostApiClients201Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = PostApiClients201Response.class))}), @ApiResponse(responseCode = "400", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients400Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients400Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients400Response.class))}), @ApiResponse(responseCode = "401", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients401Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients401Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients401Response.class))}), @ApiResponse(responseCode = "403", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients403Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients403Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients403Response.class))}), @ApiResponse(responseCode = "500", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients500Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients500Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients500Response.class))})})
        @RequestMapping(method = RequestMethod.POST, value = "/api/clients", produces = {"application/json", "application/xml", "multipart/form-data"}, consumes = {"application/json"})

        public ResponseEntity<PostApiClients201Response> postApiClients(@Parameter(name = "Client", description = "Requestin array of Client objects") @Valid @RequestBody(required = false) List<Client> client) {

            // for data base H2
            Set<Client> clientList = new HashSet<>();

            for (Client c : client) {
                //check if client exist
                Optional<Client> existingClient = clientRepo.findBySurnameAndName(c.getSurname(), c.getName());

                if (!existingClient.isPresent()) {
                    clientList.add(c);
                }
            }
            clientRepo.saveAll(clientList);

            return new ResponseEntity<>(HttpStatus.CREATED);

        }

        /**
         * GET /api/clients : Get of Customers List
         * get list of existed clients
         *
         * @param limitParam  100 (optional, default to 10)
         * @param offsetParam 10 (optional, default to 10)
         * @param sortBy      2 (optional)
         * @return Created (status code 201)
         * or Example response (status code 400)
         * or Example response (status code 401)
         * or Example response (status code 403)
         * or Example response (status code 404)
         * or Example response (status code 500)
         */
        @Operation(operationId = "getApiClients", summary = "Get of Customers List", description = "get list of existed clients", tags = {"clientGetAll"}, responses = {@ApiResponse(responseCode = "201", description = "Created", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients201Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients201Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients201Response.class))}), @ApiResponse(responseCode = "400", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients400Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients400Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients400Response.class))}), @ApiResponse(responseCode = "401", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients401Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients401Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients401Response.class))}), @ApiResponse(responseCode = "403", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients403Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients403Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients403Response.class))}), @ApiResponse(responseCode = "404", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients404Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients404Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients404Response.class))}), @ApiResponse(responseCode = "500", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients500Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients500Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients500Response.class))})})
        @RequestMapping(method = RequestMethod.GET, value = "/api/clients", produces = {"application/json", "application/xml", "multipart/form-data"})

        public ResponseEntity<GetApiClients201Response> getApiClients(@Min(0) @Max(100) @Parameter(name = "LimitParam", description = "100", in = ParameterIn.QUERY) @Valid @RequestParam(value = "LimitParam", required = false, defaultValue = "100") Integer limitParam, @Min(1) @Max(100) @Parameter(name = "OffsetParam", description = "10", in = ParameterIn.QUERY) @Valid @RequestParam(value = "OffsetParam", required = false, defaultValue = "0") Integer offsetParam, @Parameter(name = "SortBy", description = "2", in = ParameterIn.QUERY) @Valid @RequestParam(value = "SortBy", required = false) Integer sortBy) {

            // for H2 ddbb

            //defalut sorting param
            String sortinParam = "isClient";

            if (sortBy != null) {
                switch (sortBy) {
                    case 1:
                        sortinParam = "clientId";
                        break;
                    case 2:
                        sortinParam = "surname";
                        break;
                    case 3:
                        sortinParam = "age";
                        break;
                    default:
                        break;
                }
            }
            // sort object based on params
            Sort sort = Sort.by(sortinParam);

            // Paginated object according sorting params
            Pageable pageable = PageRequest.of(offsetParam, limitParam, sort);

            //fetch clients based on sorting and pagination
            Page<Client> clientPage = clientRepo.findAll(pageable);

            //Response object
            GetApiClients201Response response = new GetApiClients201Response();
            response.setData(clientPage.getContent());

            return new ResponseEntity<>(response, HttpStatus.OK);

        }

        /**
         * DELETE /api/clients/{client-id} : Delete Customer by ID
         * will delet costumer by ID
         *
         * @param clientIdPathParam 13 (required)
         * @param clientId          client_id (required)
         * @return No Content (status code 204)
         * or Example response (status code 400)
         * or Example response (status code 401)
         * or Example response (status code 403)
         * or Example response (status code 404)
         * or Example response (status code 500)
         */
        @Operation(operationId = "deleteApiClientClientId", summary = "Delete Customer by ID", description = "will delet costumer by ID", tags = {"clientDeleteById"}, responses = {@ApiResponse(responseCode = "204", description = "No Content"), @ApiResponse(responseCode = "400", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients400Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients400Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients400Response.class))}), @ApiResponse(responseCode = "401", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients401Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients401Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients401Response.class))}), @ApiResponse(responseCode = "403", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients403Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients403Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients403Response.class))}), @ApiResponse(responseCode = "404", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients404Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients404Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients404Response.class))}), @ApiResponse(responseCode = "500", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients500Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients500Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients500Response.class))})})
        @RequestMapping(method = RequestMethod.DELETE, value = "/api/clients/{client-id}", produces = {"application/json", "application/xml", "multipart/form-data"})
        public ResponseEntity<Void> deleteApiClientClientId(@NotNull @Min(1) @Max(1000) @Parameter(name = "ClientIdPathParam", description = "13", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "ClientIdPathParam", required = true, defaultValue = "7") Integer clientIdPathParam, @Parameter(name = "client-id", description = "client_id", required = true, in = ParameterIn.PATH) @PathVariable("client-id") Integer clientId) {
            //For H2 ddbb

            //check if client exist
            if (!clientRepo.existsById(clientId)) {
                return ResponseEntity.notFound().build();
            }
            clientRepo.deleteById(clientId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        /**
         * POST /api/clients/{client-id} :
         * will post the data of client
         *
         * @param clientIdPathParam 13 (required)
         * @param clientId          client_id (required)
         * @param body              Requestin Object of Client (optional)
         * @return Created (status code 201)
         * or Example response (status code 400)
         * or Example response (status code 401)
         * or Example response (status code 403)
         * or Example response (status code 500)
         */
        @Operation(operationId = "postApiClientsClientId", summary = "", description = "will post the data of client", tags = {"clientPostById"}, responses = {@ApiResponse(responseCode = "201", description = "Created", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = PostApiClientsClientId201Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = PostApiClientsClientId201Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = PostApiClientsClientId201Response.class))}), @ApiResponse(responseCode = "400", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients400Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients400Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients400Response.class))}), @ApiResponse(responseCode = "401", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients401Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients401Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients401Response.class))}), @ApiResponse(responseCode = "403", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients403Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients403Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients403Response.class))}), @ApiResponse(responseCode = "500", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients500Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients500Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients500Response.class))})})
        @RequestMapping(method = RequestMethod.POST, value = "/api/clients/{client-id}", produces = {"application/json", "application/xml", "multipart/form-data"}, consumes = {"application/json"})

        public ResponseEntity<PostApiClientsClientId201Response> postApiClientsClientId(@NotNull @Min(1) @Max(1000) @Parameter(name = "ClientIdPathParam", description = "13", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "ClientIdPathParam", required = true, defaultValue = "7") Integer clientIdPathParam, @Parameter(name = "client-id", description = "client_id", required = true, in = ParameterIn.PATH) @PathVariable("client-id") Integer clientId, @Parameter(name = "body", description = "Requestin Object of Client") @Valid @RequestBody(required = false) Client body) {

            Optional<Client> existingClientOptional = clientRepo.findById(clientId);

            if (existingClientOptional.isPresent()) {
                Client existingClient = existingClientOptional.get();
                existingClient.setName(body.getName());
                existingClient.setSurname(body.getSurname());
                existingClient.setAge(body.getAge());
                existingClient.setIsClient(body.getIsClient());

                clientRepo.save(existingClient);
                return ResponseEntity.noContent().build();
            } else {
                return ResponseEntity.notFound().build();
            }

        }

        /**
         * GET /api/clients/{client-id} : Get Customer by ID
         * get costumer by ID
         *
         * @param clientIdPathParam 13 (required)
         * @param clientId          client_id (required)
         * @return OK (status code 200)
         * or Example response (status code 400)
         * or Example response (status code 401)
         * or Example response (status code 403)
         * or Example response (status code 404)
         * or Example response (status code 500)
         */
        @Operation(operationId = "getApiClientClientId", summary = "Get Customer by ID", description = "get costumer by ID", tags = {"clientGetById"}, responses = {@ApiResponse(responseCode = "200", description = "OK", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClientClientId200Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClientClientId200Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClientClientId200Response.class))}), @ApiResponse(responseCode = "400", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients400Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients400Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients400Response.class))}), @ApiResponse(responseCode = "401", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients401Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients401Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients401Response.class))}), @ApiResponse(responseCode = "403", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients403Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients403Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients403Response.class))}), @ApiResponse(responseCode = "404", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients404Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients404Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients404Response.class))}), @ApiResponse(responseCode = "500", description = "Example response", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients500Response.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients500Response.class)), @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients500Response.class))})})
        @RequestMapping(method = RequestMethod.GET, value = "/api/clients/{client-id}", produces = {"application/json", "application/xml", "multipart/form-data"})

        public ResponseEntity<GetApiClientClientId200Response> getApiClientClientId(@NotNull @Min(1) @Max(1000) @Parameter(name = "ClientIdPathParam", description = "13", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "ClientIdPathParam", required = true, defaultValue = "7") Integer clientIdPathParam, @Parameter(name = "client-id", description = "client_id", required = true, in = ParameterIn.PATH) @PathVariable("client-id") Integer clientId) {
            Optional<Client> client = clientRepo.findById(clientId);

            if (client.isPresent()) {
                GetApiClientClientId200Response response = new GetApiClientClientId200Response();
                response.setData(client.get());
                return ResponseEntity.ok(response);
            } else {
                return ResponseEntity.notFound().build();
            }

        }

        @RequestMapping(method = RequestMethod.POST, value = "/api/clients/byobject", produces = {"application/json", "application/xml", "multipart/form-data"}, consumes = {"application/json"})

        public ResponseEntity<PostApiClients201Response> findByClientObject(@Parameter(name = "Client", description = "Requestin array of Client objects, or array of object") @Valid @RequestBody(required = false) Client body) {

            if (body.getSurname() != null && body.getName() != null) {
                Optional<Client> existingClient = clientRepo.findBySurnameAndName(body.getSurname(), body.getName());
                if (existingClient.isPresent()) {
                    List<Client> clientSet = new ArrayList<>();
                    clientSet.add(existingClient.get());
                    PostApiClients201Response response = new PostApiClients201Response();
                    response.data(clientSet);
                    return new ResponseEntity(response, HttpStatus.CREATED);
                }
            }

            return ResponseEntity.notFound().build();


        }

    }