import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.net.URI;

public class Aplicacao {
    public static void main(String[] args) {
        ResourceConfig configuracao = new ResourceConfig().packages("recursos");
        URI endereco = URI.create("http://127.0.0.1:8080/api/v1");

        HttpServer servidor = GrizzlyHttpServerFactory.createHttpServer(endereco, configuracao);
    }
}
