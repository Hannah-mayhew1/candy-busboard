package training.busboard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//tells jersey to ignore anything that isn't field below
@JsonIgnoreProperties(ignoreUnknown = true)

public class ArrivalPrediction {

    private String lineName;
    private String destinationName;
    private int timeToStation;
    // Jersey doesn't need parameters it works like magic!
    private ArrivalPrediction (){}

    public String getLineName() {
        return lineName;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public int getTimeToStation() {
        return timeToStation;
    }

    public String getNicelyFormattedTimeToStation() {
        int minutesToStation = (timeToStation + 30) / 60;
        if (minutesToStation == 0) {
            return "Due";
        } else if (minutesToStation == 1) {
            return "1 minute";
        } else {
            return minutesToStation + " minutes";
        }
    }
}

