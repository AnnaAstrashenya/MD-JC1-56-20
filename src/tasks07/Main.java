package tasks07;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        FlightTimetable f1 = new FlightTimetable();
        AirController airController = new AirController();
        PrintAir print = new PrintAir();

        Airline a1 = new Airline("Париж",
                "12С87",
                "Airbus A220",
                "18.00",
                "понедельник");
        Airline a2 = new Airline("Париж",
                "10H05",
                "Airbus A220",
                "6.00",
                "понедельник");
        Airline a3 = new Airline("Лондон",
                "40R89",
                "<Boeing717",
                "08.00",
                "вторник");
        Airline a4 = new Airline("Варшава",
                "62R78",
                "<Boeing777",
                "10.00",
                "вторник");
        Airline a5 = new Airline("Прага",
                "33V13",
                "<Boeing737",
                "11.00",
                "вторник");

        Airline a6 = new Airline("Осло",
                "74F29",
                "<Boeing737",
                "07.00",
                "среда");

        f1.add(a1);
        f1.add(a2);
        f1.add(a3);
        f1.add(a4);
        f1.add(a5);
        f1.add(a6);

        List<Airline> airlines;

        airlines = airController.outputDestination(f1.getAirlines(), "Париж");
        print.printTimetable("Пункт назначения - Париж", airlines);

        airlines = airController.outputByDay(f1.getAirlines(), "вторник");
        print.printTimetable("День недели - вторник", airlines);

        airlines = airController.outputByDayAndTime(f1.getAirlines(),
                "вторник",
                "09.00");

        print.printTimetable("День недели - вторник, после 09.00", airlines);










    }

}
