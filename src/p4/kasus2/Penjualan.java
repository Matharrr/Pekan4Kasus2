package p4.kasus2;

public class Penjualan {
    private MenuMakanan produk;
    private int quantity;
    private int hargaTotal;

    public Penjualan(MenuMakanan produk, int quantity) {
        this.produk = produk;
        this.quantity = quantity;
        this.hargaTotal = produk.getHargaProduk() * quantity;
    }

    public MenuMakanan getProduk() {
        return produk;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getHargaTotal() {
        return hargaTotal;
    }
}