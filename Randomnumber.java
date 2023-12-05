import java.util.Random;

public class Randomnumber {

    public static int randomNumber(int arr[]) {
        Random random = new Random();
        int randomIndex = random.nextInt(arr.length);
        return arr[randomIndex];
    }

    public static void rand(int arr[]) {
        int randomnumber = (int) (Math.random() * 9);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == randomnumber) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int num = randomNumber(arr);
        System.out.println(num);
        rand(arr);

    }
}
