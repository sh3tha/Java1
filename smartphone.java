public class smartphone{
    String brand;
    double batteryPercentage;
    boolean isOn;
	
	public static void main(String[] args) {
        smartphone myPhone = new smartphone("Iphone", 85.0, false);

        myPhone.makeCall("shatha");
        myPhone.sendMessage("father","Hello!, how's it going?");
        myPhone.takePhoto();
        myPhone.charge(20.0);
    }
	public smartphone(String brand, double batteryPercentage, boolean isOn) {
        this.brand = brand;
        this.batteryPercentage = batteryPercentage;
        this.isOn = isOn;
   }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(brand + " is now ON.");
        } else {
            System.out.println(brand + " is already ON.");
        }
    }

    public void makeCall(String contactName) {
        if (isOn && batteryPercentage >= 5.0) {
            batteryPercentage -= 5.0;
            System.out.println("Calling " + contactName + "... Battery at " + batteryPercentage + "%.");
        } else if (!isOn) {
            System.out.println("Cannot make call. Phone is OFF.");
        } else {
            System.out.println("Not enough battery to make a call.");
        }
    }

    public void sendMessage(String contactName, String message) {
        if (isOn && batteryPercentage >= 2.0) {
            batteryPercentage -= 2.0;
            System.out.println("Sending message to " + contactName + ": \"" + message + "\". Battery at " + batteryPercentage + "%.");
        } else if (!isOn) {
            System.out.println("Cannot send message. Phone is OFF.");
        } else {
            System.out.println("Not enough battery to send a message.");
        }
    }

    public void takePhoto() {
        if (isOn && batteryPercentage >= 3.0) {
            batteryPercentage -= 3.0;
            System.out.println("Photo taken. Battery at " + batteryPercentage + "%.");
        } else if (!isOn) {
            System.out.println("Cannot take photo. Phone is OFF.");
        } else {
            System.out.println("Not enough battery to take a photo.");
        }
    }

    public void charge(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid charge amount.");
            return;
        }

        batteryPercentage += amount;
        if (batteryPercentage > 100.0) {
            batteryPercentage = 100.0;
        }
        System.out.println("Phone charged. Battery at " + batteryPercentage + "%.");
    }
}