package task2;

public class Car {
    private int maxSpeed;
    private int price;
    private String color;

    public Car() {
    }

    public Car(int maxSpeed, int price, String color) {
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("maxSpeed=").append(maxSpeed);
        sb.append(", price=").append(price);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
