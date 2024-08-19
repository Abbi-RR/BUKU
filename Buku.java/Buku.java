public class Buku {
    private int id;
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    // Constructor
    public Buku(int id, String judul, String pengarang, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Method untuk menampilkan informasi buku
    public void infoBuku() {
        System.out.println("ID Buku: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println();  // Baris kosong untuk pemisah antar buku
    }

    public static void main(String[] args) {
        // Membuat lima objek Buku dengan data yang berbeda
        Buku buku1 = new Buku(1, "Tutorial menjadi sigma", "AbiSangSigma", 1945);
        Buku buku2 = new Buku(2, "5 cara agar tidak jomblo", "AbdulRR", 1980);
        Buku buku3 = new Buku(3, "Cara mengubah dosa menjadi saldo dana", "HerryQS", 1888);
        Buku buku4 = new Buku(4, "Kisi kisi tanya jawab alam kubur", "AbiahliKubur", 1200);
        Buku buku5 = new Buku(5, "Tutorial menikahi karakter nonfiksi", "SigitRendang", 2006);

        // Menampilkan informasi setiap buku
        buku1.infoBuku();
        buku2.infoBuku();
        buku3.infoBuku();
        buku4.infoBuku();
        buku5.infoBuku();
    }
}