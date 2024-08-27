# Evergreen Estate
## Description
Developed a full-stack real estate web application using Spring Boot for the backend, MySQL for database management, and React for the frontend. Applied SOLID principles to ensure clean, maintainable, and scalable code architecture. Implemented features such as secure user authentication, dynamic property listings, and comprehensive transaction management. The frontend is fully responsive, providing a seamless user experience across devices. Ensured high performance and scalability through optimized backend processes and efficient data handling.
## Table of Contents
- [Screenshots](#screenshots)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)
- [Acknowledgements](#acknowledgements)
## Screenshots
- Click Below to go to YouTube
[![IMAGE ALT TEXT HERE](https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/YouTube_2024.svg/1920px-YouTube_2024.svg.png)](https://www.youtube.com/watch?v=33ruK10ncos)
## Features
- User Registration (Secured Password with Bcrypt)
- Role Based User Login with JWT and Spring Security
- Property Registration
- Property Details Update
- Image Handling (using third party cloud service) for users and properties
- Email Sent on the event of successful purchase

## Technologies Used
- `JavaScript`
- `React`
- `JavaEE`
- `SpringBoot`
- `MySQL`
- `Hibernate + JPA Repository`
- `Spring Security with JWT`
- `Spring Boot Starter Mail`
## Installation
1. Clone the repository: `git clone https://github.com/gauravrathore701/EvergreenEstate.git`
2. Got inside the /frontend folder and run the command `yarn` to install the dependencies
3. Create a `.env` file and put variable `REACT_APP_API_URL=http://localhost:8080` (Note: if you host backend server in some other location than change this URL).
4. Run the project: `yarn start`
## Installation - Backend
1. Open the Backend folder in STS or any other editor you use for JAVA development.
2. Install the required dependencies through maven.
3. Create a `.env` file inside backend and put variables `JWT_SECRET=<Write your 256-bit JWT Secret Key HERE>` & `CLOUDINARY_URL=<To store images you need cloudinary Setup>`
4. Run the Server
## Usage
* This project is pretty simple to use you will get a hang of it very easily.
* Just one info to access admin you need to go to `URL/admin/login`
## Contributing
* If you really wanna contribute to the project drop a mail in the account mentioned below.
## License
Distributed under the MIT License. See `LICENSE` for more information.
## Contact
Gaurav Rathore - `gauravrathore701@gmail.com` 
## Acknowledgements
- [Spring Security Tutorial](https://www.youtube.com/watch?v=29vmP4YLwyo&list=PLxhSr_SLdXGOpdX60nHze41CvExvBOn09)
- [JavaEE 8 Documentation](https://javaee.github.io/javaee-spec/javadocs/)
- [JavaSE 21 Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/index.html)
