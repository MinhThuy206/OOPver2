package animal;

public class TestMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat("KiO");
        cat1.greets();
        Dog dog1 = new Dog("Apolo");
        dog1.greets();

        Animal animal1 = new Cat("Mian");
        animal1.greets();
        Animal animal2 = new Dog("Kaki");
        animal2.greets();
        Animal animal3 = new BigDog("Hinga");
        animal3.greets();

//        Animal animal4 = new Animal() {

    }
}
