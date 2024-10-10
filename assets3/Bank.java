class AkunBank {
    int saldo;

    // Konstruktor untuk menetapkan saldo awal
    AkunBank(int saldoAwal) {
        saldo = saldoAwal;
    }

    // Method untuk menyimpan uang
    void simpanUang(int jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: Rp. " + jumlah);
    }

    // Method untuk mengambil uang
    void ambilUang(int jumlah) {
        saldo -= jumlah;
        System.out.println("Ambil uang: Rp. " + jumlah);
    }

    // Method untuk menampilkan saldo saat ini
    void tampilkanSaldo() {
        System.out.println("Saldo saat ini: Rp. " + saldo);
    }

    public static void main(String[] args) {
        // Membuat objek AkunBank dengan saldo awal Rp. 100000
        AkunBank akun = new AkunBank(100000);

        // Menampilkan sambutan dan saldo awal
        System.out.println("Selamat Datang di Bank ABC");
        akun.tampilkanSaldo();

        // Menyimpan uang sebesar Rp. 500000
        akun.simpanUang(500000);
        akun.tampilkanSaldo();

        // Mengambil uang sebesar Rp. 150000
        akun.ambilUang(150000);
        akun.tampilkanSaldo();
    }
}
