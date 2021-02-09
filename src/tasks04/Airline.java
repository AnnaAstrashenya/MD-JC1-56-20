/*
Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и
get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline,
с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные
на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
package tasks07;

import java.io.Serializable;
import java.util.Objects;

public class Airline implements Serializable {
    private static final long serialVersionUID = 4254060149606313087L;

    private String destination;
    private String flightNumber;
    private String typeOfPLane;
    private String departureTime;
    private String dayOfWeek;

    public Airline() {
    }

    public Airline(String destination, String flightNumber, String typeOfPLane, String departureTime, String dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.typeOfPLane = typeOfPLane;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTypeOfPLane() {
        return typeOfPLane;
    }

    public void setTypeOfPLane(String typeOfPLane) {
        this.typeOfPLane = typeOfPLane;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(destination, airline.destination) &&
                Objects.equals(flightNumber, airline.flightNumber) &&
                Objects.equals(typeOfPLane, airline.typeOfPLane) &&
                Objects.equals(departureTime, airline.departureTime) &&
                Objects.equals(dayOfWeek, airline.dayOfWeek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, flightNumber, typeOfPLane, departureTime, dayOfWeek);
    }

    @Override
    public String toString() {
        return "Airline:" +
                "destination='" + destination + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", typeOfPLane='" + typeOfPLane + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                '.';
    }
}
