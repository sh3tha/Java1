public class cup {
    String color;
    String material;
    boolean isFull;

    public static void main(String[] args) {
        cup myCup = new cup("Blue", "Ceramic", false);
        myCup.drink();
        myCup.fill();
        myCup.empty();
    }

    public cup(String color, String material, boolean isFull) {
        this.color = color;
        this.material = material;
        this.isFull = isFull;
    }

    public void fill() {
        if (!isFull) {
            isFull = true;
            System.out.println("The cup is now full.");
        } else {
            System.out.println("The cup is already full.");
        }
    }

    public void empty() {
        if (isFull) {
            isFull = false;
            System.out.println("The cup has been emptied.");
        } else {
            System.out.println("The cup is already empty.");
        }
    }

    public void drink() {
        if (isFull) {
            isFull = false;
            System.out.println("You took a sip. The cup is now empty.");
        } else {
            System.out.println("There's nothing to drink. The cup is empty.");
        }
    }
}
