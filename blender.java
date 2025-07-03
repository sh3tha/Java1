public class blender {
    int bladeSpeed;          
    boolean isLidOn;
    double containerCapacity;

    public static void main(String[] args) {
        blender myBlender = new blender(0, false, 1.5);
        myBlender.blend();                    
        myBlender.changeSpeed(3);            
        myBlender.isLidOn = true;            
        myBlender.stop();                     
    }

    public blender(int bladeSpeed, boolean isLidOn, double containerCapacity) {
        this.bladeSpeed = bladeSpeed;
        this.isLidOn = isLidOn;
        this.containerCapacity = containerCapacity;
    }

    public void blend() {
        if (!isLidOn) {
            System.out.println("Cannot blend. The lid is off!");
        } else if (bladeSpeed <= 0) {
            System.out.println("Set blade speed before blending.");
        } else {
            System.out.println("Blending at speed level " + bladeSpeed + " with capacity " + containerCapacity + "L.");
        }
    }

    public void stop() {
        if (bladeSpeed > 0) {
            bladeSpeed = 0;
            System.out.println("Blender stopped.");
        } else {
            System.out.println("Blender is already stopped.");
        }
    }

    public void changeSpeed(int newSpeed) {
        if (!isLidOn) {
            System.out.println("Cannot change speed. Lid is off.");
        } else if (newSpeed < 1 || newSpeed > 5) {
            System.out.println("Invalid speed. Please choose between 1 and 5.");
        } else {
            bladeSpeed = newSpeed;
            System.out.println("Blade speed changed to " + bladeSpeed);
        }
    }
}
