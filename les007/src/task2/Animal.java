package task2;


import java.io.Serializable;

public class Animal implements Serializable {
    private int qtyOfPaws;
    private boolean tail;
    private String name;

    public Animal() {
    }

    public Animal(int qtyOfPaws, String name) {
        this.qtyOfPaws = qtyOfPaws;
        this.name = name;
    }

    public Animal(int qtyOfPaws, boolean tail, String name) {
        this.qtyOfPaws = qtyOfPaws;
        this.tail = tail;
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("qtyOfPaws=").append(qtyOfPaws);
        sb.append(", tail=").append(tail);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }


    public int getQtyOfPaws() {
        return qtyOfPaws;
    }

    public void setQtyOfPaws(int qtyOfPaws) {
        this.qtyOfPaws = qtyOfPaws;
    }

    public boolean getTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
