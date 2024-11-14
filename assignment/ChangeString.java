
//Write a method that takes an Optional<String> and prints the string in uppercase if it
//is present, otherwise prints "No value".

import java.util.Optional;

public class ChangeString {

    // public static String  display(Optional<String> s){
       
    //     if(s.isPresent()){

    //        //return s.ifPresent((n)->n.toUpperCase());
    //     }
    //     else{

    //     return s.orElse("No Value");
    //     }

    //}
    public static void main(String[] args) {
        
        Optional <String> t=Optional.of("hello");
        Optional <String> l=Optional.empty();
       
    }
    
}
