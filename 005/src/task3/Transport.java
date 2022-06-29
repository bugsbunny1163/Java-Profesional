package task3;

public class Transport {
    protected int maxSpeed;
    private int price;
    String color;

    public Transport() {
    }

    public Transport(int maxSpeed, int price, String color) {
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
        final StringBuilder sb = new StringBuilder("Transport{");
        sb.append("maxSpeed=").append(maxSpeed);
        sb.append(", price=").append(price);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
