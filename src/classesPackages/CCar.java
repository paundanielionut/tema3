package classesPackages;

import exceptionPackage.CException;
import interfacesPackage.IHelper;

/**
 * Created by Daniel on 11/2/2014.
 */
public class CCar extends CVehicle{

    public  CCar(){
        setType("Car");
        setGear(1);
        setMaxSpeed(220);
        setSpeed(0);
    }

    public void print(){
        System.out.println(getType());
        System.out.println(getSpeed());
        System.out.println(getMaxSpeed());
        System.out.println(getGear());
    }

    public void speedDown() throws CException {
        if (speed == 0){
            throw new CException("viteza deja 0");
        }
        int Speed=getSpeed();
        Speed--;
        setSpeed(Speed);

    }

    public void speedUp() throws CException {
        if (speed == maxSpeed){
            throw new CException("ati atins deja viteza maxima");
        }
        int Speed=getSpeed();
        Speed++;
        setSpeed(Speed);
    }
}
