# Voting System

## Overview

The Voting System is a web application designed to manage voters and elections. Built using Spring MVC and Thymeleaf, this application allows administrators to manage voter information and perform CRUD operations efficiently.

## Features

- **Voter Management**: Add, update, delete, and list voters.
- **User Authentication**: Secure login for administrators.
- **Responsive Design**: User-friendly interface that works on all devices.

## Technologies Used

- **Backend**: Java, Spring MVC, Spring Boot
- **Frontend**: Thymeleaf, HTML5, CSS3, Bootstrap
- **Database**: MySQL
- **Build Tool**: Maven

## Project Structure

voting-system/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── votingsystem/
│ │ │ ├── VotingSystemApplication.java
│ │ │ ├── controller/
│ │ │ │ └── VoterController.java
| | | | └──AdminLoginController
| | | | └──IndexController
| | | | └──VoterActionController
| | | | └──VoterController
| | | | └──VoterLoginController
│ │ │ ├── entity/
│ │ │ │ └── Admin.java
│ │ │ │ └── AdminLogin.java
│ │ │ │ └── Profile.java
│ │ │ │ └── Voter.java
│ │ │ │ └── VoterLogin.java
│ │ │ ├── repository/
│ │ │ │ └── AdminLoginRepository.java
│ │ │ │ └── AdminRepository.java
│ │ │ │ └── ProfileRepository.java
│ │ │ │ └── VoterLoginRepository.java
│ │ │ │ └── VoterRepository.java
│ │ │ ├── service/
│ │ │ └── AdminLoginService.java
│ │ │ └── AdminLoginServiceImpl.java
│ │ │ └── AdminService.java
│ │ │ └── AdminServiceImpl.java
│ │ │ └── ProfileService.java
│ │ │ └── VoterService.java
│ │ │ └── VoterService.java
│ │ │ └── VoterService.java
│ │ ├── resources/
│ │ │ ├── application.properties
│ │ │ ├── static/
│ │ │ └── templates/
│ │ │ ├── voterList.html
│ │ │ └── voterUpdate.html
│ ├── test/
│ │ └── java/
│ │ └── com/
│ │ └── votingsystem/
│ │ └── VotingSystemApplicationTests.java
└── pom.xml

## Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/voting-system.git
    cd voting-system
    ```

2. **Setup the database:**
    - Create a MySQL database named `voting_system`.
    - Update the `application.properties` file with your database credentials.

3. **Build and run the application:**
    ```bash
    mvn spring-boot:run
    ```

4. **Access the application:**
    Open your web browser and navigate to `http://localhost:8080`.

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.
