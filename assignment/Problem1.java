
// 1.Create a method that returns an Optional<String> containing a value if a string is
// not null, otherwise return Optional.empty().

import java.util.Optional;

public class Problem1 {


    public static Optional<String> display(String [] arr){

        Optional<String>  check= Optional.ofNullable(arr[5]);

        if(check.isPresent()){

            return Optional.ofNullable(arr[5]);
        }
        else{
            return Optional.empty();
        }
    }
    public static void main(String[] args) {

        String [] t=new String[10];
        t[5]="sid";
        System.out.println(Problem1.display(t));

        
    }
    
}
