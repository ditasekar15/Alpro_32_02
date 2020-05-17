package algoritma_selection_sort;
public class Algoritma_Selection_sort {
    public static void main(String[] args) {
        int data [] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
       
        for (int s = 0 ; s<data.length-1;s++){
            int min = s;
            for (int f = 1+s ; f<data.length; f++){
                 /*System.out.println(min+" "+f);*/
                if (data[min] > data[f]){
                    min = f;
                }
            }
            int g= data[min];
            data[min] = data [s];
            data[s] = g;
        }
        for (int s = 0 ; s<data.length;s++){
            System.out.print(data[s]+" ");
        }
    }
   
}
