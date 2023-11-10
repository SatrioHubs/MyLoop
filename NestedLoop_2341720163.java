import java.util.Scanner;

public class NestedLoop_2341720163 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double[][] Marray = new double[5][7];

            for (int i = 0; i < Marray.length; i++) {
                System.out.println("Kota ke-" + i);
                for (int j = 0; j < Marray[0].length; j++) {
                    System.out.print(" Hari ke-" + (j+1) + ": ");
                    Marray[i][j] = sc.nextDouble();
                }
                System.out.println();
            }
            int i = 0;
              for (double[] baris : Marray) {
                System.out.println("Kota ke-"+(i+1)+ " " );
                int jumlah = 0;
                for (double kolom : baris) {
                    System.out.print(kolom + " ");
                    jumlah += kolom;
                }
                System.out.printf("\nRata-rata kota ke-"+(1+1)+ "= %.3f", (double)jumlah/baris.length);
                System.out.println();
                i++;
              }

            // for (int i = 0; i < Marray.length; i++) {
            //     System.out.print("Kota ke-" + (i + 1) + ": ");
            //     for (int j = 0; j < Marray[0].length; j++) {
            //         System.out.print(Marray[i][j] + " ");
            //     }
            //     System.out.println();
            // }
        }
    
}