package menghitung_nilai_tertinggi_x_y_dan_z;
public class Menghitung_nilai_tertinggi_x_y_dan_z {
    public static void main(String[] args) {
        int x = 30, y = 25, z = 12;
        int max;
        System.out.println("number 1 = "+x);
        System.out.println("number 2 = "+y);
        System.out.println("number 3 = "+z);
        max=(y>=x)? y: x;
        max=(z>=max)? z: max;
        System.out.println("Nilai tertingginya adalah angka = "+max);
    }
    
}