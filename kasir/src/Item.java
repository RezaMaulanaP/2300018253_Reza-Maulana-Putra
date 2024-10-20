public class Item {
    private String kodeItem;
    private String namaItem;
    private double hargaItem;
    private int jumlahItem;

    public Item(String kodeItem, String namaItem, double hargaItem, int jumlahItem) {
        this.kodeItem = kodeItem;
        this.namaItem = namaItem;
        this.hargaItem = hargaItem;
        this.jumlahItem = jumlahItem;
    }

    public String getKodeItem() {
        return kodeItem;
    }

    public String getNamaItem() {
        return namaItem;
    }

    public double getHargaItem() {
        return hargaItem;
    }

    public int getJumlahItem() {
        return jumlahItem;
    }

    public double getSubTotal() {
        return hargaItem * jumlahItem;
    }
}
