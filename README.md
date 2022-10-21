# FleetStudio

STEP 1:

Build the application by pressing install button in maven

GoTo FleetStudioApplication.class file and run the play button inorder to run the application

STEP 2:

_**using the data from the data.json file**_
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

STEP 4:

GOTO PostMan 

SELECT GET AND HIT
http://localhost:3000/suggest/Jackson
http://localhost:3000/suggest/Autauga
http://localhost:3000/suggest/Autauga/AL

NO NEED TO ADD ANY DATA IN THE BODY