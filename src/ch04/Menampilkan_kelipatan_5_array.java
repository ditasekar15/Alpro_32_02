package menampilkan_kelipatan_5_array;

public class Menampilkan_kelipatan_5_array {

    public static void main(String[] args) {
        System.out.println("mencari kelipatan 5");
      int[] data = 
      {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    
      for(int s = 0; s <= data.length ; s++) {
      if (data[s] % 5 == 0){
              
       
    
    System.out.println(data[s]);
    }
    }
    }
}
