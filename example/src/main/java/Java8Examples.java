import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Examples {

    public List<String> filter(List<String> set) {

        return set.stream()
                .filter(p -> p.startsWith("v"))
                .map(String::toUpperCase)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public List<String> optional(List<String> set) {

        List<String> list = new ArrayList<>();
        set.stream()
                .filter(p -> p.startsWith("v"))
                .findFirst()
                .ifPresentOrElse(list::add,
                        () -> list.add("NA"));
        return list;

    }


}
