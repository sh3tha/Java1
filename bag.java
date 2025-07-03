public class bag {
    String color;
    String size;
    boolean isOpen;

    public static void main(String[] args) {
        bag myBag = new bag("Black", "Medium");

        myBag.carry();     
        myBag.open();      
        myBag.close();    
    }

    public bag(String color, String size) {
        this.color = color;
        this.size = size;
        this.isOpen = false; 
    }

    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("The bag is now open.");
        } else {
            System.out.println("The bag is already open.");
        }
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("The bag is now closed.");
        } else {
            System.out.println("The bag is already closed.");
        }
    }

    public void carry() {
        if (isOpen) {
            System.out.println("Carrying the bag while it's open. Be careful!");
        } else {
            System.out.println("Carrying the bag safely while it's closed.");
        }
    }
}
