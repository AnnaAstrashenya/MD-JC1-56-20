package tasks07;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlightTimetable implements Serializable {
    public static final long serialVersionUID = -4626951545348358730L;

    private List<Airline> airlines;

    public FlightTimetable() {
        airlines = new ArrayList<>();
    }


    public List<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }

  public boolean add(Airline airline) {

		return airlines.add(airline);
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightTimetable flightTimetable = (FlightTimetable) o;
        return Objects.equals(airlines, flightTimetable.airlines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airlines);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airlines=" + airlines +
                '}';
    }

}
