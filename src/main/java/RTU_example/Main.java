package RTU_example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
		Runtime.getRuntime().exec(new String[]{"javaw", "-cp", System.getProperty("java.class.path"), "RTU_example"});
    }
}
