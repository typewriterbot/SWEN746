public class Application {
    // endpint client
    public static void main(String [] args) {
        Animal mammal1 = new Feline();
        Mammal cat = mammal1.createMammal(); // class feline will create cat 
        MammalDetails aboutCat = mammal1.createAbout();

        cat.print();
        aboutCat.details();

        Animal mammal2 = new Canine();
        Mammal dog = mammal2.createMammal(); // class Canine creates a dog
        MammalDetails aboutDog = mammal2.createAbout();

        dog.print();
        aboutDog.details();

    }

}