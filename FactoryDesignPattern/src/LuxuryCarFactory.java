public class LuxuryCarFactory implements AbstractFactory {
    public Car getInstance(int price) {
        if (price < 5000000) {
            return new Jaguar();
        }
        return new RollsRoyce();
    }
}
