package algoritma_aks_primality_test;
public class Algoritma_AKS_Primality_Test {

   static long c[] = new long[100]; 
  
    static void coef(int n) 
    { 
        c[0] = 1; 
        for (int i = 0; i < n; c[0] = -c[0], i++) { 
            c[1 + i] = 1; 
  
            for (int j = i; j > 0; j--) 
                c[j] = c[j - 1] - c[j]; 
        } 
    } 
  
  
    static boolean isPrime(int n) 
    { 
       
        coef(n); 
  
        
        c[0]++; 
        c[n]--; 
  
      
        int i = n; 
        while ((i--) > 0 && c[i] % n == 0) 
            ; 
  
       
        return i < 0; 
    } 
    
    public static void main(String[] args) 
    { 
        int n = 6; 
        if (isPrime(n)) 
            System.out.println("Prima"); 
        else
            System.out.println("bukan prima"); 
    } 
} 