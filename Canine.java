public class Canine implements Animal {
    @Override
    public MammalDetails display() { 
        return new AboutDog();
    }

    @Override
    public Mammal createMammal() {
        return new Dog();
    }
}