package ca.pitt.demo.quarkus.web;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import ca.pitt.demo.quarkus.dto.Calculation;
import ca.pitt.demo.quarkus.dto.Numbers;
import ca.pitt.demo.quarkus.restclient.ChannelService;

@Path("/calculate")
public class CalcResource {

    @Inject
    @RestClient
    ChannelService channelService;
    
    @POST
    public String calc(Calculation calculation) {

        Numbers numbers = new Numbers(Double.valueOf(calculation.getX()), Double.valueOf(calculation.getY()));

        return "Done.";
    }

}
