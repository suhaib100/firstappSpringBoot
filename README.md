FirstAppSpringBoot
Welcome to FirstAppSpringBoot! This repository contains a simple Spring Boot project that serves as a starting point for building Java web applications. It showcases basic features of Spring Boot and provides a foundation for further development.

Overview
FirstAppSpringBoot demonstrates how to set up a Spring Boot application with minimal configuration. It includes a basic RESTful endpoint and serves static web content using Thymeleaf templates.

Features
Simple Spring Boot application setup.
RESTful API endpoint for demonstration.
Static web content served using Thymeleaf templates.
Installation
To run FirstAppSpringBoot locally, follow these steps:

Clone this repository to your local machine.
Navigate to the project directory.
Run the following command to start the application:
bash
Copy code
./mvnw spring-boot:run
Access the application at http://localhost:8080.
Usage
Once the application is running, you can access the following endpoints:

GET /: Displays a welcome message.
GET /api/hello: Returns a simple JSON response.
Example:

Accessing the welcome message:

bash
Copy code
curl http://localhost:8080/
Output:

plaintext
Copy code
Welcome to FirstAppSpringBoot!
Accessing the API endpoint:

bash
Copy code
curl http://localhost:8080/api/hello
Output:

json
Copy code
{"message":"Hello, world!"}
Configuration
The project uses default configurations provided by Spring Boot. You can customize application properties in the application.properties file if needed.

Examples
Check out the src/main/java/com/example/firstapp/controller/HelloController.java file for the implementation of the /api/hello endpoint.

Contributing
Contributions to FirstAppSpringBoot are welcome! Please refer to the contribution guidelines for more information.

License
This project is licensed under the MIT License. See the LICENSE file for details.

Support
For support or questions, please open an issue on the GitHub repository.

Acknowledgments
Special thanks to the Spring Boot community for providing excellent documentation and resources.

Additional Information
For more information on Spring Boot, visit the official documentation:

Spring Boot Documentation
