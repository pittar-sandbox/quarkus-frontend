package ca.pitt.demo.quarkus.restclient;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import ca.pitt.demo.quarkus.dto.Numbers;

@Path("/")
@Produces("application/json")
@Consumes("application/json")
@RegisterRestClient(configKey="channel.client")
public interface ChannelService {
    
    @POST
    @ClientHeaderParam(name="Ce-Id", value="math")
    @ClientHeaderParam(name="Ce-Specversion", value="1.0")
    @ClientHeaderParam(name="Ce-Service", value="math")
    @ClientHeaderParam(name="Ce-Source", value="frontend")
    void postCalculation(@HeaderParam("Ce-Operation") String operation, Numbers numbers);

}
