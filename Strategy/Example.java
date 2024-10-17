public class Example {
    
    
    public static void main(String [] args) {
        Instrument guitar = new Guitar();
        Instrument violin = new Violin();
        guitar.makeASound();
        violin.makeASound();
        violin.setSoundType(new Amplifier()); // dynamic form 
        violin.makeASound();
    }
    
}
