package task2;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {

    public Cat() {
    }

    public Cat(int qtyOfPaws, boolean tail, String name) {
        super(qtyOfPaws, tail, name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("qtyOfPaws=").append(getQtyOfPaws());
        sb.append(", tail=").append(getTail());
        sb.append(", name='").append(getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
