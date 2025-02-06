public class Lazy {
   
    private static Lazy instance;

    private Lazy() {
    }

   
    public static Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello from LazySingleton");
    }
}
