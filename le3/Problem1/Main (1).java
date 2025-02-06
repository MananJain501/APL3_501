

public class Main {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Pandav("Arjun");
        Bharatvanshi bheem = new Pandav("Bheem");
        Bharatvanshi duryodhan = new Kaurav("Duryodhan");
        Bharatvanshi vikarn = new Vikarn();

        arjun.fight();
        arjun.kind();
        arjun.obey();

        bheem.fight();
        bheem.kind();
        bheem.obey();

        duryodhan.fight();
        duryodhan.kind();
        duryodhan.obey();

        vikarn.fight();
        vikarn.kind();
        vikarn.obey();
    }
}
