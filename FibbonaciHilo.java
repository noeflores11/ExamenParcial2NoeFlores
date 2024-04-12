public class FibbonaciHilo extends Thread {
    private int num;

    public FibbonaciHilo(int num) {
        this.num = num;
    }

    public void run() {
        int n1 = 0, n2 = 1, n3;
        System.out.println("Los primeros " + num + " números de la serie de Fibonacci son: ");

        System.out.print(n1 + " " + n2);

        for (int i = 2; i < num; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
