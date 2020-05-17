package algoritma_sieve_of_sundaram;
import java.util.Arrays;

public class Algoritma_Sieve_of_Sundaram {

    static int SieveOfSundaram(int n) { 
        
    int data = (n - 2) / 2; 
    boolean marked[] = new boolean[data + 1]; 
  
    Arrays.fill(marked, false); 
    for (int i = 1; i <= data; i++) 
    for (int j = i; (i + j + 2 * i * j) <= data; j++) 
        marked[i + j + 2 * i * j] = true; 
   
    if (n > 2) 
    System.out.print(2 + " "); 
  
    for (int i = 1; i <= data; i++) 
    if (marked[i] == false) 
        System.out.print(2 * i + 1 + " "); 
    return -1; 
} 
  

    public static void main(String[] args) { 
    int n = 40; 
    SieveOfSundaram(n); 
    
    } 
} 