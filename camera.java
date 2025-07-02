public class camera{
    String resolution;
    double batteryLevel;
    boolean isOn;
	
	public static void main(String[] args){
		camera myCamera = new camera("1080",50.0,false);
		myCamera.takePhoto();
        myCamera.turnOn();
        myCamera.takePhoto();
        myCamera.zoomIn();
		myCamera.zoomOut();
        myCamera.turnOff();
	}
	public camera(String resolution, double batteryLevel, boolean isOn) {
        this.resolution = resolution;
        this.batteryLevel = batteryLevel;
        this.isOn = isOn;
    }
	public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Camera is now ON.");
        } else {
            System.out.println("Camera is already ON.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Camera is now OFF.");
        } else {
            System.out.println("Camera is already OFF.");
        }
    }

    public void takePhoto() {
        if (isOn && batteryLevel >= 2.0) {
            batteryLevel -= 2.0;
            System.out.println("Photo taken at " + resolution + " resolution. Battery at " + batteryLevel + "%.");
        } else if (!isOn) {
            System.out.println("Cannot take photo. Camera is OFF.");
        } else {
            System.out.println("Not enough battery to take a photo.");
        }
    }

    public void zoomIn() {
        if (isOn) {
            System.out.println("Zooming in...");
        } else {
            System.out.println("Cannot zoom in. Camera is OFF.");
        }
    }

    public void zoomOut() {
        if (isOn) {
            System.out.println("Zooming out...");
        } else {
            System.out.println("Cannot zoom out. Camera is OFF.");
		} 
    }
}