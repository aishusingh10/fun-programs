public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        InterfaceExample interfaceExample = () -> {
            System.out.println("InterfaceExample");
        };

        interfaceExample.print();

    }
}