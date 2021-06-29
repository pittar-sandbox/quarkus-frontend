package ca.pitt.demo.quarkus.web;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import ca.pitt.demo.quarkus.dto.Calculation;
import ca.pitt.demo.quarkus.restclient.ChannelService;

@Path("/calculate")
public class CalcResource {

    @Inject
    @RestClient
    ChannelService channelService;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String calc(Calculation calculation) {
        String data = "{\"x\": " + calculation.getX() + ", \"y\": " + calculation.getX() + "}";
        channelService.postCalculation(calculation.getOp(), data);
        // if ("+".equals(calculation.getOp())) {
        //     channelService.add(data);
        // } else {
        //     channelService.multiply(data);
        // }        

        return "Done.";
    }

}
