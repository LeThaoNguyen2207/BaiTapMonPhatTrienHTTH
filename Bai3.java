import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args){
        int a = Nhapsonguyen("\n Nhap a = ");
        int b = Nhapsonguyen("\n Nhap b = ");
        int c = Nhapsonguyen("\n Nhap c = ");
        PTB2(a,b,c);
    }
    public static int Nhapsonguyen(String str){
        int x;
        Scanner sc = new Scanner(System.in);
		System.out.print(str);
		x = sc.nextInt();
		return x;
    }
    public static void PTB2(int a, int b, int c)
    {
        if(a==0)
        {
            if(b==0)
            {
                if(c==0)
                    System.out.println("Phuong trinh vo so nghiem");
                else
                    System.out.println("Phuong trinh vo nghiem");

            }
            else 
                System.out.println("Phuong trinh co 1 nghiem la x = " +(-c/b));
        }
        else
        {
            double x1;
            double x2;
            double delta = Math.pow(b,2)-4*a*c;
            if(delta<0)
                System.out.println("\n Phuong trinh vo nghiem");
            else if(delta>0)
            {
                x1=(-b+Math.sqrt(delta))/(2*a);
                x2=(-b+Math.sqrt(delta))/(2*a); 
                System.out.println("\n Phuong trinh co nghiem x1 = " +x1);
                System.out.println("\n Phuong trinh co nghiem x2 = " +x2);
            }
            else
                System.out.println("\n Phuong trinh co nghiem x1= x2=" +(-b/(2*a)));
        }
    }
}

