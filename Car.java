public class Car {
    private String brand;
    private String color;
    private int year;

    // Constructor
    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red", 2020);

        System.out.println("Information about car1:");
        car1.displayInfo();

        car1.setColor("Blue");
        car1.setYear(2022);

        System.out.println("\nUpdated information about car1:");
        car1.displayInfo();
    }
}
