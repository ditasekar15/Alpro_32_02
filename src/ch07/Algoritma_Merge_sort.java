package algoritma_merge_sort;
public class Algoritma_Merge_sort {
    public static void main(String[] args) {
        int data[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
     System.out.println("Sebelum di Urutkan merge sort ");
     for(int i = 0; i < data.length; i++)
     {
        System.out.print(data[i]+" ");
     }
     System.out.println();
      
     initializemergeSort(data,0,data.length-1);
     System.out.println();   
     System.out.println("Setelah di Urutkan merge sort ");
     for(int i = 0; i < data.length; i++)
     {
        System.out.print(data[i]+" ");
     }

}
   public static void initializemergeSort(int data[], int l, int h)
  { 
     int low = l;
     int high = h;
     if (low>=high)
     {
        return;
     }
     int middle=(low+high)/2;
     initializemergeSort(data,low,middle);
     initializemergeSort(data,middle+1,high);
     int end_low=middle;
     int start_high=middle+1;
     while ((l<=end_low) && (start_high<=high))
     {
        if (data[low]<data[start_high])
        {
           low++;
        }
        else
      {
           int Temp=data[start_high];
           for (int k=start_high-1;k>=low;k--)
           {
              data[k+1]=data[k];
           }
           data[low]=Temp;
           low++;
           end_low++;
           start_high++;
      }
    }
  }  
} 

