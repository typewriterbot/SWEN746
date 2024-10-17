public abstract class Instrument { 
    private Behavior behavior; 
    
    Instrument(Behavior be) {
        this.behavior = be;    
    }
     public void makeASound() {
        behavior.makeSound();
    }
    public void setSoundType(Behavior b) {
        this.behavior = b;
    }
   
}
