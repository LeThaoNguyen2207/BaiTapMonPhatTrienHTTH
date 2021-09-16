import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args){
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n = ");
		n = sc.nextInt();			
		for(int i=0; i<=n; i++)
		{
				sum +=i;
		}
        System.out.println("\n Tong cac so nguyen tu 1 den N " +n+ "=" + sum);
    }
}

