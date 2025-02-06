
class Kaurav extends Bharatvanshi {

    // Constructor
    public Kaurav(String name) {
        super(name);
        this.isKind = false; 
    }

    @Override
    public void fight() {
        System.out.println(name + " is fighting with cruelty.");
    }

    @Override
    public void kind() {
        System.out.println(name + " is not kind.");
    }
}
