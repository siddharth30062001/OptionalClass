import java.util.Optional;


//4.Implement a method that takes an Optional<Integer> and multiplies the value by 10
//if present, otherwise returns 0.

public class CalculateValue {

    public static int calValue(Optional<Integer> o){

        
        return o.map((m)->m*2).orElse(0);

    }
    public static void main(String[] args) {
        
        Optional<Integer> i=Optional.of(5);
        Optional<Integer> i1=Optional.empty();

        System.out.println(CalculateValue.calValue(i));
        System.out.println(CalculateValue.calValue(i1));


    }
    
}
