import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jenis suhu yang akan di konversi dengan menggunakan symbol C F R
        System.out.print("Masukkan jenis suhu (C untuk Celsius, F untuk Fahrenheit, R untuk Reamur): ");
        char jenisSuhu = input.next().charAt(0);

        // ini perintah untuk memasukan nilai suhu
        System.out.print("Masukkan suhu: ");
        double suhuAwal = input.nextDouble();

        // Inisialisasi variabel hasil konversi
        double suhuKonversi = 0;
        String statusKelipatan = "";

        // Konversi suhu sesuai dengan jenis suhu yang diinputkan
        switch (jenisSuhu) {
            case 'C':
            case 'c':
                suhuKonversi = (suhuAwal * 9 / 5) + 32;
                break;
            case 'F':
            case 'f':
                suhuKonversi = (suhuAwal - 32) * 5 / 9;
                break;
            case 'R':
            case 'r':
                suhuKonversi = suhuAwal * 5 / 4;
                break;
            default:
                System.out.println("Jenis suhu tidak valid.");
                // Menutup scanner
                input.close();
                return;
        }

        // Validasi kelipatan 2 dan 5
        if (suhuKonversi % 2 == 0 && suhuKonversi % 5 == 0) {
            statusKelipatan = "Kelipatan 2 dan 5";
        } else {
            statusKelipatan = "Bukan kelipatan 2 dan 5";
        }

        // Menampilkan hasil konversi
        System.out.println("Hasil konversi ke fahrenhite : " + suhuKonversi);
        System.out.println("Status kelipatan: " + statusKelipatan);

        // Menutup scanner
        input.close();
    }
}
