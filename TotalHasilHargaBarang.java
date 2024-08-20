import java.util.Scanner;

public class TotalHasilHargaBarang {
    public static void main(String[] args) {
        double awalHarga, diskon, jumlahBarang, akhirHarga;

        Scanner scan = new Scanner (System.in);
        System.out.println("masukan harga");
        awalHarga= scan.nextDouble();
        System.out.println("masukan jumlah barang");
        jumlahBarang= scan.nextDouble();
        System.out.println("masukan diskon");
        diskon= scan.nextDouble();

        akhirHarga= awalHarga*jumlahBarang;
        diskon=diskon/100*akhirHarga;

        akhirHarga = akhirHarga-diskon;

        System.out.println("total= "+akhirHarga);


    }

}
