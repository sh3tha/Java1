public class television {
    int channel;
    int volume;
    boolean isOn;

    public static void main(String[] args) {
        television myTV = new television(1, 10, false);
        myTV.turnOn();
        myTV.changeChannel(5);
        myTV.adjustVolume(15);
        myTV.turnOff();
    }

    public television(int channel, int volume, boolean isOn) {
        this.channel = channel;
        this.volume = volume;
        this.isOn = isOn;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("TV is now ON. Channel: " + channel + ", Volume: " + volume);
        } else {
            System.out.println("TV is already ON.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("TV is now OFF.");
        } else {
            System.out.println("TV is already OFF.");
        }
    }

    public void changeChannel(int newChannel) {
        if (isOn) {
            channel = newChannel;
            System.out.println("Channel changed to " + channel);
        } else {
            System.out.println("Cannot change channel. TV is OFF.");
        }
    }

    public void adjustVolume(int newVolume) {
        if (isOn) {
            volume = newVolume;
            System.out.println("Volume set to " + volume);
        } else {
            System.out.println("Cannot adjust volume. TV is OFF.");
        }
    }
}
