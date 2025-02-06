
class Pandav extends Bharatvanshi {

    public Pandav(String name) {
        super(name);
        this.isKind = true; 
    }

    @Override
    public void fight() {
        System.out.println(name + " is fighting bravely.");
    }

    @Override
    public void kind() {
        System.out.println(name + " is kind.");
    }
}
