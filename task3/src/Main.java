public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        TV livingRoomTV = new TV("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo homeStereo = new Stereo("Home");

        Command tvOn = new TurnTVOn(livingRoomTV);
        Command tvVolume = new SetTVVolume(livingRoomTV, 15);
        Command kitchenLightDim = new DimLights(kitchenLight, 50);

        remote.setCommand(0, tvOn, new NoCommand());  // TV on, no off command
        remote.setCommand(1, kitchenLightDim, new NoCommand());  // Dim light, no off command
        remote.setCommand(2, tvVolume, new NoCommand());  // Set volume, no off command

        remote.pressOnButton(0);  // TV on
        remote.pressOnButton(1);  // Dim lights
        remote.pressOnButton(2);  // Set TV volume

        // Undo last command (Set TV volume)
        remote.pressUndoButton();
    }
}
