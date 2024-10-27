
//5.Create a method that takes an Optional<List<String>> and returns a list
// containing only non-empty strings.
// Approach: Use flatMap to handle the optional and filter non-empty strings.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Problem5 {

    public static List<String> display(Optional<List<String>> temp){


        return temp.flatMap(list -> Optional.of(
                        list.stream()
                            .filter(str -> !str.isEmpty()) 
                            .collect(Collectors.toList())))
                            .orElseGet(ArrayList::new);
    } 
    public static void main(String[] args) {

        List<String> list=Arrays.asList("apple",""," ","mango");

        Optional<List<String>> optionallist= Optional.of(list);
        System.out.println(display(optionallist));

        
    }
    
}
