public class TV {
    private String location;
    private int volume;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " TV is ON");
    }

    public void off() {
        System.out.println(location + " TV is OFF");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(location + " TV volume set to " + this.volume);
    }

    // Add a getter for volume
    public int getVolume() {
        return this.volume;
    }
}
