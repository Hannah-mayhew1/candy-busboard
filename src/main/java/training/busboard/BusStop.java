package training.busboard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.MediaType;
import java.util.Comparator;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class BusStop {

    private String naptanId;
    private String commonName;
    private double distance;
    private double lat;
    private double lon;

    private BusStop(){}

    public String getNaptanId() {
        return naptanId;
    }

    public String getCommonName() {
        return commonName;
    }

    public double getDistance() {
        return distance;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getGoogleMapsLink() {
        return "https://www.google.com/maps/search/?api=1&query=" + lat + "," + lon;
    }
}
