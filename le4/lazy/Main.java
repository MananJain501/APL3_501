

public class Main
{
	public static void main(String[] args) {
		
        Lazy singleton = Lazy.getInstance();
        Lazy singleton1 = Lazy.getInstance();
       
        singleton.showMessage();
        System.out.println(singleton==singleton1);
        System.out.println(singleton);
        System.out.println(singleton1);
    }
}

	
