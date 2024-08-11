public class NormalCarFactory implements AbstractFactory {


    public Car getInstance(int price) {
      if (price < 200000) {
          return new Nano();
      }
      return new Santro();
    }

}
