package modul3_insan;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    boolean repeat = true;
    Scanner scanner = new Scanner(System.in);
    Calculation hitung = new Calculation();

    do {
      try {
        System.out.println("\n==Program Menghitung Luas==");
        System.out.println("1. Luas Lingkaran");
        System.out.println("2. Luas Persegi");
        System.out.println("3. Luas Trapesium");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu dengan mengetik angka sesuai yang di atas: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
          case 1:
            System.out.print("\nMasukan jari-jari lingkaran : ");
            double radius = scanner.nextDouble();
            hitung.setCircle(radius);
            hitung.run();
            System.out.println("\nLuas Lingkaran = " + hitung.getCircle());
            break;
          case 2:
            System.out.print("\nMasukan panjang sisi persegi : ");
            double sisi = scanner.nextDouble();
            hitung.setSquare(sisi);
            hitung.run();
            System.out.println("\nLuas Persegi = " + hitung.getSquare());
            break;
          case 3:
            System.out.print("\nMasukan panjang sisi atas atau atap trapesium : ");
            double a = scanner.nextDouble();
            System.out.print("Masukan panjang sisi bawah atau alas trapesium : ");
            double b = scanner.nextDouble();
            System.out.print("Masukan Tinggi Trapesium ");
            double t = scanner.nextDouble();
            hitung.setTrapezoid(a, b, t);
            hitung.run();
            System.out.println("\nLuas Trapesium = " + hitung.getTrapezoid());
            break;
          case 0:
            System.out.println("\nTerima kasih telah menggunakan program saya");
            break;
          default:
            System.out.println("\nOption not available");
            continue;
        }
        repeat = false;
      } catch (InputMismatchException e) {
        System.out.println("\n====Error: Input must be a number====");
        scanner.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
        finally
      {
          System.out.println("Program Selesai!");
      }
    } while (repeat);

    scanner.close();
  }
}
