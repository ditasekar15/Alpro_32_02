package algoritma_insertion_sort;

public class Algoritma_Insertion_sort {
    public static void main(String[] args) {
        int[] data = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int s,d,data_sisip;
        
        for(s=1; s<13; s++){ 
            data_sisip = data[s]; 
            d = s; 
            while((d>0) && (data[d-1] > data_sisip)){            
                data[d] = data[d-1]; 
                d = d - 1; 
            }        
            data[d] = data_sisip; 
        } 
        for(s=0; s<13; s++){ 
            System.out.print(data[s]+" ");
        }
    }
}
 