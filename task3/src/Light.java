public class Light {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is ON");
    }

    public void off() {
        System.out.println(location + " light is OFF");
    }

    public void dim(int level) {
        System.out.println(location + " light dimmed to " + level + "%");
    }
}
