public class CarTierFactoryProducer {

    public AbstractFactory getFactoryInstance(String tier) {
        if(tier.equals("Luxury")) {
            return new LuxuryCarFactory();
        }

        return new NormalCarFactory();
    }
}
