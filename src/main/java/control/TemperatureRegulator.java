package control;

import device.Oven9000;

public class TemperatureRegulator {
    public static void main(String[] argv) throws Exception {
        TemperatureRegulator r = new TemperatureRegulator();
        //Oven oven = new Oven9000();
        Oven oven = (Oven) Class.forName("device.Oven9000").getDeclaredConstructor().newInstance();
        r.regulateTemp(oven);
    }

    void regulateTemp(Oven o) {
        int goalT, t, s;

        while (true) {

            goalT = o.getGoalTemperature(); //getGoal
            t = o.getCurrentTemperature(); //getCurrent
            s = o.isTurnOn(); //isOn --> isTemperatureControlOn/isOvenOn

            if (s == 1){
                if (t < goalT) {
                    o.turnHeaterOn(); //turnHeatOn
                } else {
                    o.turnHeaterOff(); //TurnHeatOff
                }
            }
        }
    }

}
