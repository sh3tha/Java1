public class printer {
    double inkLevel;
    int paperCount;
    boolean isOn;

    public static void main(String[] args) {
        printer myPrinter = new printer(50.0, 10, false);
        myPrinter.printDocument("file.pdf");
        myPrinter.turnOn();
        myPrinter.scanDocument("file1.pdf");
        myPrinter.turnOff();
    }

    public printer(double inkLevel, int paperCount, boolean isOn) {
        this.inkLevel = inkLevel;
        this.paperCount = paperCount;
        this.isOn = isOn;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Printer is now ON");
        } else {
            System.out.println("Printer is already ON");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Printer is now OFF");
        } else {
            System.out.println("Printer is already OFF");
        }
    }

    public void printDocument(String documentName) {
        if (!isOn) {
            System.out.println("Cannot print. Printer is OFF");
        } else if (inkLevel < 5.0) {
            System.out.println("Cannot print. Ink level too low");
        } else if (paperCount <= 0) {
            System.out.println("Cannot print. No paper left");
        } else {
            inkLevel -= 5.0;
            paperCount--;
            System.out.println("Printing '" + documentName + "'. Ink: " + inkLevel + "%, Paper left: " + paperCount);
        }
    }

    public void scanDocument(String documentName) {
        if (isOn) {
            System.out.println("Scanning '" + documentName + "'...");
        } else {
            System.out.println("Cannot scan. Printer is OFF.");
        }
    }
}
