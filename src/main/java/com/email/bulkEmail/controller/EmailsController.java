package com.email.bulkEmail.controller;

import com.email.bulkEmail.model.EmailDetails;
import com.email.bulkEmail.service.SendEmailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@AllArgsConstructor
public class EmailsController {

    private final SendEmailService service;

    @PostMapping(value = "/sendSingleEmail")
    public String sendSingleEmail(@RequestBody EmailDetails emailDetails) throws IOException {
        return service.sendEmail(emailDetails);
    }

    @GetMapping("/get")
    public String send() {
        return "Hello";
    }
}
