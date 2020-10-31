import java.util.Scanner;

/**
 *
 * @author Diva Sabila Ramadhan
 * Nama  : Diva Dabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : program ini menampilkan untuk menggati kata
 */
public class Kata {

    static Scanner scan = new Scanner(System.in);
    String kalimat, gantiKata, menjadiKata;
    
    public void masukkanKalimat(){
        System.out.print("Masukkan Kalimat : ");
        kalimat = scan.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = scan.next();
        System.out.print("Menjadi Kata : ");
        menjadiKata = scan.next();
    }
     
    public String mengubahKalimat(){
        return kalimat.replaceAll(gantiKata,menjadiKata);
    }
    
    public void tampilKalimat(String hasil){
        System.out.println("\n===Hasil Formatting===");
        System.out.println("Kalimat Awal : ".concat(kalimat));
        System.out.println("Kalimat baru : ".concat(hasil));
        
    }
    public static void main(String[] args) {
        Kata data = new Kata();
        data.masukkanKalimat();
        String hasil = data.mengubahKalimat();
        data.tampilKalimat(hasil);
        System.out.println("Developed by : Diva Sabila Ramadhan");
        
    }
    
}
