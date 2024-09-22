package ClassParentAndClassSon;

public class Cat extends Animal implements AnimalBehavior{
    public Cat() {
        System.out.println("Вызов конструктора Cat");
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.age = 12;
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }
}


