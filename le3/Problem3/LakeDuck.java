public class LakeDuck extends Duck implements Swimmable, Flyable, Quackable {
    public void fly() {
        System.out.println("Lake Duck is flying.");
    }

    public void quack() {
        System.out.println("Lake Duck is quacking.");
    }
}
