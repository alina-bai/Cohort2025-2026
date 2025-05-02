package Week4;

public class Dog {
    //attributes
    String name;
    String breed;

    public Dog (String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    //method
    public void bark(){
        System.out.println(name + " barked");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Timmy", "Golden retriever");
        Dog dog2 = new Dog("Max", "German Shepherd");

        dog.bark();
        dog2.bark();

    }

}
