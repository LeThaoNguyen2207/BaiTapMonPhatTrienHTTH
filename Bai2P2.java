import java.util.Scanner;
public class Bai2P2
{
    int ts,ms;
    Scanner input=new Scanner(System.in);
    public Bai2P2()
    {
    }
    public void Input()
    {
        System.out.print("Nhap tu so: ");
        this.ts=input.nextInt();
        do
        {
        System.out.print("Nhap mau so: ");
        this.ms=input.nextInt();
        } 
        while (this.ms==0);
    }
    public void Output(String y)
    {
        System.out.println(y+" " +this.ts+"/"+this.ms);
    }
    public int UCLN(int a,int b)
    {
        if ((a==0) || (b==0))
            return a+b;
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    public void ToiGian() 
    {
        int i=UCLN(ts,ms);
        this.ts = this.ts/i;
        this.ms = this.ms/i;
    }
    public void NghichDao()
    {
        int tg=this.ts;
        this.ts = this.ms;
        this.ms = tg;
    }
    public Bai2P2 Sum(Bai2P2 f)
    {
        Bai2P2 ps=new Bai2P2();
        ps.ts = ((this.ts*f.ms) + (this.ms*f.ts));
        ps.ms = (this.ms*f.ms);
        ps.ToiGian();
        return ps;
    }
    public Bai2P2 Hieu(Bai2P2 f)
    {
        Bai2P2 ps=new Bai2P2();
        ps.ts = (this.ts*f.ms) - (this.ms*f.ts);
        ps.ms = (this.ms*f.ms);
        return ps;
    }
    public Bai2P2 Tich(Bai2P2 f)
    {
        Bai2P2 ps=new Bai2P2();
        ps.ts = this.ts*f.ts;
        ps.ms = this.ms*f.ms;
        ps.ToiGian();
        return ps;
    }
    public Bai2P2 Thuong(Bai2P2 f)
    {
        Bai2P2 ps=new Bai2P2();
        ps.ts = this.ts*f.ms;
        ps.ms = this.ms*f.ts;
        ps.ToiGian();
        return ps;
    }
    public static void main(String[] argv)    
    {
        Bai2P2 ps1=new Bai2P2();
        Bai2P2 ps2=new Bai2P2();
        ps1.Input();
        ps2.Input();
        ps1.Output("Phan so 1 la: ");     
        ps2.Output("Phan so 2 la: ");
        ps1.ToiGian();
        ps1.Output("Phan so 1 sau khi toi gian la: ");
        ps2.ToiGian();
        ps2.Output("Phan so 2 sau khi toi gian la: ");
        ps1.Sum(ps2).Output("Tong hai phan so la: ");
        ps1.Hieu(ps2).Output("Hieu hai phan so la: ");
        ps1.Tich(ps2).Output("Tich hai phan so la: ");
        ps1.Thuong(ps2).Output("Thuong hai phan so la:");
    }
}
