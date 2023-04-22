class Animals{
    String color;
    String name;
    String size;
    int price;
    Animals(){
        System.out.println("Calling Animals class");
    }
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.size);
        System.out.println(this.price);
    }
}
class Carnivores extends Animals{
    String properties;

    Carnivores(){
        System.out.println("Calling Carnivores class");
    }
}

class Lion extends Carnivores{
    Lion(){
        System.out.println("Calling Lion Class");
    }

}

class Herbivores extends Animals{
    String properties;
    Herbivores(){
        System.out.println("Calling Herbivores class");
    }
}

class Milk_producing_Animals extends Herbivores{
    Milk_producing_Animals(){
        System.out.println("Calling Milk_producing_Animals class");
    }

}
public class Inheritence {
    public static void main(String args[]){
        Milk_producing_Animals M1 = new Milk_producing_Animals();
        M1.name = "Cow";
        M1.color = "Black";
        M1.size = "Medium";
        M1.price = 20000;
        M1.printInfo();

        Lion L1 = new Lion();
        L1.name = "Musafa";
        L1.color = "Yellow";
        L1.size = "Large";
        L1.price = 10000000;
        L1.printInfo();
    }
}
