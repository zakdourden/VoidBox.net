package rest;

import javax.ws.rs.ApplicationPath;


@ApplicationPath(RestServiceApplication.REST_SERVICE_BASE_URI)
public class RestServiceApplication extends javax.ws.rs.core.Application {
          public final static String REST_SERVICE_BASE_URI = "rs";

}