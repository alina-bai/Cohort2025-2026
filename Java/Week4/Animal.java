package Week4;
class Animal {
    public void makeSound() {
        System.out.println("Animal make some sound.");
    }
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog1 dog = new Dog1();
        Cat cat = new Cat();

        genericAnimal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
class Dog1 extends Week4.Animal {
    @Override
    public void makeSound() {
        System.out.println("Dogs Bark ");
    }
}
class Cat extends Week4.Animal {
    @Override
    public void makeSound() {
        System.out.println("Cats Meow ");
    }
}