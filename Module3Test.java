public class Module3Test {
    public static void main(String[] args) {
        Module3[] Automobile = {
            new Car(2020, "Ford"),
            new SportsCar(2025, "Lamborghini"),
            new JunkCar(1997, "Toyota")
        };
        
        for (Module3 auto : Automobile) {
            System.out.println(auto);
            auto.honk();

            if (auto instanceof Car) {
                ((Car) auto).accelerate();
            } else if (auto instanceof SportsCar) {
                ((SportsCar) auto).stop();
            } else if (auto instanceof JunkCar) {
                ((JunkCar) auto).reverse();
            }

            System.out.println();
        }

        Module3 car1 = new Car(2020, "Ford");
        Module3 car2 = new SportsCar(2025, "Lamborghini");

        System.out.println("car1 equals car2: " + car1.equals(car2));
        System.out.println("Comparing car1 to car2: " + car1.compareTo(car2));
    }
}