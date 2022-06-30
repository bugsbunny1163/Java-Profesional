package task3;

@MyAnnoClass
public class Animal {
    private int qtyOfPaws;
    private boolean tail;
    @MyAnno
    private String name;

    @Deprecated
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

    @MyAnno
    public int getQtyOfPaws() {
        return qtyOfPaws;
    }

    public void setQtyOfPaws(int qtyOfPaws) {
        this.qtyOfPaws = qtyOfPaws;
    }

    public boolean isTail() {
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
