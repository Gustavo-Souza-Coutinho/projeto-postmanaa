package recursos;

import jakarta.ws.rs.*;

@Path("/calculadoras")
public class CalculadoraRecurso {
    @Path("/somar/{a}/{b}")
    @GET
    public double somar (@PathParam("a") double x,
                         @PathParam("b") double y) {
        double resultado = x + y;
        return resultado;
    }

    @Path(("/tintas/{a}/{b}"))
    @POST
    public double tintas (@PathParam("a") double largura,
                         @PathParam("b") double altura) {
        double resultadot = (largura * altura) / 2;
        return resultadot;
    }
    @Path(("/alugueis/{a}/{b}"))
    @PUT
    public double alugueis (@PathParam("a") double km,
                          @PathParam("b") double dias) {
        double custoPorDia = 90.0;
        double custoPorKm = 0.20;
        double resultado = (custoPorDia * dias) + (custoPorKm * km);
        return resultado;
    }
    @Path("/passagens/{a}")
    @GET
    public double passagens (@PathParam("a") double distancia) {
        double custoPorKmCurta = 0.50;
        double custoPorKmLonga = 0.45;
        double resultadop;

        if (distancia <= 200) {
            resultadop = custoPorKmCurta * distancia;
        } else {
            resultadop = custoPorKmLonga * distancia;
        }

        return resultadop;
    }
}
