class Person {
    String Nama;
    String JenisKelamin;
    int Umur;

    // Konstruktor untuk kelas Person
    Person(String Nama, String JenisKelamin, int Umur) {
        this.Nama = Nama;
        this.JenisKelamin = JenisKelamin;
        this.Umur = Umur;
    }

    // Method untuk menampilkan informasi Person
    void tampilkanInfo() {
        System.out.println("Nama: " + Nama);
        System.out.println("Jenis Kelamin: " + JenisKelamin);
        System.out.println("Umur: " + Umur + " tahun");
    }

    public static void main(String[] args) {
        // Membuat dua objek dari class Person: Anton dan Riko
        Person anton = new Person("Anton", "Laki-laki", 30);
        Person riko = new Person("Riko", "Laki-laki", 25);

        // Menampilkan informasi Anton
        System.out.println("Informasi Anton:");
        anton.tampilkanInfo();

        // Menampilkan informasi Riko
        System.out.println("\nInformasi Riko:");
        riko.tampilkanInfo();
    }
}
