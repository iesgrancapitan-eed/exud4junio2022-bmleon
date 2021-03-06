package com.bmlf.examen.junio;

class Bike {
    int speed;
    int gear;
/**
 * generamos las marchas
 * @param newGear
 */
    public void changeGear(int newGear) {
        gear = newGear;
    }
/**
 * velocidad que aunmenta
 * @param increment
 */
    public void speedUp(int increment) {
        speed = speed + increment;
    }
/**
 * creamos applyBrakes
 * @param decrement
 */
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
/**
 * si se para bike
 */
    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

    @Override
    /**
     * clase string
     */
    public String toString() {
        return "Bicycle [speed=" + speed + ", gear=" + gear + "]";
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
      return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
      this.speed = speed;
    }

    /**
     * @return the gear
     */
    public int getGear() {
      return gear;
    }

    /**
     * 
     * @param gear the gear to set
     */
    public void setGear(int gear) {
      this.gear = gear;
    }

}


// class Bike implements Vehicle {
//
// int speed;
// int gear;
//
// @Override
// public void changeGear(int newGear){
//
// gear = newGear;
// }
//
// @Override
// public void speedUp(int increment){
//
// speed = speed + increment;
// }
//
// @Override
// public void applyBrakes(int decrement){
//
// speed = speed - decrement;
// }
//
// public void printStates() {
// System.out.println("speed: " + speed
// + " gear: " + gear);
// }
// }

// class GFG {
//
// public static void main (String[] args) {
//
// // creating an inatance of Bicycle
// // doing some operations
// Bicycle bicycle = new Bicycle();
// bicycle.changeGear(2);
// bicycle.speedUp(3);
// bicycle.applyBrakes(1);
//
// System.out.println("Bicycle present state :");
// bicycle.printStates();
//
// // creating instance of the bike.
// Bike bike = new Bike();
// bike.changeGear(1);
// bike.speedUp(4);
// bike.applyBrakes(3);
//
// System.out.println("Bike present state :");
// bike.printStates();
// }
// }