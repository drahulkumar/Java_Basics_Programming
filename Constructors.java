
class Students{
    String name;
    int roll_no;

    Students(){
        System.out.println("Calling Default Constructors");
    }
    Students(String name, int c, int p){
        this.name =name;
        this.roll_no = c;
        if(p>=c){
            System.out.println(this.name + "is a good student");
        }
        else{
            System.out.println(this.name + "is not so good student");
        }
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.roll_no);
    }
    public void printName(){
        System.out.println(this.name);
    }
    public void printName(int x , int y){
        System.out.println(this.name + " got " + x + " marks in Physics " + y +" marks in Chemistry");
    }
}
public class Constructors {
    public static void main(String args[]){
        Students s1 = new Students();
        s1.name = "Rahul";
        s1.roll_no = 23;
        s1.printInfo();
        s1.printName();
        s1.printName(45, 78);

        Students s2 = new Students("Sakshi",2, 4);
        s2.printInfo();
        s2.printName();
        s2.printName(98, 56);


    }
}
