package com.enicar.traffictunisia;

import SOAPServices.SOAP;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.xml.ws.Endpoint;

/**
 * Configures Jakarta RESTful Web Services for the application.
 * @author Juneau
 */
@ApplicationPath("resources")
public class JakartaRestConfiguration extends Application {
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String url = "http://0.0.0.0:9000/";
        Endpoint.publish(url, new SOAP());
        System.out.println("web service deploy sur " + url);


    }

    
}
