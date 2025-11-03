import java.util.Scanner;

public class sedang2 {
     // Method untuk menghitung volume tabung dengan parameter radius dan tinggi
    public static double hitungVolumeTabung(double radius, double tinggi) {
        // Rumus volume tabung: π * r^2 * h
        return Math.PI * radius * radius * tinggi;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input jari-jari dan tinggi
        System.out.print("Masukkan jari-jari alas tabung (cm): ");
        double radius = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung (cm): ");
        double tinggi = scanner.nextDouble();
        // Panggil method untuk menghitung volume
        double volume = hitungVolumeTabung(radius, tinggi);
        // Tampilkan hasil dengan format 2 desimal
        System.out.printf("Volume tabung adalah: %.2f cm³\n", volume);
        scanner.close();
    }
}

    

