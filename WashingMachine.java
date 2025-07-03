public class WashingMachine {
    double waterLevel;
    String currentCycle;
    String doorStatus;

    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine(0.0, "Idle", "Closed");
        wm.startWash();
        wm.rinse();
        wm.spin();
        wm.drainWater();
    }

    public WashingMachine(double waterLevel, String currentCycle, String doorStatus) {
        this.waterLevel = waterLevel;
        this.currentCycle = currentCycle;
        this.doorStatus = doorStatus;
    }

    public void startWash() {
        if (doorStatus.equals("Closed")) {
            waterLevel = 30.0;
            currentCycle = "Wash";
            System.out.println("Washing cycle started. Water level: " + waterLevel + " liters.");
        } else {
            System.out.println("Close the door before starting the wash cycle.");
        }
    }

    public void rinse() {
        if (currentCycle.equals("Wash") || currentCycle.equals("Idle")) {
            waterLevel = 20.0;
            currentCycle = "Rinse";
            System.out.println("Rinsing... Water level: " + waterLevel + " liters.");
        } else {
            System.out.println("Cannot rinse. Current cycle is: " + currentCycle);
        }
    }

    public void spin() {
        if (currentCycle.equals("Rinse")) {
            waterLevel = 0.0;
            currentCycle = "Spin";
            System.out.println("Spinning... Water drained.");
        } else {
            System.out.println("Cannot spin. Complete the rinse cycle first.");
        }
    }

    public void drainWater() {
        waterLevel = 0.0;
        System.out.println("Draining all water... Water level is now: " + waterLevel + " liters.");
    }
}
