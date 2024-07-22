### Table of Contents ###
### Overview ###
* Technologies Used
* Project Structure

### Technologies Used ###
* Java
* Spring Boot
* Spring Data JPA / Hibernate
* PostgreSQL pg Admin 4

  ## Project Structure ##
  This project demonstrate the 2 approaches of implementing projection in Hibernate using Spring Boot which can be done using:
  * DTO class (Data Transfer Object)projection : it's a powerful way to shape the data your application needs to fetch from the database, this approach is efficinet for read-only operations.
  * Interface projection: Interface-based projection is another way to implement projection in Hibernate Spring Boot, it allows us to define an interface that includes getter methods for each attribite your projection should contain, and at runtime, Spring Data JPA generates a class that implements that interface, however, when using native queries, we need to ensure that the alias of each column can be mapped to the correspondiing getter method.
 
  WHen using native queries, there are some limitations.
    
