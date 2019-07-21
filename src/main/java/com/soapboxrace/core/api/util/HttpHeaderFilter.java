package com.soapboxrace.core.api.util;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class HttpHeaderFilter implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext request, ContainerResponseContext response) throws IOException {
        System.out.println("[" + request.getMethod() + "] " + request.getUriInfo().getPath() + " " + request.getUriInfo().getRequestUri().getQuery());
        response.getHeaders().add("Connection", "close");
    }
}
