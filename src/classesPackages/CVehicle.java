package classesPackages;

import interfacesPackage.IHelper;

/**
 * Created by Daniel on 11/2/2014.
 */

/**
 * Abstract class CVehicle
 */
abstract class CVehicle implements IHelper{
    /**
     * type: tipul masinii
     * gear: in ce viteza este la momentul respectiv
     * maxSpeed: viteza maxima
     * speed; viteza la momentul respectiv
     */
    String type;
    int gear;
    int maxSpeed;
    int speed;

    /**
     * setter pentru tip
     * @param t=tipul masini
     */
    public void setType(String t) {
        type = t;
    }

    /**
     *
     * @param g
     */
    public void setGear(int g){
        gear = g;
    }

    /**
     *
     * @param maxS
     */
    public void setMaxSpeed(int maxS){
        maxSpeed = maxS;
    }

    /**
     *
     * @param s
     */
    public void setSpeed(int s){
        speed = s;
    }

    public String getType(){
        return type;
    }

    public int getGear() { return gear; }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public int getSpeed(){
        return speed;
    }

    /**
     * functia va incrementa viteza cu o pozitie
     */
    public void incGear(){
        gear++;
    }

    /**
     * functia va decrementa viteza cu o pozitie
     */
    public void decGear(){
        gear--;
    }

    abstract void print();
}
