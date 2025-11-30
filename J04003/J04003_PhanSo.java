package J04003;

import java.util.*;

class phanso{
    private long x, y;
    public phanso(long x, long y){
        this.x=x;
        this.y=y;
    }
    public long ucln(long a, long b){
        if(b==0) return a;
        return ucln(b,a%b);
    }
    public void rutgon(){
        long uc=ucln(this.x,this.y);
        this.x/=uc;
        this.y/=uc;
    }
    public void kq(){
        System.out.println(this.x+"/"+this.y);
    }
}

public class J04003_PhanSo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int t=sc.nextInt();
        //while(t-->0){
        long x=sc.nextLong(), y=sc.nextLong();
        phanso a=new phanso(x,y);
        a.rutgon();
        a.kq();
        //}
    }
}
