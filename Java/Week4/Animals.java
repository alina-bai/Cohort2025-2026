package Week4;

class Animals {
    String name;

    public Animals(String name){
        this.name = name;
    }
    public void makeSound() {
        System.out.println("Animals make some sound.");
    }

    public static void main(String[] args) {
        Animals[] animals = new Animals[3];
        animals[0] = new Lion();
        animals[1] = new Tiger();
        animals[2] = new Bear();

       for (Animals animal : animals) {
           animal.makeSound();
       }
    }
}
class Lion extends Animals {
    public Lion (){
        super ("Lion");
    }
 public void makeSound () {
     System.out.println(name + " Roar");
    }
}

class Tiger extends Animals {
    public Tiger (){
        super("Tiger");
    }
    public void makeSound () {
        System.out.println(name + " Growl");
    }
}
class Bear extends Animals {
    public Bear() {
        super("Bear");
    }
    public void makeSound () {
        System.out.println(name + "  Grunt");
    }
}
