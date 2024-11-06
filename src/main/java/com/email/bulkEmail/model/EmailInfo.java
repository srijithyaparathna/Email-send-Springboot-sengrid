package com.email.bulkEmail.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailInfo {

    private String name;
    private String emailAddress;

}

//{
//        "fromAddress": {
//        "name": "test srijith",
//        "emailAddress": "prasanja96@gmail.com"
//        },
//        "toAddress": {
//        "name": "kb",
//        "emailAddress": "ymsy14539@gmail.com"
//        },
//        "subject": "Hello sendGrid",
//        "emailBody": "test again "
//        }
