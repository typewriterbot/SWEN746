public class Feline implements Animal {
    @Override
    public MammalDetails display() { 
        return new AboutCat();
    }

    @Override
    public Mammal createMammal() {
        return new Cat();
    }
}