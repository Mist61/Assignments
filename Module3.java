
public class Module3 {
    private String brand;
    private int year;

    public Module3(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public void honk() {
        System.out.println(brand + " says: Honk");
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public int compareTo(Module3 other){
        return Integer.compare(this.year, other.year);
    }

    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Module3 other = (Module3) obj;
        return year == other.year && brand.equals(other.brand);
    }

    public String toString() {
        return "Automobile [Model Year=" + year + ", Brand=" + brand + "]";
    }

    public void accelerate() {
        System.out.println(getBrand() + " is accelerating.");
    }

    public void stop() {
        System.out.println(getBrand() + " has stopped.");
    }

    public void reverse() {
        System.out.println(getBrand() + " is reversing.");
    }
}

class Car extends Module3 {
    public Car(int year, String brand){
        super(brand, year);
    }
}

class SportsCar extends Module3 {
    public SportsCar(int year, String brand) {
        super(brand, year);
    }
}
class JunkCar extends Module3 {
    public JunkCar(int year, String brand) {
        super(brand, year);
    }
}



