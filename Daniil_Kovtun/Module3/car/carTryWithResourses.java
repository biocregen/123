package Module3.car;

public class carTryWithResourses {
    public static class Car implements AutoCloseable{
        public void close() {
            System.out.println("Машина закрывается...");
        }
        public void drive() {
            System.out.println("Машина поехала");
        }
    }

    public static void main(String[] args) {
        try(Car car = new Car()) {
            car.drive();
        } catch (Throwable a) {}
    }
}

