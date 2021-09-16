import java.util.Scanner;
public class Bai1{
    public static void main(String[] args){
        String k;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Nhap vao chuoi: ");
        k = sc.nextLine();
        System.out.println("\n Chuoi sau khi doi la: \n" + k);
        System.out.println(k.toUpperCase());
    }
}