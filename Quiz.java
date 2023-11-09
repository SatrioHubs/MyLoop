import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        char menu = 'y';

        do {
            int numbers = random.nextInt(10)+1;
            boolean success = false;
            do {
                System.out.print("Tebak Angka dari (1-10): ");
                int answer = sc.nextInt();
                sc.nextLine();
                success = (answer == numbers);
                 if (answer > numbers) {
                    System.out.println("Jawaban lebih kecil!");
                } else if(answer < numbers) {
                    System.out.println("jawaban lebih besar!");
                }
            } while (!success);
            System.out.print("Apakah anda ingin mengulang permainan(Y/y)?");
            menu = sc.nextLine().charAt(0);
        } while (menu == 'y'||menu == 'Y');
    }
}
