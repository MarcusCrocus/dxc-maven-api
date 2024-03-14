package dxcapimaven.api;


import dxcapimaven.model.Client;
import dxcapimaven.model.GetApiClients201Response;
import dxcapimaven.model.PostApiClients201Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T10:41:44.990513500+01:00[Europe/Madrid]")
@Controller
@RequestMapping("${openapi.apiTest.base-path:}")
public class ApiApiController implements ApiApi {


    //    private final ApiApiDelegate delegate;
    //
    //    public ApiApiController(@Autowired(required = false) ApiApiDelegate delegate) {
    //        this.delegate = Optional.ofNullable(delegate).orElse(new ApiApiDelegate() {});
    //    }
    //
    //    @Override
    //    public ApiApiDelegate getDelegate() {
    //        return delegate;
    //    }
    List<Client> clientList = new ArrayList<>();
    @Override
    public ResponseEntity<PostApiClients201Response> postApiClients(List<Client> client) {

        clientList.addAll(client);

        PostApiClients201Response response = new PostApiClients201Response();
        response.setData(clientList);
        return new ResponseEntity<>(response, HttpStatus.CREATED);

        //        return ApiApi.super.postApiClients(clients);

    }

    @Override
    public ResponseEntity<GetApiClients201Response> getApiClients(Integer limitParam, Integer offsetParam, Integer sortBy) {

        GetApiClients201Response response = new GetApiClients201Response();
        response.setData(clientList);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
