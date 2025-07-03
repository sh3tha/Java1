public class TrafficLight {
    String currentColor;
    String location;
    int timer;

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", "Main & 5th", 10);

        light.startTimer();      
        light.changeColor();     
        light.startTimer();     
        light.blink();          
    }

    public TrafficLight(String currentColor, String location, int timer) {
        this.currentColor = currentColor;
        this.location = location;
        this.timer = timer;
    }

    public void changeColor() {
        switch (currentColor) {
            case "Red":
                currentColor = "Green";
                break;
            case "Green":
                currentColor = "Yellow";
                break;
            case "Yellow":
                currentColor = "Red";
                break;
            default:
                currentColor = "Red";
        }
        System.out.println("Light at " + location + " changed to " + currentColor + ".");
    }

    public void startTimer() {
        System.out.println("Starting " + timer + " second timer for " + currentColor + " light.");
     
    }

    public void blink() {
        System.out.println("Traffic light at " + location + " is now blinking " + currentColor + ".");
    }
}