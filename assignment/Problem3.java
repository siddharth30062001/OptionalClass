import java.util.Optional;

//3.Given an Optional<Double>, return its value if present or a default value of 100.0 if absent.

public class Problem3 {

    public static double printValue(Optional<Double> t){

        if(t.isPresent()){
            return t.get();
        }
        
        return t.orElse(100.0);

    }
    public static void main(String[] args) {
        
        Optional<Double> d=Optional.of(45.9);
        Optional<Double> d1=Optional.empty();
        System.out.println(Problem3.printValue(d));
        System.out.println(Problem3.printValue(d1));
    }
    
}
