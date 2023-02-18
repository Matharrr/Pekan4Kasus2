package p4.kasus2;

public class MenuMakanan {
    private String namaProduk;
    private int hargaProduk;
    private int stok;

    public MenuMakanan(String namaProduk, int stok,  int hargaProduk) {
        this.namaProduk = namaProduk;
        this.stok = stok;
        this.hargaProduk = hargaProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }
    
    public int getStok(){
        return stok;
    }

    public int getHargaProduk() {
        return hargaProduk;
    }

    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    
    public void setStok(int stok){
        this.stok = stok;
    }
    
    public void setHargaProduk(int hargaProduk){
        this.hargaProduk = hargaProduk;
    }
}