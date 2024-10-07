public class Feline implements Mammal {
    @Override
    public MammalDetails createAbout() { 
        return new AboutCat();
    }
    @Override
    public Mammal createMammal() {
        return new Cat();
    }
    @Override
    public void print() { }
}