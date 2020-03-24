public class TemperatureRegulator {
    public static void main(String[] argv) {
        TemperatureRegulator r = new TemperatureRegulator();
        r.regulateTemp();
    }

    void regulateTemp() {
        int goalT, t, s;

        while (true) {
            Oven9000 o = new Oven9000();

            goalT = o.in(0x02); //getGoal
            t = o.in(0x01); //getCurrent
            s = o.in(0x03); //isOn --> isTemperatureControlOn/isOvenOn

            if (s == 1){
                if (t < goalT) {
                    o.out(0x04, true); //turnHeatOn
                } else {
                    o.out(0x04, false); //TurnHeatOff
                }
            }
        }
    }

}
