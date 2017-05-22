package fi.soranko.kalle;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/fizzbuzzresource")
public class FizzBuzzResource {

    @GET
    @Produces("text/plain")
    @Path("/{luku}")
    public String fizzBuzz(@PathParam(value = "luku") String luku) {
        StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(luku);
        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) {
                sb.append("FizzBuzz ");
            } else if (i % 3 == 0) {
                sb.append("Fizz ");
            } else if (i % 5 == 0) {
                sb.append("Buzz ");
            } else {
                sb.append(i + " ");
            }
        }
        return sb.toString().trim();
    }

}
