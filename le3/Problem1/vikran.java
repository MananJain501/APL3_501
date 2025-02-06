
class Vikarn extends Kaurav {

    public Vikarn() {
        super("Vikarn");
        this.isKind = true; 
    }

    @Override
    public void fight() {
        System.out.println(name + " is fighting nobly.");
    }

    @Override
    public void kind() {
        System.out.println(name + " is kind and noble.");
    }

    @Override
    public void obey() {
        System.out.println(name + " is obedient and follows orders.");
    }
}