public class App {
    public static void main(String[] args) {
        int x = 0;

        while (x <= 10) {
            if (x % 2 == 0) {
                System.out.print("Par: ");
                System.out.println(x);
            } else {
                System.out.println("Impar: " + x);
            }
            x++;
        }
    }
}
