import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Service.printTheNumberOfDuplicates(strings);
    }
}