package practice.check;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Java features Record for immutable class
record Person (String id, String name) {}


public class JavaFeatures12To21 {
    public static void main (String a[]){
        //Multiline support
        String s = """
                Hello Like always I am determined to do great job 
                with my upcoming client&organization 
                for benefit of the client&organization
                """;

        Person p = new Person ("yyyy:yyyy:yyyy:yyyy", "CSM");

        System.out.println ("Hello " +  p.name());
        System.out.println ("Your Id is : " +  p.id());

        System.out.println (s);

        try(ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()){

            for (int i=0; i < 5 ; i++){
                final int taskid = i;
                executor.submit(() ->{
                    System.out.println ("Task id running is : " + taskid);
                    try {
                        Thread.sleep(1000); // Simulate blocking operation
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Java New features Task " + taskid + " completed");
                });
            }//end of for

        }//end of try
        System.out.println ("All tasks submitted");

    }//end of method

}
