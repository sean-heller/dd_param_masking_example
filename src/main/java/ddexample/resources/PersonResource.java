package ddexample.resources;



import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;


@Path("/people/{personId}")
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {


    @POST
    public void getPerson(@PathParam("personId") String personId) {
        System.out.println(personId);
    }
}