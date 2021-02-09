package tasks07;

import java.util.List;

public class PrintAir {

    public void printTimetable(String message,List<Airline> airlines) {
        System.out.println(message + ":");
        for(Airline airline : airlines) {
            System.out.print(airline.getDestination() + " ||" + "номер рейса: " + airline.getFlightNumber() + "||" + "время вылета: " + airline.getDepartureTime());
            System.out.println();
        }
        System.out.print("__________________________________");
        System.out.println();
    }



}
