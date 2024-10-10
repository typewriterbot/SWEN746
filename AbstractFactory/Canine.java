public class Canine implements Mammal {
    @Override
    public MammalDetails createAbout() { 
        return new AboutDog();
    }
    @Override
    public Canine createMammal() {
        return new Dog();
    }
    @Override
    public void print(){
        
    }
}