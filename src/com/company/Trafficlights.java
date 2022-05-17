package com.company;
import java.security.PublicKey;

enum Lights{
    RED,YELLOW,GREEN
}
class Simulation_56415{
    //variable that stores the current light
    Lights Ls = Lights.RED;
    void ChangeColor_56415(){
        switch (Ls){
            case RED :
                Ls=Lights.YELLOW;
                break;
            case YELLOW :
                Ls=Lights.GREEN;
                break;
            case GREEN :
                Ls=Lights.RED;
                break;
        }
    }
    public String toString(){
        return " "+Ls;
    }

}


public class Trafficlights {
    public static void main(String[] args) {
        Simulation_56415 tfs = new Simulation_56415();
        for (int i = 0; i < 6; i++) {
            System.out.println(tfs);
            tfs.ChangeColor_56415();
        }
    }
}