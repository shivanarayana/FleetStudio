# FleetStudio

STEP 1:

Build the application by pressing install button in maven

GoTo FleetStudioApplication.class file and run the play button inorder to run the application

STEP 2:

GOTO POSTMAN
Select **POST** method in it
set variable as "http://localhost:3000/add/countries"
copy paste the entire data.json as it is in body
Choose Raw and SELECT **JSON**
Then
hit endpoint in post man

Records will be saved in the H2 DATABASE

STEP 3: Data saved can be looked here
http://localhost:3000/h2-console/login.do?

url = jdbc:h2:mem:fleetstudio
un: shiva
pwd: password





Backend Coding Exercise:

Build REST API for the included Open API spec (spec.yaml) using the data from the data.json file.

Goal:

http://localhost:3000/h2-console/login.jsp?jsessionid=e9668365513f46a72d34976708adb703

This API endpoint would be used for type-ahead suggestions for US counties. It should be able to return a set of matching counties based on a user provided fragment of a county name and/or state. See the examples in the provided Open API spec.
The ordering of the results is up to you.

These instructions do not specify every little detail you should consider. This is done on purpose to test your ability to analyze a problem and come up with a reasonable approach. Thoroughness and attention to detail are some of the most important qualities we're looking for. Make sure to consider best practices for a production REST API.

We would like to see you use a database for this. Preferably use in-memory DB, and load it with the data from data.json so it is available when the application runs.
Use whatever libraries you are comfortable with.
Don't forget to include tests using your preferred methodology.

Submitting your work:

Fully documented README file with has instructions on how to setup, build and run the project locally


Compress your source code as a zip archive and either send it to us, or send us a link where we can download it. Sharing via Dropbox, Google Drive, or similar should be fine.
