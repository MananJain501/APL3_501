public class RubberDuck extends Duck implements Swimmable, Squeakable, Mute {
    public void squeak() {
        System.out.println("Rubber Duck squeaks.");
    }

    public void mute() {
        System.out.println("Rubber Duck is mute.");
    }
}
