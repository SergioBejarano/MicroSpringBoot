package co.edu.escuelaing.httpserver;

import java.net.URI;

/**
 *
 * @author sergio.bejarano-r
 */
public class HttpRequest {

    URI requri = null;

    HttpRequest(URI requri) {
        this.requri = requri;
    }

    public String getValue(String paramName) {

        String paramValue = requri.getQuery().split("=")[1];
        return paramValue;
    }

}
