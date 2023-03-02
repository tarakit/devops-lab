import java.util.Scanner;

public class KotDraxler {
    public static void main(String[] args) {
        int number, sum=0;
        float average;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element:");
        number = scanner.nextInt();
        int [] arrName = new int[number];
        System.out.println("Enter "+ number + "Element");
        for (int i=0; i<number; i++) {
            arrName[i] = scanner.nextInt();
            sum = sum + arrName[i];
        }
        System.out.println("Sum is:"+sum);
        average= (float)sum/number;
        System.out.println("Average is:"+average);
    }
}
