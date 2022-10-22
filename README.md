# FleetStudio

STEP 1:

Build the application by pressing install button in maven

GoTo FleetStudioApplication.class file and run the play button inorder to run the application

**The data given in the data.json file is automatically saved in to h2 database**
<br />
STEP 2: Data saved can be looked here <br />
http://localhost:3000/h2-console/login.do?
<br />
url = jdbc:h2:mem:fleetstudio
un: shiva
pwd: password
<br />
STEP 3:
_**using the data from the data.json file**_<br />
GOTO POSTMAN
Select **POST** method in it<br />
In order to add multiple countries as an alternative
set variable as "http://localhost:3000/add/countries"
In order to add single countries in future<br />
set variable as "http://localhost:3000/add/county" <br />
Choose Raw and SELECT **JSON**
Then
hit endpoint in post man

Records will be saved in the H2 DATABASE
<br />
STEP 4:
GOTO PostMan
<br />
SELECT GET AND HIT
//Using only State <br />
http://localhost:3000/suggest/AL <br />
//Using only the name <br />
http://localhost:3000/suggest/Autauga <br />
//Using Both State and Name in any order <br />
http://localhost:3000/suggest/Autauga/AL <br />
or <br />
http://localhost:3000/suggest/AL/Autauga <br />
//Get all data <br />
http://localhost:3000/listAll <br />

NO NEED TO ADD ANY DATA IN THE BODY