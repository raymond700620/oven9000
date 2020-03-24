public class Oven9000 {
    /*

        0x01 - getCurrentTemperature
        0x02 - getGoalTemperature
        0x03 - isTurnedOn
     */
    public int in(int i) {
        return 1;
    }

    /*
        0x04 - turnHeater
        true - On
        false - off
     */
    public void out(int i, boolean b) {
        if (b) {
            System.out.println("======>turnHeaterOn");
        }
        else {
            System.out.println("======>turnHeaterOff");
        }

    }
}
