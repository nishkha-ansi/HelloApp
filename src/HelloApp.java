public class HelloApp {
    public static void main(String[] args) {
 feature/UC5-uppercase
        if (args.length == 0) {
            System.out.println("HELLO USER");
        } else {
            for (String name : args) {
                System.out.print(name.toUpperCase() + " ");
            }
        }

 dev
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello User");
        }

        System.out.println("Hello World");
 main
dev
    }
}