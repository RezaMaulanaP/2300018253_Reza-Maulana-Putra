import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cashier cashier = new Cashier();

        System.out.println("=== Aplikasi Kasir ===");

        boolean selesai = false;
        while (!selesai) {
            System.out.print("Masukkan kode item: ");
            String kode = scanner.nextLine();
            System.out.print("Masukkan nama item: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan harga item: ");
            double harga = scanner.nextDouble();
            System.out.print("Masukkan jumlah item: ");
            int jumlah = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            cashier.addItem(kode, nama, harga, jumlah);

            System.out.print("Tambah item lagi? (y/n): ");
            String lagi = scanner.nextLine();
            if (lagi.equalsIgnoreCase("n")) {
                selesai = true;
            }
        }

        System.out.println("\n--- Daftar Item ---");
        cashier.viewItems();

        double totalHarga = cashier.getTotalHarga();
        System.out.printf("Total Harga: %.2f\n", totalHarga);

        System.out.print("Masukkan jumlah uang dibayar: ");
        double dibayar = scanner.nextDouble();

        double kembalian = cashier.prosesPembayaran(dibayar);
        if (kembalian >= 0) {
            System.out.printf("Kembalian: %.2f\n", kembalian);
        } else {
            System.out.println("Transaksi gagal. Uang tidak cukup.");
        }

        scanner.close();
    }
}
