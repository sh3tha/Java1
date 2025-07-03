public class buttle {
    boolean isFull;
    String color;
    String material;
    boolean isOpen;

    public static void main(String[] args) {
        buttle myBottle = new buttle(true, "Green", "Plastic");

        myBottle.pour();   
        myBottle.open();
        myBottle.close();
    }

    public buttle(boolean isFull, String color, String material) {
        this.isFull = isFull;
        this.color = color;
        this.material = material;
        this.isOpen = false; 
    }

    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("The bottle is now open.");
        } else {
            System.out.println("The bottle is already open.");
        }
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("The bottle is now closed.");
        } else {
            System.out.println("The bottle is already closed.");
        }
    }

    public void pour() {
        if (!isOpen) {
            System.out.println("Cannot pour. The bottle is closed.");
        } else if (isFull) {
            isFull = false;
            System.out.println("Pouring the contents... Now the bottle is empty.");
        } else {
            System.out.println("The bottle is already empty.");
        }
    }
}
