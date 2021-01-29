package com.chicos.ATGRegistration;

import java.util.*; 
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with HTTP Trigger.
 */
public class ATGPostUserAPI {
    /**
     * This function listens at endpoint "/api/ATGPostUserAPI". Two ways to invoke it using "curl" command in bash:
     * 1. curl -d "HTTP Body" {your host}/api/ATGPostUserAPI
     * 2. curl {your host}/api/ATGPostUserAPI?name=HTTP%20Query
     */
    @FunctionName("ATGPostUserAPI")
    public HttpResponseMessage run(
            @HttpTrigger(name = "req", 
                methods = {HttpMethod.POST}, 
                authLevel = AuthorizationLevel.ANONYMOUS)
            HttpRequestMessage<Optional<Response>> request,
            final ExecutionContext context) {
        
        // Item list
        context.getLogger().info("Request body is: " + request.getBody().orElse(null));
    
        // Check request body
        if (!request.getBody().isPresent()) {
            return request.createResponseBuilder(HttpStatus.BAD_REQUEST)
                            .body("Document not found.")
                            .build();
        } 
        else {
            // return JSON from to the client
            // Generate document
            final Response body = request.getBody().get();
            //Build Response
            return request.createResponseBuilder(HttpStatus.OK)
                            .header("Content-Type", "application/json")
                            .body(body)
                            .build();
        }
    }
}
