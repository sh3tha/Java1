public class bicycle {
    int gear;
    double speed;
    double tirePressure;

    public static void main(String[] args) {
        bicycle myBike = new bicycle(1, 0.0, 35.0);
        myBike.pedal();
        myBike.changeGear(3);
        myBike.brake();
    }

    public bicycle(int gear, double speed, double tirePressure) {
        this.gear = gear;
        this.speed = speed;
        this.tirePressure = tirePressure;
    }

    public void pedal() {
        speed += gear * 2;  
        System.out.println("Pedaling... Speed is now " + speed + " km/h");
    }

    public void brake() {
        if (speed > 0) {
            speed -= 5;
            if (speed < 0) speed = 0;
            System.out.println("Braking... Speed reduced to " + speed + " km/h");
        } else {
            System.out.println("The bicycle is already stopped.");
        }
    }

    public void changeGear(int newGear) {
        if (newGear >= 1 && newGear <= 10) {
            gear = newGear;
            System.out.println("Gear changed to " + gear);
        } else {
            System.out.println("Invalid gear: " + newGear + ". Gear must be between 1 and 10.");
        }
    }
}
