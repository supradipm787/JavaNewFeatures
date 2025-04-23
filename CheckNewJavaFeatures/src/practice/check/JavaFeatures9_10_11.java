package practice.check;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class JavaFeatures9_10_11 {

    public Map <Integer, String> immutableMap() 
	{				
		
		Map<Integer, String> mutableMap = new HashMap<>();
		mutableMap.put(1, "India");
		mutableMap.put(2, "Europe");
        mutableMap.put(3, "Canada");
		//Converting mutable map to immutable map
		
		Map<Integer, String> unmodifiableMap = Collections.unmodifiableMap(mutableMap);    
             
            return unmodifiableMap;     
		        		
	}

    public static void main (String a[]){
        
        // creating of non-empty immutable map directly
        Map<Integer, String> immutable2 = Map.of(1, "BHARAT", 2, "USA", 3, "Australia");      
        immutable2.forEach ((k,v) ->   System.out.println ("PriorityKey in Ranking= " + k + ", Value = " + v) );  

        JavaFeatures9_10_11 java9to11 = new JavaFeatures9_10_11 ();

        Map <Integer, String> map = java9to11.immutableMap();
        map.forEach((k,v) -> System.out.println ("PriorityKey in Ranking = " + k + ", Value = " + v) ); 

        //Usage of Local variable with type inference
        var x = "Hello it is local variable type inference";
        for (var y=0 ; y< 8 ; y++){
            System.out.print (y + " ");
        }
        System.out.println (x);    
    }

}
