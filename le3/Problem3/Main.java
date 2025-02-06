public class Main {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.swim();
        rubberDuck.squeak();
        rubberDuck.mute();

        WoodenDuck woodenDuck = new WoodenDuck();
        woodenDuck.swim();
        woodenDuck.mute();

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();

        LakeDuck lakeDuck = new LakeDuck();
        lakeDuck.swim();
        lakeDuck.fly();
        lakeDuck.quack();
    }
}
