package J04004;

import java.util.*;

class Phanso{
    private long x, y;
    public Phanso(long x, long y){
        this.x=x;
        this.y=y;
    }
    public long ucln(long a, long b){
        if(b==0) return a;
        return ucln(b,a%b);
    }
    public void rutgon(Phanso b){
        long bc=this.y/ucln(this.y,b.y)*b.y;
        this.x=bc/this.y*this.x;
        b.x=bc/b.y*b.x;
        long a=ucln(this.x+b.x,bc);
        System.out.println((this.x+b.x)/a+"/"+bc/a);
    }
    public void kq(){
        System.out.println(this.x+"/"+this.y);
    }
}

public class J04004_TongPhanSo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int t=sc.nextInt();
        //while(t-->0){
        long x=sc.nextLong(), y=sc.nextLong();
        long z=sc.nextLong(), t=sc.nextLong();
        Phanso a=new Phanso(x,y);
        Phanso b=new Phanso(z,t);
        a.rutgon(b);
        //}
    }
}
