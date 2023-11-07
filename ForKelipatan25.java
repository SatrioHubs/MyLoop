import java.util.Scanner;

public class ForKelipatan25 {
    public static void main(String[] args) {
        Scanner scan25 = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0;
        float rataKelipatan = 0f;

        System.out.println("Masukan bilangan kelipatan (1-9): ");
        kelipatan = scan25.nextInt();

        for (int i = 1; i <= 50; i++){
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
                rataKelipatan++;
            }
        }
        System.out.printf("banyak bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("rata bilangan kelipatan %d dari 1 sampai 50 adalah %f\n", kelipatan, rataKelipatan);
    }
}
