package partA.example01;

public class Person {
    public String name; // String name is a property
    public int age; // int age is a property also
    public String address; // String address is a property
    // Lines 4-6 are the values the object stores

    public String greet(String personToGreet){
        return name + " says `Hello " + personToGreet +", how are you?`";
    }
    //String greet is Gio saying hello to tariq

    public String tellJoke(){
        return "What has two thumbs and writes bad code? .... " + name +"!";
    }
}
//String tell joke is objected behavior