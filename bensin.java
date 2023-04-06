import java.util.Scanner;

public class bensin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak (km): ");
        double jarak = sc.nextDouble();
        System.out.print("Masukkan kecepatan (km/jam): ");
        double kecepatan = sc.nextDouble();
        double waktu = jarak / kecepatan;
        System.out.println("Waktu tempuh: " + waktu + " jam");
        System.out.print("Masukkan harga bensin per liter: ");
        double harga = sc.nextDouble();
        double konsumsi = 10; // asumsi konsumsi bensin 10 km/liter
        double bensin = jarak / konsumsi;
        double biaya = bensin * harga;
        System.out.println("Konsumsi bensin: " + bensin + " liter");
        System.out.println("Biaya bensin: Rp " + biaya);
    }
}