public class fan {
    int speedLevel;
    boolean isOn;
    boolean oscillation;

    public static void main(String[] args) {
        fan myFan = new fan(0, false, false);
        myFan.turnOn();
        myFan.increaseSpeed();
        myFan.increaseSpeed();
        myFan.oscillate();
        myFan.decreaseSpeed();
        myFan.turnOff();
    }

    public fan(int speedLevel, boolean isOn, boolean oscillation) {
        this.speedLevel = speedLevel;
        this.isOn = isOn;
        this.oscillation = oscillation;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Fan is now ON at speed level " + speedLevel);
        } else {
            System.out.println("Fan is already ON.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Fan is now OFF.");
        } else {
            System.out.println("Fan is already OFF.");
        }
    }

    public void increaseSpeed() {
        if (isOn) {
            if (speedLevel < 5) {
                speedLevel++;
                System.out.println("Speed increased to level " + speedLevel);
            } else {
                System.out.println("Fan is already at maximum speed.");
            }
        } else {
            System.out.println("Cannot increase speed. Fan is OFF.");
        }
    }

    public void decreaseSpeed() {
        if (isOn) {
            if (speedLevel > 0) {
                speedLevel--;
                System.out.println("Speed decreased to level " + speedLevel);
            } else {
                System.out.println("Fan is already at the lowest speed.");
            }
        } else {
            System.out.println("Cannot decrease speed. Fan is OFF.");
        }
    }

    public void oscillate() {
        if (isOn) {
            oscillation = !oscillation;
            if (oscillation) {
                System.out.println("Oscillation turned ON.");
            } else {
                System.out.println("Oscillation turned OFF.");
            }
        } else {
            System.out.println("Cannot change oscillation. Fan is OFF.");
        }
    }
}
