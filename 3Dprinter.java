public class threeDprinter {
    String filamentType;
    double temperature;
    String printStatus;

    public static void main(String[] args) {
        threeDprinter printer = new threeDprinter("PLA", 0.0, "Idle");

        printer.loadFilament("PLA");
        printer.startPrint();
        printer.pausePrint();
    }

    public threeDprinter(String filamentType, double temperature, String printStatus) {
        this.filamentType = filamentType;
        this.temperature = temperature;
        this.printStatus = printStatus;
    }

    public void startPrint() {
        if (temperature >= 180) {
            printStatus = "Printing";
            System.out.println("Printing started with " + filamentType + " at " + temperature + "°C.");
        } else {
            System.out.println("Cannot start print. Temperature too low.");
        }
    }

    public void pausePrint() {
        if (printStatus.equals("Printing")) {
            printStatus = "Paused";
            System.out.println("Print paused.");
        } else {
            System.out.println("Printer is not currently printing.");
        }
    }

    public void loadFilament(String type) {
        this.filamentType = type;
        switch (type) {
            case "PLA":
                temperature = 200;
                break;
            case "ABS":
                temperature = 240;
                break;
            default:
                temperature = 190;
        }
        System.out.println("Loaded " + type + " filament. Set temperature to " + temperature + "°C.");
    }
}
