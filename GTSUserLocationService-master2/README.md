
Table of Contents

• Basic Overview

• Why should i use it

• Deployment

• Installation

• Usage

• Security Perspective

Basic Overview
• Here is the Trainer module, we uses Spring framework, Spring Boot, Spring Security, MySQL, Hibernate ,JPA and Postman.

What should i use
• JDK 1.8

• Spring Tool Suit 4

• MySQL 8.0 https://www.youtube.com/watch?v=GIRcpjg-3Eg

• Postman 7

Install MySQL and create table

               create table users 
                  (
                  tcit varchar(256) ,
                  tsdistrict       varchar(256)  ,
                  tstate    varchar(256) ,
                  tpin        varchar(256) ,
                  tcontactno   varchar(256) unique);
•Contactno should be unique 

Pull the Project from Github and run it

Go to Github https://github.com/kabitagorai2210/GTSProfileService and pull the project in the Spring Tool Suit.

In spring Tool Suit right click on the project name -> Maven -> Update project Then manven will fetch the requeired Jars from the centeral repository.

In the Project open application.properties -> change the credentials for database

Go to project name right click -> Run as -> Spring boot app

At this time MySQL should also be running so that we can insert data into Table through Psotman calls Postman calls

• Create User through Postman • contactno.

Request
choose : POST localhost:9990/users/create

     {
    "tcity": "malda",
    "tdistrict": "mak",
    "tstate": "bak",
    "tcontactno": "9474775747",
    "tpin": "9998"
}
Response
     {
    "tcity": "malda",
    "tdistrict": "mak",
    "tstate": "bak",
    "tcontactno": "9474775747",
    "tpin": "9998"
}
• Update User through Postman
• while updating id, email must be same we can not update them only name and password can be updated

choose : PUT localhost:9990/users/update
Request
     {
    "tcity": "malda",
    "tdistrict": "ma",
    "tstate": "ba",
    "tcontactno": "9474775747",
    "tpin": "9998"
}
Response
  {
    "tcity": "malda",
    "tdistrict": "ma",
    "tstate": "ba",
    "tcontactno": "9474775747",
    "tpin": "9998"
}
NB-ALL DATA CANBE UPDATED EXCEPT CONTACT NO WHICH IS UNIQUE.
• Retrive all users through Postman
• choose : GET localhost:9990/users/getAll

• Retrive single user by Contact No through Postman
• choose : GET localhost:9990/users/getUser/8371845880

• Delete single user by Contact No through Postman
• choose : DELETE localhost:9990/users/delete/8371845880         