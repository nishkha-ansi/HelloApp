public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("HELLO USER");
        } else {
            for (String name : args) {
                System.out.print(name.toUpperCase() + " ");
            }
        }
    }
}