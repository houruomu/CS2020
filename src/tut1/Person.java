package tut1;
public class Person implements IPerson {
    public String name;
    
    public Person(String name){
        this.name = name;
    }
    
    public String name(){
        return this.name;
    }
    
    public void name(String name){
        this.name = name;
        System.out.println("I am now " + name + "!");
    }
    
    public void greeting(String someone){
        System.out.println("Hello, " + someone + "!");
    }
    
    public void introduce(){
        System.out.println("I am " + name + "!");
    }
    
    public static void main (String[] args) {
        Person foo = new Person("Ruomu");
        foo.greeting("David");
        foo.introduce();
        
        foo.name("Lightbutt");
        foo.greeting("Richard");
        foo.introduce();
    }
}