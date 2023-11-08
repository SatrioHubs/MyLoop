import java.util.Scanner;

public class DoWhileCuti25 {
    public static void main(String[] args) {
        Scanner scan25 = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.println("Jatah Cuti: ");
        jatahCuti = scan25.nextInt();

        do {
            System.out.println("Apakah Anda Ingin Mengambil Cuti(y/t)? ");
            konfirmasi = scan25.next();

                if (konfirmasi.equalsIgnoreCase("t")) {
                    break;

                    }else if(konfirmasi.equalsIgnoreCase("y"))
                    System.out.println("jumlah hari: ");
                    jumlahHari = scan25.nextInt();

                    if (jumlahHari <= jatahCuti) {
                        jatahCuti -= jumlahHari;
                        System.out.println("Sisa Jatah Cuti: " + jatahCuti);
                    }else{
                        System.out.println("Sisa Jatah Cuti Anda Tidak Mencukupi!");
                        break;
                    }
                
        } while (jatahCuti > 0);
    }
}
