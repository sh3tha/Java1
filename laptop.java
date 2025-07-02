public class laptop{
	double batteryLevel;
	boolean isOn;
	double processorSpeed;
	
	public static void main(String[] args){
		laptop myLaptop = new laptop (75.0, false, 3.2);
        myLaptop.sleep();
        myLaptop.runApplication("VS Code");   
        myLaptop.bootUp();                
        myLaptop.shutDown();
    }
	public laptop(double batteryLevel, boolean isOn, double processorSpeed) {
        this.batteryLevel = batteryLevel;
        this.isOn = isOn;
        this.processorSpeed = processorSpeed;
    }

    public void bootUp() {
        if (!isOn && batteryLevel >= 5.0) {
            isOn = true;
            System.out.println("Laptop booted up. Processor: " + processorSpeed + " GHz");
        } else if (isOn) {
            System.out.println("Laptop is already ON");
        } else {
            System.out.println("Not enough battery to boot up");
        }
    }

    public void shutDown() {
        if (isOn) {
            isOn = false;
            System.out.println("Laptop is shutting down...");
        } else {
            System.out.println("Laptop is already OFF");
        }
    }

    public void runApplication(String appName) {
        if (isOn && batteryLevel >= 3.0) {
            batteryLevel -= 3.0;
            System.out.println("Running " + appName + "... Battery at " + batteryLevel + "%.");
        } else if (!isOn) {
            System.out.println("Cannot run " + appName + ". Laptop is OFF");
        } else {
            System.out.println("Not enough battery to run " + appName + ".");
        }
    }

    public void sleep() {
        if (isOn) {
            isOn = false;
            System.out.println("Laptop is now in sleep mode.");
        } else {
            System.out.println("Laptop is already in sleep or OFF.");
        }
    }
}