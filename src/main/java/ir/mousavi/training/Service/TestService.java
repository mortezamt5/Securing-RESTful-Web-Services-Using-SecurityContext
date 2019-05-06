package ir.mousavi.training.Service;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;

@Path("/test")
@Stateless(name = "JaxRSStatelessEJB")
public class TestService {

    @GET
    @Produces("text/plain;charset=UTF-8")
    @Path("/sayHello")
    public String getMsg(@Context SecurityContext sc) {

        if (sc.isUserInRole("admin"))
            return "Hello You are Admin . ";
        throw new SecurityException("user is unauthorized");
    }
}
