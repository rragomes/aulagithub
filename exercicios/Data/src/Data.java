import java.time.LocalDate;
import java.time.LocalDateTime;

public class Data {
   
    public static void main(String[] args) throws Exception {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();

        System.out.println(d01);
        System.out.println(d02);
    }
}
