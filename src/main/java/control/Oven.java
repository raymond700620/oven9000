package control;

public interface Oven {
    //For sensor
    int getCurrentTemperature();

    int getGoalTemperature();

    int isTurnOn();

    //For heater
    void turnHeaterOn();

    void turnHeaterOff();
}
