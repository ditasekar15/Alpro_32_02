package angka_ganjil_di_apit_angka_genap;

public class Angka_ganjil_di_apit_angka_genap {

    public static void main(String[] args) {
        int[] data = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("");
        System.out.print("data Ganjil di apit data genap :  ");
     
        for (int i = 0; i < data.length; i++){
            if (data [i] % 2!= 0){
                System.out.print(data[i] + " ");
            }
        }      
        System.out.println("");
        
    
    }
    }
