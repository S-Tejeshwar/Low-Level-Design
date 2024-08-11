public class Main {
    public static void main(String[] args) {
     CarTierFactoryProducer carTierFactoryProducer = new CarTierFactoryProducer();
     AbstractFactory normalCarFactory = carTierFactoryProducer.getFactoryInstance("Normal");
     AbstractFactory luxuryCarFactory = carTierFactoryProducer.getFactoryInstance("Luxury");

     System.out.println(normalCarFactory.getInstance(50000).topSpeed());
     System.out.println(normalCarFactory.getInstance(500000).topSpeed());
     System.out.println(luxuryCarFactory.getInstance(4000000).topSpeed());
     System.out.println(luxuryCarFactory.getInstance(10000000).topSpeed());
    }
}