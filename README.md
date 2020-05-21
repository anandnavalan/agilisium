# agilisium
AGILISIUM Product Service using Spring Boot which secured with Basic Authentication
## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
* Java 8
* Maven
* Postman

### Dependencies
````
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
````

### API Endpoints
* {domain}/api/getconfigdetails
* {domain}/api/getproductdetails

### Instructions
* Get Method for API endpoints 
  {domain}/api/getconfigdetails
  {domain}/api/getproductdetails

Both the endpoints are secured with basic authentication using spring boot security.
* {domain}/api/getconfigdetails
  Secured and accessed with username and password as admin and password
* {domain}/api/getproductdetails
  Secured and accessed with username and password as user and password

Note:
  If user tries to access the resource with invalid username and password then user will get response as 401 Unauthorized
 
#### Sample Response

Success Response for {domain}/api/getconfigdetails with Status as 200 (HTTPSTATUS.OK)
````
  [
      {
          "name": "config1",
          "value": "Value of Config 1"
      },
      {
          "name": "config2",
          "value": "Value of Config 2"
      },
      {
          "name": "config3",
          "value": "Value of Config 3"
      }
  ]
````
Success Response for {domain}/api/getproductdetails with Status as 200 (HTTPSTATUS.OK)
````
  [
      {
          "id": 1,
          "name": "Iphone 11 Pro Max",
          "price": 65000.0
      },
      {
          "id": 2,
          "name": "Oneplus 8 Pro",
          "price": 65000.0
      },
      {
          "id": 3,
          "name": "Samsung S20",
          "price": 79999.0
      }
  ]
````

Error Response  with Status as 401 (HTTPSTATUS.UNAUTHORIZED)
````
  {
    "timestamp": "2020-05-21T04:57:44.225+00:00",
    "status": 401,
    "error": "Unauthorized",
    "message": "Unauthorized",
    "path": "/api/getconfigdetails"
  }
````

### Sample API Response Screenshots

* Config Response with Basic Authentication
![alt text](https://github.com/anandnavalan/agilisium/blob/master/src/main/resources/static/img/config-response-with-auth.png?raw=true)


* Config Response without Basic Authentication
![alt text](https://github.com/anandnavalan/agilisium/blob/master/src/main/resources/static/img/config-response-without-auth.png?raw=true)

* Product Response with Basic Authentication
![alt text](https://github.com/anandnavalan/agilisium/blob/master/src/main/resources/static/img/product-response-with-auth.png?raw=true)


* Product Response without Basic Authentication
![alt text](https://github.com/anandnavalan/agilisium/blob/master/src/main/resources/static/img/product-response-without-auth.png?raw=true)
