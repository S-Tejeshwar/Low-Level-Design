public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ACClient turnOnClient =  new ACClient(new TurnOnAc(new AirConditioner()));
        ACClient turnOffClient =  new ACClient(new TurnOffAc(new AirConditioner()));

        turnOnClient.pressButton();
        turnOnClient.undo();

        turnOffClient.pressButton();
        turnOffClient.undo();
    }
}