import java.util.ArrayList;
import java.util.List;

public class Cashier {
    private List<Item> items;

    public Cashier() {
        this.items = new ArrayList<>();
    }

    public void addItem(String kode, String nama, double harga, int jumlah) {
        Item item = new Item(kode, nama, harga, jumlah);
        items.add(item);
    }

    public void viewItems() {
        System.out.println("Daftar Item:");
        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "Kode", "Nama", "Harga", "Jumlah", "SubTotal");

        for (Item item : items) {
            System.out.printf("%-10s %-20s %-10.2f %-10d %-10.2f\n",
                    item.getKodeItem(), item.getNamaItem(), item.getHargaItem(),
                    item.getJumlahItem(), item.getSubTotal());
        }
    }

    public double getTotalHarga() {
        double total = 0;
        for (Item item : items) {
            total += item.getSubTotal();
        }
        return total;
    }

    public double prosesPembayaran(double dibayar) {
        double totalHarga = getTotalHarga();
        if (dibayar < totalHarga) {
            System.out.println("Uang tidak cukup!");
            return -1;
        } else {
            return dibayar - totalHarga;
        }
    }
}
