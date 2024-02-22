import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        n = inp.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i>0 && i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
            }

        }
    }
}