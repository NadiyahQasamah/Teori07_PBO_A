import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Meminta input pecahan dari pengguna untuk matriks 2x2
            System.out.println("Masukkan elemen-elemen matriks 2x2 sebagai pecahan:");

            Matrix matrix = new Matrix(2, 2);
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("Masukkan pembilang untuk baris " + (i + 1) + " kolom " + (j + 1) + ": ");
                    int numerator = scanner.nextInt();
                    System.out.print("Masukkan penyebut untuk baris " + (i + 1) + " kolom " + (j + 1) + ": ");
                    int denominator = scanner.nextInt();

                    matrix.setElement(i, j, new Fraction(numerator, denominator));
                }
            }

            // Cetak matriks pecahan yang telah dibuat
            System.out.println("Matriks 2x2 Pecahan:");
            matrix.printMatrix();
        }
    }
}