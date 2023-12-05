public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        int a = 10;
        int b = 20;

        // swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

        // without third variable

        int c = 100;
        int d = 200;

        c = c - d;
        d = c + d;
        c = d - c;
        System.out.println(c);
        System.out.println(d);

        // bitwise operator

        int f = 400;
        int g = 500;
        f = f ^ g;
        g = f ^ g;
        f = f ^ g;
        System.out.println(f);
        System.out.println(g);

    }
}