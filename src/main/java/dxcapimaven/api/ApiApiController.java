package DXC.Mavenapiapp.api;


import dxcapimaven.api.ApiApi;

import dxcapimaven.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-13T13:41:52.185498100+01:00[Europe/Madrid]")
@Controller
@RequestMapping("${openapi.apiTest.base-path:}")


public class ApiApiController implements ApiApi {

    //  List<Client> clientList = new ArrayList<>();
    private final Map< Integer,Client> clientMap = new HashMap<>();
    private final Set <Client> clientSet = new HashSet<>();


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
    @Operation(
            operationId = "postApiClients",
            summary = "",
            description = "Method will post array of clients objects",
            tags = {"clientPostAll"},
            responses = {
                    @ApiResponse(responseCode = "201", description = "Created", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = PostApiClients201Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = PostApiClients201Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = PostApiClients201Response.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients400Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients400Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients400Response.class))
                    }),
                    @ApiResponse(responseCode = "401", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients401Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients401Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients401Response.class))
                    }),
                    @ApiResponse(responseCode = "403", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients403Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients403Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients403Response.class))
                    }),
                    @ApiResponse(responseCode = "500", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients500Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients500Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients500Response.class))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/api/clients",
            produces = {"application/json", "application/xml", "multipart/form-data"},
            consumes = {"application/json"}
    )

    public ResponseEntity<PostApiClients201Response> postApiClients(
            @Parameter(name = "Client", description = "Requestin array of Client objects") @Valid @RequestBody(required = false) List<Client> client
    ) {

        //        for HashSet implementation

        if(client != null && !client.isEmpty()){
            for (Client newClient : client){
                if (!clientSet.contains(newClient)){
                    clientSet.add(newClient);
                    System.out.println("Client added" + newClient);
                }else {
                    System.out.println("Client adready exist" + newClient);
                }
            }
            return new ResponseEntity<>(HttpStatus.CREATED);

        }else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        //for HasMap implementation

        //        // Check if client exist and not empty will post if ther are clients to add
        //        if (client != null && !client.isEmpty()) {
        //            for (Client newClient : client) {
        //
        //                if (!clientMap.containsKey(newClient.getClientId())) {
        //                    clientMap.put(newClient.getClientId(), newClient);
        //                    System.out.println("Client added" + newClient);
        //                }
        //            }
        //            // update the list with new clients
        //
        //            //Return succesfull
        //            return ResponseEntity.status(HttpStatus.CREATED).build();
        //        } else {
        //            // bad request
        //            return ResponseEntity.badRequest().build();
        //        }

        //        //for List<Client> ferification added just for ArrayList implementation

        //        // Check if client exist and not empty will post if ther are clients to add
        //        if (client != null && !client.isEmpty()) {
        //            for (Client newClient : client) {
        //                boolean clientExist = false;
        //                for (Client existingClient : clientList) {
        //                    if (existingClient.getClientId().equals(newClient.getClientId())) {
        //                        clientExist = true;
        //                        break;
        //                    }
        //                }
        //                // if client doesn'e exist will add to the collection
        //                if (!clientExist) {
        //                    clientList.add(newClient);
        //                }
        //            }
        //            //Return succesfull
        //            return new ResponseEntity<>(HttpStatus.CREATED);
        //        } else {
        //            // bad request
        //            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        //        }

        //        Verification doesn't exist just for ArrayList implementation

        //        //Adding Array of clients objects from recieving parameters to Array list
        //        clientList.addAll(client);
        //
        //        // creating instanse for response
        //        PostApiClients201Response response = new PostApiClients201Response();
        //        response.setData(clientList);
        //        return new ResponseEntity<>(response, HttpStatus.CREATED);

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
    @Operation(
            operationId = "getApiClients",
            summary = "Get of Customers List",
            description = "get list of existed clients",
            tags = {"clientGetAll"},
            responses = {
                    @ApiResponse(responseCode = "201", description = "Created", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients201Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients201Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients201Response.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients400Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients400Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients400Response.class))
                    }),
                    @ApiResponse(responseCode = "401", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients401Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients401Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients401Response.class))
                    }),
                    @ApiResponse(responseCode = "403", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients403Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients403Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients403Response.class))
                    }),
                    @ApiResponse(responseCode = "404", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients404Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients404Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients404Response.class))
                    }),
                    @ApiResponse(responseCode = "500", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients500Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients500Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients500Response.class))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/api/clients",
            produces = {"application/json", "application/xml", "multipart/form-data"}
    )

    public ResponseEntity<GetApiClients201Response> getApiClients(
            @Min(0) @Max(100) @Parameter(name = "LimitParam", description = "100", in = ParameterIn.QUERY) @Valid @RequestParam(value = "LimitParam", required = false, defaultValue = "100") Integer limitParam,
            @Min(1) @Max(100) @Parameter(name = "OffsetParam", description = "10", in = ParameterIn.QUERY) @Valid @RequestParam(value = "OffsetParam", required = false, defaultValue = "0") Integer offsetParam,
            @Parameter(name = "SortBy", description = "2", in = ParameterIn.QUERY) @Valid @RequestParam(value = "SortBy", required = false) Integer sortBy
    ) {

        //        For HashSet implementation

        // creating responce
        GetApiClients201Response response = new  GetApiClients201Response();

        List<Client> clientList = new ArrayList<>(clientSet);

        // cheking if there is any param to sort
        if (sortBy != null){
            //Sorting algorithm
            switch (sortBy){
                case 1:
                    clientList.sort(Comparator.comparing(Client::getClientId));
                    break;
                case 2:
                    clientList.sort(Comparator.comparing(Client::getName));
                    break;
                default:
                    clientList.sort(Comparator.comparing(Client::getIsClient));
                    break;
            }
        }

        //          Aplly pagination
        int startIndex = Math.min(offsetParam, clientList.size());
        int endtIndex = Math.min(offsetParam + limitParam, clientList.size());
        List<Client> paginationClient = clientList.subList(startIndex, endtIndex);

        // set pagination
        response.setData(paginationClient);

        return new ResponseEntity<>(response,HttpStatus.OK);

        //            //For HasMap implementation
        //
        ////          Creating response
        //        GetApiClients201Response response = new GetApiClients201Response();
        //
        ////          Getting values from from cleientMap
        //        List<Client> clients = new ArrayList<>(clientMap.values());
        //
        ////          Sorting algorithm
        //        Comparator<Client> comparator;
        //        if ("name".equals(sortBy)) {
        //            clients.sort(Comparator.comparing(Client::getName));
        //        } else if ("id".equals(sortBy)) {
        //            clients.sort(Comparator.comparingInt(Client::getClientId));
        //        } else {
        //            // if sorting is not recognizeble, will be applied by name by default
        //            clients.sort(Comparator.comparing(Client::getName));
        //        }
        //
        ////          Aplly pagination
        //        int startIndex = Math.min(offsetParam, clients.size());
        //        int endtIndex = Math.min(offsetParam + limitParam, clients.size());
        //        List<Client> paginationClient = clients.subList(startIndex, endtIndex);
        //
        ////          Setting pagination
        //        response.setData(paginationClient);
        //
        //        return new ResponseEntity<>(response, HttpStatus.OK);


        //        //Creating response using List<Client> implementation

        //        GetApiClients201Response response = new GetApiClients201Response();
        //        response.setData(clientList);
        //
        //        return new ResponseEntity<>(response, HttpStatus.OK);
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
    @Operation(
            operationId = "deleteApiClientClientId",
            summary = "Delete Customer by ID",
            description = "will delet costumer by ID",
            tags = {"clientDeleteById"},
            responses = {
                    @ApiResponse(responseCode = "204", description = "No Content"),
                    @ApiResponse(responseCode = "400", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients400Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients400Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients400Response.class))
                    }),
                    @ApiResponse(responseCode = "401", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients401Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients401Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients401Response.class))
                    }),
                    @ApiResponse(responseCode = "403", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients403Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients403Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients403Response.class))
                    }),
                    @ApiResponse(responseCode = "404", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients404Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients404Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients404Response.class))
                    }),
                    @ApiResponse(responseCode = "500", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients500Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients500Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients500Response.class))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/api/clients/{client-id}",
            produces = {"application/json", "application/xml", "multipart/form-data"}
    )
    public ResponseEntity<Void> deleteApiClientClientId(
            @NotNull @Min(1) @Max(1000) @Parameter(name = "ClientIdPathParam", description = "13", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "ClientIdPathParam", required = true, defaultValue = "7") Integer clientIdPathParam,
            @Parameter(name = "client-id", description = "client_id", required = true, in = ParameterIn.PATH) @PathVariable("client-id") Integer clientId
    ) {

        //          For HashSet Implementation

        boolean clientExist = false;
        //find and remove client with given ID

        for (Client client : clientSet){
            if (client.getClientId().equals(clientIdPathParam)){
                clientSet.remove(client);
                clientExist = true;
                System.out.println("Client removed: " + client);
                break;
            }
        }

        if(clientExist){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); //cli exist and removed
        }else {
            System.out.println("Client with ID: " + clientIdPathParam + " not found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        //        // for HashMap implementation
        //        if (clientMap.containsKey(clientId)){
        //            clientMap.remove(clientId);
        //            return new ResponseEntity<>(HttpStatus.OK);
        //        }else {
        //            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        //        }

        //        // Cheking if client exist
        //        boolean clientExist = false;
        //        for (Client client : clientList) {
        //            if (client.getClientId().equals(clientId)) {
        //                clientExist = true;
        //                break;
        //            }
        //        }
        //
        //        if (clientExist) {
        //            return new ResponseEntity<>(HttpStatus.CONFLICT); // error 409
        //        }
        //        if (body != null) {
        //            clientList.add(body);
        //        }
        //
        //        return new ResponseEntity<>(HttpStatus.CREATED);


        //          Using List<Client>

        //        // serching client in the Array list
        //        for (Client client : clientList) {
        //            if (client.getClientId().equals(clientId)) {
        //                clientList.remove(client);
        //                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        //            }
        //        }
        //        // if not found by ID
        //        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
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
    @Operation(
            operationId = "postApiClientsClientId",
            summary = "",
            description = "will post the data of client",
            tags = {"clientPostById"},
            responses = {
                    @ApiResponse(responseCode = "201", description = "Created", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = PostApiClientsClientId201Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = PostApiClientsClientId201Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = PostApiClientsClientId201Response.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients400Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients400Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients400Response.class))
                    }),
                    @ApiResponse(responseCode = "401", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients401Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients401Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients401Response.class))
                    }),
                    @ApiResponse(responseCode = "403", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients403Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients403Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients403Response.class))
                    }),
                    @ApiResponse(responseCode = "500", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients500Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients500Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients500Response.class))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/api/clients/{client-id}",
            produces = {"application/json", "application/xml", "multipart/form-data"},
            consumes = {"application/json"}
    )

    public ResponseEntity<PostApiClientsClientId201Response> postApiClientsClientId(
            @NotNull @Min(1) @Max(1000) @Parameter(name = "ClientIdPathParam", description = "13", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "ClientIdPathParam", required = true, defaultValue = "7") Integer clientIdPathParam,
            @Parameter(name = "client-id", description = "client_id", required = true, in = ParameterIn.PATH) @PathVariable("client-id") Integer clientId,
            @Parameter(name = "body", description = "Requestin Object of Client") @Valid @RequestBody(required = false) Client body
    ) {

        //          For HashSet implementation

        boolean clientUpdated = false;

        for (Client client : clientSet){
            if (client.getClientId().equals(clientIdPathParam)){
                client.setName(body.getName());
                client.setSurname(body.getSurname());
                client.setIsClient(body.getIsClient());
                client.setAge(body.getAge());

                System.out.println("Client " + client + " was updated");
                clientUpdated = true;
            }
        }

        if (clientUpdated) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); //return succesful responce of operation
        }else {
            System.out.println("Client with the current ID: " + clientIdPathParam + "hasn't been fount");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); //error
        }

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
     */
    @Operation(
            operationId = "getApiClientClientId",
            summary = "Get Customer by ID",
            description = "get costumer by ID",
            tags = { "clientGetById" },
            responses = {
                    @ApiResponse(responseCode = "200", description = "OK", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClientClientId200Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClientClientId200Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClientClientId200Response.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients400Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients400Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients400Response.class))
                    }),
                    @ApiResponse(responseCode = "401", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients401Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients401Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients401Response.class))
                    }),
                    @ApiResponse(responseCode = "403", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients403Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients403Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients403Response.class))
                    }),
                    @ApiResponse(responseCode = "404", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients404Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients404Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients404Response.class))
                    }),
                    @ApiResponse(responseCode = "500", description = "Example response", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = GetApiClients500Response.class)),
                            @Content(mediaType = "application/xml", schema = @Schema(implementation = GetApiClients500Response.class)),
                            @Content(mediaType = "multipart/form-data", schema = @Schema(implementation = GetApiClients500Response.class))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/api/clients/{client-id}",
            produces = { "application/json", "application/xml", "multipart/form-data" }
    )

    public ResponseEntity<GetApiClientClientId200Response> getApiClientClientId(
            @NotNull @Min(1) @Max(1000) @Parameter(name = "ClientIdPathParam", description = "13", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "ClientIdPathParam", required = true, defaultValue = "7") Integer clientIdPathParam,
            @Parameter(name = "client-id", description = "client_id", required = true, in = ParameterIn.PATH) @PathVariable("client-id") Integer clientId
    ){
        //      For HashSet implementation

        //Serch cli in HashSet
        Client client = null;

        for (Client cli : clientSet){
            if (cli.getClientId().equals(clientId)){
                client = cli;
                break;
            }
        }

        if (client != null){
            GetApiClientClientId200Response response = new GetApiClientClientId200Response();
            response.setData(client); //cli found in HashSet, return client obj
            return new ResponseEntity<>(response, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

}