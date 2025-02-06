abstract class Bharatvanshi {
    protected String name;
    protected boolean isKind;

    public Bharatvanshi(String name) {
        this.name = name;
        this.isKind = false; 
    }

    public abstract void fight();

    public abstract void kind();

    public void obey() {
        System.out.println(name + " is obeying orders.");
    }
}
