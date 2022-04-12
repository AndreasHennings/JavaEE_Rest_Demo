# JavaEE_Rest_Demo

This is a demonstration on how to implement a REST Api in Java EE.

1. Prerequesites
- This application was written and tested using Intellij Idea Ultimate 2021.3 as an IDE. While it may work in other IDEs, it has only been tested in Intellij, so
using other IDEs may or may not work.
- As an application server I chose to use Apache TomEE 9.0.12, which has to be installed and configured in order to run the application successfully. Again, other
application servers may work but may require further configuration.

2. Application architecture
The source code of this application is structured in 3 layers: entity, persistence and api. 
- Entity contains a class of a customer that provides methods of accessing
the entities fields, which are data that can be associated with a customer: firstname, lastname, email etc. Individual entities can be distinguished by a field named
"customerId" which becomes important in the api layer.
- Persistence is a representation of a DB class, but does not actually connect to a database. Instead, entities are stored in a List. The CustomerDB class holds this list
and provides basic methods to interact with the database based on CRUD: create, read, update and delete.
- Api consists of two classes: ApiPath that identifies the application path that serves as the base URI for all resource URIs provided by Path.
CustomerRest provides Api endpoints that can be reached by a HTTP request. Again, basic CRUD operations of interacting with a database have been implemented here.
Http requests to the Api endpoints can be made using standard GET, POST, PUT and DELETE operations. 

3. Usage
After downloading, unzipping and opening the project in an IDE, the server must be configured. The project uses JDK 11 and as an artifact for deployment the 'war exploded' configuration should be chosen. A starting url for the server would be "http://localhost:8080/Rest_Demo3_war_exploded/api/management/allCustomers", which will initially output an empty list.
For testing purposes, Api calls can be created using an online api testing tool like reqbin.com. Details on how to craft api calls to the implemented endpoints can be found in the CustomerRest class. Please note that while delete and find methods use the aforementioned customerID as a param, the other methods (create and update) require a JSON representation of the new entity in the requests body. Also note that (with the exception of "find") all api calls will return a full list of the databases content. This behavior makes the application easier for testing purposes since all changes can be viewed directly after each operation.
