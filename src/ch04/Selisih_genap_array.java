package selisih_genap_array;

public class Selisih_genap_array {

    public static void main(String[] args) {
      int[] data = 
      {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
      //memanggail fungsi selisih()
      selisih(data);
              
    }
    static void selisih(int data[]) {
        int data_max = data[0];
        int data_min = data[0];
        for(int i =0; i < data.length; i++){
        // mencari data terkecil
        if(data[i] < data_min)
            data_min = data[i];
        
        // mencari data terbesar
        if(data[i] > data_max)
            data_max = data[i];
        }
    }
}
        
      