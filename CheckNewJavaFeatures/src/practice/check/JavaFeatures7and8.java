package practice.check;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

@FunctionalInterface
interface ConfirmAction {
    boolean confirmMsg (String msg);
    static int addition (int a, int b){
        int sum = a+b;
        return sum;
    }
}  


public class JavaFeatures7and8 {

    
    public static void main (String a[]){
        String cmdLineArg = a[0];

        switch (cmdLineArg){
            case "Monday" :
                System.out.println ("Today is Monday");
                break;
            case "Tuesday" :
                System.out.println ("Today is Tuesday"); 
                break;           
        }

        //Calling the interface
        ConfirmAction confirmAction =  (message) ->  {
            return message.equalsIgnoreCase ("Yes");
        };

        boolean result = confirmAction.confirmMsg("YES");
        System.out.println ("The result is " + result);
        

        int sum = ConfirmAction.addition (5,7);
        System.out.println ("The sum is " + sum);

        // Lambda
        //(paramer) -> expression
        // (parameter) -> {statement}
        BiFunction <Integer, Integer, Integer> product = (x, y) -> x*y;
        System.out.println(product.apply(5,7));

        BiFunction <Integer, Integer, Integer> add = (x, y) -> {
            int addition = x + y;
            System.out.println ("The sum1 is : " + addition);
            return addition;
        
        };

        add.apply(7, 7) ;   

        // Diamond operator & Streams API
        List <Integer> list = new ArrayList<> ();
        for (int i=0 ; i<9; i++){
            list.add(i);
        }
        
        List<Integer> filterList = list.stream().filter(check -> check > 5).collect (Collectors.toList ());
        // Use of Optional to avoid Null Pointer Exception
        Optional<List <Integer>> optionalList = Optional.ofNullable (filterList);
        //filterList.forEach(k -> System.out.println (k));
        optionalList.ifPresent(l -> filterList.forEach(k -> System.out.println (k)));  
        
        

    }

}
