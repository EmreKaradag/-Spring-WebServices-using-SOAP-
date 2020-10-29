package com.webservice.springbootsoapwebservice.endpoint;

import com.webservice.spring_boot_soap_webservice.GetUserRequest;
import com.webservice.spring_boot_soap_webservice.GetUserResponse;
import com.webservice.springbootsoapwebservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {

  @Autowired
  private UserService userService;

  @PayloadRoot(namespace = "http://webservice.com/spring-boot-soap-webservice",
               localPart = "getUserRequest")
  @ResponsePayload
  public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request){
    GetUserResponse response = new GetUserResponse();
    response.setUser(userService.getUsers(request.getName()));
    return response;
  }

}
