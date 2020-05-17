package algoritma_sieve_of_eratosthenes;

import java.util.Vector;
public class Algoritma_Sieve_of_Eratosthenes {

   void sieveOfEratosthenes(int n) 
    { 
        
        boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        { 
            
            if(prime[p] == true) 
            { 
               
                for(int i = p*2; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
          
        
        for(int i = 2; i <= n; i++) 
        { 
            if(prime[i] == true) 
                System.out.print(i + " "); 
        } 
    } 
      
     
    public static void main(String args[]) 
    { 
        int n = 40; 
        System.out.print("Berikut ini adalah bilangan prima "); 
        System.out.println("lebih kecil dari atau sama dengan " + n); 
        Algoritma_Sieve_of_Eratosthenes g = new Algoritma_Sieve_of_Eratosthenes(); 
        g.sieveOfEratosthenes(n); 
    } 
} 