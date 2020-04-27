package menentukan_bilangan_tersebut_prima_atau_tidak;
public class Menentukan_bilangan_tersebut_prima_atau_tidak {
    public static void main(String[] args) {
        int prima=1;
        int d = 3;
        for(int s =2; s<d; s++){
            if (d%s ==0) { prima=0;
            } 
        }
        if(prima==1)
            { System.out.println(d+ " adalah bilangan prima");
        } else {
            System.out.println(d+ " bukan bilangan prima");
        }
    }
    
}