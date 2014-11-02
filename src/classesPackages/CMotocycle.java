package classesPackages;

/**
 * Created by Daniel on 11/2/2014.
 */

/**
 *
 */
public class CMotocycle extends CVehicle {

    public  CMotocycle(){
        setType("Motocycle");
        setGear(1);
        setMaxSpeed(150);
        setSpeed(0);
    }

    public void print(){
        System.out.println(getType());
        System.out.println(getSpeed());
        System.out.println(getMaxSpeed());
        System.out.println(getGear());
    }

    /**
     * functie pentru decrementarea vitezei
     */
    public void speedDown(){
        int Speed=getSpeed();
        Speed++;
        setSpeed(Speed);
    }

    /**
     * functie pentru incrementarea vitezei
     */
    public void speedUp(){
        int Speed=getSpeed();
        Speed--;
        setSpeed(Speed);
    }
}
