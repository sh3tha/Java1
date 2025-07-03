public class car{
    String color;
    double speed;
    double fuelLevel;
	
	public static void main(String[] args) {
        car myCar = new car("Blue", 0, 50);

        myCar.start();
        myCar.accelerate();
        myCar.accelerate();
        myCar.brake();
        myCar.refuel(20);
    }
	public car(String color, double speed, double fuelLevel) {
        this.color = color;
        this.speed = speed;
        this.fuelLevel = fuelLevel;
    }
	
	 public void start() {
        System.out.println("Car started");
    }
	public void accelerate() {
        speed += 10;
        System.out.println("Accelerated" + speed);
    }
	public void brake() {
        speed -= 10;
        if (speed < 0) speed = 0;
        System.out.println("Braked" + speed);
    }
	public void refuel(double amount) {
        fuelLevel += amount;
        System.out.println("Refueled" + fuelLevel);
    }

}
	
	
