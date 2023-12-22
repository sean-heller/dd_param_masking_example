package ddexample.resources;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Path("/people/{personId}/test/{anotherId}")
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {
    @POST
    public void postPerson(@PathParam("personId") String personId, @PathParam("anotherId") String anotherId) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("http://localhost:8080/people/" + personId + "/test/" + anotherId))
                .GET()
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        String responseBody = response.body();
        int responseStatusCode = response.statusCode();

        System.out.println("httpGetRequest: " + responseBody);
        System.out.println("httpGetRequest status code: " + responseStatusCode);
    }

    @GET
    public void getPersonTwo(@PathParam("personId") String personId, @PathParam("anotherId") String anotherId) {
        System.out.println(personId);
        System.out.println(anotherId);
    }
}