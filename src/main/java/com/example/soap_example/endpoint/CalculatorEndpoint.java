package com.example.soap_example.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.soap_example.endpoint.calculator.AddRequest;
import com.example.soap_example.endpoint.calculator.AddResponse;

@Endpoint
public class CalculatorEndpoint {

    @PayloadRoot(namespace = "http://example.com/calculator", localPart = "addRequest")
    @ResponsePayload
    public AddResponse add(@RequestPayload AddRequest request) {
        AddResponse response = new AddResponse();
        response.setResult(request.getA() + request.getB());
        return response;
    }
}
