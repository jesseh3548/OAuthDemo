authentication&Resource server port 8080
client port 8081

1.**directly access database**:http://localhost:8080/account/info/testAccount1/
fail unauthorized

2.**get authentication code when unlogged**:http://localhost:8080/oauth/authorize?client_id=client1&response_type=code&redirect_uri=http://localhost:8081/client/account/redirect
due to no logged account,  302 to login page

3.**username & password** admin 123456

4.**access database with authentication code (access token)**
http://localhost:8080/account/info/testAccount1?access_token=your_access_token_here

5.**access simple in-memory database successfully**
