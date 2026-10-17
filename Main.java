import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> list = new Vector<>();

        System.out.println("Enter 3 names:");

        for (int i = 0; i < 3; i++) {
            list.add(sc.nextLine());
        }

        System.out.println("Names: " + list);

        sc.close();
    }
}
