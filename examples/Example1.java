package examples;

import java.util.Optional;

//Optional class is used to handel NullPointerException in java. It is a feature of java 8
public class Example1 {

    public static void main(String[] args) {
        
        String [] sr=new String[10];
        // String result= sr[5].toLowerCase();
        // System.out.println(result);
        sr[5]="HELLOWORLD";

        Optional<String> os=Optional.ofNullable(sr[5]);
    

        if(os.isPresent()){
            String result=sr[5].toLowerCase();
            System.out.println(result);
        }
        else{
            System.out.println("String is not present");
        }
    }
    
}