import java.util.Scanner;

public class ArrayNilai04 {
    public static void main(String[] args) {

        // Scanner
        Scanner scan = new Scanner(System.in);

        // Tipe Data
        int[] nilaiAkhir = new int[10];

        // Proses
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan Nilai Akhir Ke - " + i + " : ");
            nilaiAkhir[i] = scan.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai Akhir ke - " + i + " adalah " + nilaiAkhir[i]);
        }
    }
}