import java.util.Scanner;

public class WhileGaji25 {
    public static void main(String[] args) {
        Scanner scan25 = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.println("Masukan Jumlah Karyawan:  ");
        jumlahKaryawan = scan25.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan Jabatan - Direktur, Manager, Karyawan");
            System.out.println("Masukan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan25.next();
            System.out.println("Masukan Jumlah Jam Lembur");
            jumlahJamLembur = scan25.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manager")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else{
                System.out.println("jabatan Invalid");
                i--;
                continue;
            }

            totalGajiLembur += gajiLembur;
           
        }
         System.out.println("Total Gaji Lembur: " + totalGajiLembur);
    }
}
