public class ArrayBilangan04 {
    public static void main(String[] args) {

        // Tipe Data
        int[] bil = new int[4];

        // Proses?
        bil[0] = 0;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        System.out.println(bil[0]);
        System.out.println(bil[1]);
        System.out.println(bil[2]);
        System.out.println(bil[3]);

        // Modifikasi - 1

        // Tipe Data
        int bil[] = { 5, 13, -7, 17 };

        System.out.println(bil[0]);
        System.out.println(bil[1]);
        System.out.println(bil[2]);
        System.out.println(bil[3]);

        // Modifikasi - 2

        // Tipe Data
        int bil[] = { 5, 13, -7, 17 };

        // Proses
        for (int i = 0; i <= 4; i++) {
            System.out.println(bil[i]);
        }
    }
}