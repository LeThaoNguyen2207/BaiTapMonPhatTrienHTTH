import java.util.InputMismatchException;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
			System.out.printf("Nhap n = ");
			int n1 = sc.nextInt();
			int n =0;
			if(n<0)
				System.out.println("Loi: n<0");
			else{
				if(n1%2==0){
					System.out.printf("k la so nguyen to",n1);
				}
				else{
					System.out.printf("La so nguyen to",n1);
				}sc.close();
			}
		}catch (InputMismatchException e) {
			System.out.println("Khong duoc nhap chu");
		}
    }
}

