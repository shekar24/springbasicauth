package com.basicauth.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class UserResource {

    @GetMapping(path = "/user")
    public String getUser() {
        return "Request received";
    }
}
