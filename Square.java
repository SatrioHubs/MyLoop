import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nilai N: ");
        int N = sc.nextInt();

        for (int iouter = 1; iouter <= N; iouter++) {
            for (int i = 1; i <= N; i++) {
            System.out.print("*");
        }
        System.out.println();
        }
        
    }
}
