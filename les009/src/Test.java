import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
     NewClas newClas = new NewClas();
//     newClas.testNewMMet(()-> System.out.println("dm"));
     A a = ()-> System.out.println("dm");
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(654);
        list.add(6421);
        list.add(12);
        list.add(1);
        list = list.stream().sorted().map(b->b+2).collect(Collectors.toList());
        System.out.println(list);
    }


}

interface A{
    void  ss();

}
interface B{
    void ssfd();
}

class NewClas{
    public void testNewMMet(A a){
    }
    public void testNewMMet(B b){}

}

