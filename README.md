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
CustomerRest provides Api endpoints that can be reached by a HTTP request. Again, basic operations of interacting with a database have been implemented here.
