package task3;

public class Car implements Comparable {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }


    public int compareTo(Object o) {
        int temp = this.speed - ((Car) o).speed;
        if (temp == 0) {
            int temp1 = this.price - ((Car) o).price;
            if (temp1 == 0) {
                int temp2 = this.model.compareTo(((Car) o).model);
                if (temp2 == 0) {
                    return this.color.compareTo(((Car) o).color);
                } else {
                    return temp2;
                }
            } else {
                return temp1;
            }
        } else {
            return temp;
        }
    }
}