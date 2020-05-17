package algoritma_bubble_sort;

public class Algoritma_Bubble_sort {
    public static void main(String[] args) {
       int[] data = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
       
       for (int s = 0; s < data.length; s++){
       for (int d = 0; d < data.length-1; d++){
           boolean isUrutanSesuai = data[d] < data[d+1];
           if (isUrutanSesuai){
               int baru = data[d];
               data[d] = data[d+1];
               data[d+1] = baru;
           }
       }
    }
       for (int s = 0; s < data.length; s++){
           System.out.println(data[s]);
           }
        }
    }