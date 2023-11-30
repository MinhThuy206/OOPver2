package singleton.demoprogram;

public class Singleton {
    public String value;
    private static Singleton instance;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (Singleton.instance == null) {
            Singleton.instance = new Singleton(value);
        }
        return Singleton.instance;
    }
}
