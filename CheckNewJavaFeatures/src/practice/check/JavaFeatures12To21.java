package practice.check;

//Java features Record for immutable class
record Person (String id, String name) {}


public class JavaFeatures12To21 {
    public static void main (String a[]){
        Person p = new Person ("yyyy", "CSM");

        System.out.println ("Hello " +  p.name());
        System.out.println ("Your Id is : " +  p.id());


    }

}
