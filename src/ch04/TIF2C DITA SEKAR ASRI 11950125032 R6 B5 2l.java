package jumlah_array_dan_angka_setelahnya_hasil_penjumlahan_genap;

public class Jumlah_array_dan_angka_setelahnya_hasil_penjumlahan_genap {

    public static void main(String[] args) {
      int[] data = 
      {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    
      int jumlah = 0;
      
      for(int m = 0; m<data.length; m++)
          jumlah += data[m];
      
      {
          System.out.println("hasil dari penjumlahan array adalah " + jumlah);
      }
    }
}