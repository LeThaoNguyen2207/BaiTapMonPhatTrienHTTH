import java.util.Scanner;
public class Bai5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=6;
        int[] a = new int[n];
        System.out.println("Nhap day co 5 so:");
        for(int i = 1; i < n; i++){
            a[i] = sc.nextInt();
        }   
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(a[i]>0){
                sum = sum + a[i];
            }
            
        }
        
        System.out.println("Sum = " + sum);

    }
}
