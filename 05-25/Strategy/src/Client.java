public class Client {
    public static void main(String[] args) {
        Person person = new Person();
        person.setStrategy(new AirStrategy());
        person.travel();
        person.setStrategy(new BicycleStrategy());
        person.travel();
        person.setStrategy(new TrainStrategy());
        person.travel();
    }
}
