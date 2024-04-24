package recursos;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/olamundo")
public class OlaMundo {
    @Path("/exibir")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String exibir(){
        return "Olá Mundo";
    }
}
