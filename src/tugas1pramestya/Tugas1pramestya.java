package tugas1pramestya;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author I Gusti Ayu Putu Pramestya Arista Dewi 2201010198
 */
public class Tugas1pramestya {
     public static void main(String[] args) {
        BufferedReader dtIN = new BufferedReader(new InputStreamReader(System.in) );
        
        Double luas;
        int alas = 0;
        int tinggi = 0;
        String nilaiAlas = "";
        String nilaiTinggi = "";
        
        System.out.println("Hitung luas segitiga");
        try {
            System.out.print("Input nilai alas: ");
            nilaiAlas = dtIN.readLine();
            System.out.print("Input nilai tinggi: ");
            nilaiTinggi = dtIN.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        
        alas = Integer.parseInt(nilaiAlas);
        tinggi = Integer.parseInt(nilaiTinggi);
        
        luas = 0.5 * alas * tinggi;
        
        System.out.println("Luas Segitiga: " + luas);
    }
}