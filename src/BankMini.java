import java.util.Scanner;

public class BankMini {
    public static void main(String[] args) {
        // 7. Uji coba mengakses field private secara langsung dari main:
        // Pesan error saat dicompile: error: saldo has private access in Rekening
        // rekening.saldo = 1000000;

        // Membuat object Rekening dengan data awal: nomor 001, pemilik Ani, saldo 100.000[cite: 110]
        Rekening rekening = new Rekening("001", "Ani", 100000);
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.print("Menu (1 setor, 2 tarik, 3 info, 0 keluar): ");
            pilihan = scanner.nextInt();

            if (pilihan == 1) {
                System.out.print("Jumlah: ");
                int jumlah = scanner.nextInt();
                if (rekening.setor(jumlah)) {
                    System.out.println("Berhasil");
                } else {
                    System.out.println("Ditolak");
                }
            } else if (pilihan == 2) {
                System.out.print("Jumlah: ");
                int jumlah = scanner.nextInt();
                if (rekening.tarik(jumlah)) {
                    System.out.println("Berhasil");
                } else {
                    System.out.println("Ditolak");
                }
            } else if (pilihan == 3) {
                rekening.cetakInfo();
            } else if (pilihan == 0) {
                // Keluar dari menu
            } else {
                System.out.println("Menu tidak dikenal.");
            }
        } while (pilihan != 0);

        // 6. Sesudah keluar dari menu, cetak info rekening sekali lagi sebagai saldo akhir
        System.out.println("\n========= SALDO AKHIR =========");
        rekening.cetakInfo();

        scanner.close();
    }
}