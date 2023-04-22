
class pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }

}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
}
public class OOPS {
    public static void main(String args[]){
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "ball";

        pen pen2 = new pen();
        pen2.color = "black";
        pen2.type = "gel";

        pen1.printcolor();
        pen2.printcolor();

        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 10;

        s1.printInfo();
    }
}
