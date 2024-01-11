### What's this?
It's a REST API that uses Springboot, Flyway, and H2 database. 
When starting locally, this app uses port 8087, if that is already taken in your machine, you need to change it in application.yml. 


ERD:
![image](https://github.com/HRTBCP/Music/assets/40878060/61e5eeba-6d0a-4507-a8a3-4cbe0f669ad6)


### API Documentation

* [swagger] (http://localhost:8087/music/swagger-ui/index.html#/)
* [hal explorer] (http://localhost:8087/music/explorer/index.html#uri=/music/)
  
### H2 Database
* [h2 console] (http://localhost:8087/music/h2-console/)
*  username: sa, password: password

  
** Use projections to get more details in the response
  * http://localhost:8087/music/cds?projection=cdDetails
  * http://localhost:8087/music/artists/<artistid>/cds?projection=cdDetails
* available projections
  * artistDetails
  * cdDetails
  * trackDetails





### Your mission:
* Improve codes in ArtistService.getMostProductiveArtists()
* Create a new GET endpoint called in MusicController.java using the path `/artists/mostProductiveSQL`,
  * Use Spring JPA Native Query(https://www.baeldung.com/spring-data-jpa-query)
  * This should produce the same output as `/artists/mostProductive` endpoint
  
