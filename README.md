# Student Marks Portal (Java + HTML/CSS)

A responsive college project with a Java Spring Boot backend, HTML/CSS frontend, H2 file database, and an admin area to add/delete student records.

## Features
- Add multiple students and three subject marks
- Calculates total out of 300 and average percentage
- Uses Java `if/else` control flow to assign grades
- Fails a student if any subject mark is below 35
- Admin panel can add and delete records
- Responsive layout for phone, laptop, and desktop
- Records are stored in a local H2 database file

## Requirements
- Java 17 or later
- Maven 3.6+
- Internet connection the first time to download Maven dependencies

## Run on your computer
1. Extract this ZIP.
2. Open a terminal/command prompt in the `student-marks-portal` folder.
3. Run: `mvn spring-boot:run`
4. Open `http://localhost:8080` in your browser.

## Important: public URL
`localhost` works only on the computer running the app. To get a URL that works on your phone and college PC, deploy this Java app to a Java-compatible host (for example, Render or Railway). Upload the project to GitHub, create a web service on your host, use build command `mvn clean package` and start command `java -jar target/student-marks-portal-1.0.0.jar` (some hosts may require `./mvnw` or a Dockerfile). Set Java 17. The host will provide a public HTTPS URL.

## Admin note
This is a college-project demo, not a production-secure admin system. The `/admin` routes are not password-protected in this starter version. Do not enter real or confidential student data on a public deployment until authentication is added.
