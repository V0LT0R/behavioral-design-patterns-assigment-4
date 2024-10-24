public class SetTVVolume implements Command {
    private TV tv;
    private int previousVolume;
    private int volume;

    public SetTVVolume(TV tv, int volume) {
        this.tv = tv;
        this.volume = volume;
    }

    @Override
    public void execute() {
        previousVolume = tv.getVolume(); // Assume there's a getter for volume
        tv.setVolume(volume);
    }

    @Override
    public void undo() {
        tv.setVolume(previousVolume);
    }
}
