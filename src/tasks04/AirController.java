package tasks07;


import java.util.ArrayList;
import java.util.List;


public class AirController {

    public List<Airline> outputDestination (List<Airline>  airlineList, String pointOfDestination) {
        List<Airline> result = new ArrayList<Airline>();

        for (Airline currentAirline : airlineList) {
            String currentDestination = currentAirline.getDestination();

            if (currentDestination.equals(pointOfDestination)) {
                result.add(currentAirline);
            }
        }
        return result;
    }

    public List<Airline> outputByDay (List<Airline>  airlineList, String dayOfWeek) {
        List<Airline> result = new ArrayList<Airline>();

        for (Airline currentAirline : airlineList) {
            String currentDayOfWeek = currentAirline.getDayOfWeek();

            if (currentDayOfWeek.equals(dayOfWeek)) {
                result.add(currentAirline);
            }
        }
        return result;
    }

    public List<Airline> outputByDayAndTime (List<Airline>  airlineList, String dayOfWeek , String departureTime) {
        List<Airline> result = new ArrayList<Airline>();

        for (Airline currentAirline : airlineList) {
            String currentDepartureTime = currentAirline.getDepartureTime();
            String currentDayOfWeek = currentAirline.getDayOfWeek();

            if (currentDepartureTime.compareTo(departureTime) >= 0 && currentDayOfWeek.equals(dayOfWeek)) {
                result.add(currentAirline);
            }
        }
        return result;
    }



}
