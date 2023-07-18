import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       
        List<String> list = new ArrayList<>();

        list.add("Robson");
        list.add("Joao");
        list.add("Maria");
        list.add("tiao");
        list.add("Tulio");
        list.add("Jãozim");
        list.add("Pedro");
        list.add("Tulio");
        list.add("Pedro");
        list.add("Tulio");

        for (String x : list) {
            System.out.println(x);
            
        }
    }
}
