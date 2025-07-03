public class pen {
    String inkColor;
    double inkLevel;
    boolean isCapOn;

    public static void main(String[] args) {
        pen myPen = new pen("Blue", 20.0, true);
        myPen.write();
        myPen.cap();
        myPen.refill();
        myPen.uncap();
    }

    public pen(String inkColor, double inkLevel, boolean isCapOn) {
        this.inkColor = inkColor;
        this.inkLevel = inkLevel;
        this.isCapOn = isCapOn;
    }

    public void write() {
        if (isCapOn) {
            System.out.println("Can't write. The cap is on");
        } else if (inkLevel <= 0) {
            System.out.println("Can't write. Ink is empty");
        } else {
            inkLevel -= 5.0;
            if (inkLevel < 0) inkLevel = 0;
            System.out.println("Writing with " + inkColor + " ink... Ink level: " + inkLevel + "%");
        }
    }

    public void cap() {
        if (!isCapOn) {
            isCapOn = true;
            System.out.println("Cap is now on.");
        } else {
            System.out.println("Cap is already on.");
        }
    }

    public void uncap() {
        if (isCapOn) {
            isCapOn = false;
            System.out.println("Cap removed. Ready to write.");
        } else {
            System.out.println("Cap is already off.");
        }
    }

  public void refill() {
        inkLevel = 100.0;
        System.out.println("Pen refilled to 100% ink.");
    }
}