package task4;

public class Animal {
    private int qtyOfPaws = 8;
    private boolean tail = false;
    private String name = "Ant";

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("qtyOfPaws=").append(qtyOfPaws);
        sb.append(", tail=").append(tail);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
