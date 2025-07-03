public class door {
    boolean isOpen;
    boolean isLocked;
    String material;

    public static void main(String[] args) {
        door myDoor = new door(false, true, "Wood");
        myDoor.open();       
        myDoor.unlock();      
        myDoor.lock();        
        myDoor.close();      
    }

    public door(boolean isOpen, boolean isLocked, String material) {
        this.isOpen = isOpen;
        this.isLocked = isLocked;
        this.material = material;
    }

    public void open() {
        if (isLocked) {
            System.out.println("Cannot open. The door is locked.");
        } else if (isOpen) {
            System.out.println("The door is already open.");
        } else {
            isOpen = true;
            System.out.println("You opened the " + material + " door.");
        }
    }

    public void close() {
        if (!isOpen) {
            System.out.println("The door is already closed.");
        } else {
            isOpen = false;
            System.out.println("The door is now closed.");
        }
    }

    public void lock() {
        if (isOpen) {
            System.out.println("Cannot lock the door while it's open.");
        } else if (isLocked) {
            System.out.println("The door is already locked.");
        } else {
            isLocked = true;
            System.out.println("The door is now locked.");
        }
    }

    public void unlock() {
        if (!isLocked) {
            System.out.println("The door is already unlocked.");
        } else {
            isLocked = false;
            System.out.println("You unlocked the door.");
        }
    }
}
