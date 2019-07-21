package com.soapboxrace.core.api;

import com.soapboxrace.core.api.util.Secured;
import com.soapboxrace.jaxb.http.ArrayOfLong;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/getblockeduserlist")
public class GetBlockedUserList {

    @GET
    @Secured
    @Produces(MediaType.APPLICATION_XML)
    public ArrayOfLong getBlockedUserList() {
        return new ArrayOfLong();
    }
}
