# RPS-API

Hello and welcome to this simple rock, paper, scissors API!

To use the API, please follow the steps below. 
1. Clone this repository: <br/>
git clone https://github.com/loofv/RPS-API.git <br/>
2. Change directory into the RPS-API directory that you got from cloning the repository.<br/>
3. Start the server by running the command below:<br/>
./ gradlew bootRun<br/>
4. Post a request to the server to play the game! This can be done with curl for instance. Example request:<br/>
curl -H "Content-Type: application/json" -X POST -d '{
    "handShape": "ROCK"
}' http://localhost:8080/play<br/>
5. The server returns the game result. Enjoy! Note: The game accepts "ROCK", "PAPER" and "SCISSORS" as valid hand shapes.
 
