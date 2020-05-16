package algoriteuclid;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algoriteuclid {
    static final int EXTEUCLID_RET_SIZE = 3;
    static final int INDEX_GCD = 0;
    private static Object AlgoritEuclid;
    
    static int gcd(int a,int b){
        int A = a;  int B = b;
        int q = 0;  int r = 0;
        
        while (B != 0){
        q = A/B;
        r = A - q*B;
        A = B;
        B = r;
        }
    return A;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = 45;
        int b = 36;
        
System.out.println("a: " + a + " b: " + b + " gcd: " + gcd(a, b));
    }
    
}
