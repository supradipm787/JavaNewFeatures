package practice.check;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
//import java.util.Iterator;
import java.util.Map;
//import java.util.
import java.util.function.Consumer;
//import java.util.Collection;
import java.util.stream.Collectors;

public class CheckJavaNewFeatures {
	
	public List javaElevenFeatures()
	{
		List list;
		String multilineString = "Want \n \n (Sr Project Manager) \n to go to Delhi NCR first \n for job";
		List<String> lines = multilineString.lines()
		  .filter(line -> !line.isBlank())
		  .map(String::strip)
		  .collect(Collectors.toList());
		//assertThat(lines).containsExactly("Baeldung helps", "developers", "explore Java.");
		
		return lines;
	}

	//Creation of Immutable  Map
	public Map <Integer, String> immutableMap()
	{				
		Map<Integer, String> mutableMap = new HashMap<>();
		mutableMap.put(3, "Australia");
		mutableMap.put(4, "Singapore");
		//Converting mutable map to immutable map
		
		Map<Integer, String> unmodifiableMap = Collections.unmodifiableMap(mutableMap);
		
		// creating of non-empty immutable map directly
        Map<Integer, String> immutable2 = Map.of(1, "USA", 2, "UK");
        immutable2.forEach ((k,v) -> System.out.println ("PriorityKey = " + k + ", Value = " + v));
		
        return unmodifiableMap;
		
	}
	
	interface LambdaInterface{
		void confirm (int n);
	}
	
	public static void main(String[] args) {		
		CheckJavaNewFeatures checkJavaNewFeatures = new CheckJavaNewFeatures();
		System.out.println("Check Java New Features");
		ArrayList <Integer> al = new ArrayList <Integer> ();
		
		al.add(27);
		al.add(28);
		al.add(29);
		
		/** Lambda expression saves a lot of code and help in faster Collection iteration
		Consumer interface can store the Lambda expression in a variable **/
		Consumer <Integer> consumer = (n) -> { System.out.println (n); };
		al.forEach(consumer);
		
		LambdaInterface li = (n) -> {System.out.println (n);};
		li.confirm(29);		
		
		//Immutable Map
		 Map <Integer, String> m = checkJavaNewFeatures.immutableMap();
		 m.forEach ((k,v) -> System.out.println ("PriorityKey = " + k + ", Value = " + v));
		
		
		 //Java 11 features for use of new String utility methods
		 List <String> list = checkJavaNewFeatures.javaElevenFeatures();
		 list.forEach ((k) -> System.out.println ("Values : " + k));
		

	}

}
