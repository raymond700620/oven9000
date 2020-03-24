package device;

import control.Oven;

public class Oven9000 implements Oven {
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

    @Override
    public int getCurrentTemperature() {
        return in(0x01);
    }

    @Override
    public int getGoalTemperature() {
        return in(0x02);
    }

    @Override
    public int isTurnOn() {
        return in(0x03);
    }

    @Override
    public void turnHeaterOn() {
        out(0x04,true);
    }

    @Override
    public void turnHeaterOff() {
        out(0x04,false);
    }



}
