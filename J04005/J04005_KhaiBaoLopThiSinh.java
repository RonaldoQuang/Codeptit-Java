package J04005;

import java.util.*;

class sv{
    private String ten, dob;
    private float mon1, mon2, mon3;
    public sv(String ten, String dob, float a, float b, float c){
        this.ten=ten;
        this.dob=dob;
        this.mon1=a;
        this.mon2=b;
        this.mon3=c;
    }
    public void kq(){
        System.out.print(this.ten+" "+this.dob+" ");
        float x=this.mon1+this.mon2+this.mon3;
        System.out.printf("%.1f",x);
    }
}

public class J04005_KhaiBaoLopThiSinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int t=sc.nextInt();
        //while(t-->0){
        String ten=sc.nextLine();
        String dob=sc.nextLine();
        float a=sc.nextFloat(), b=sc.nextFloat(), c=sc.nextFloat();
        sv x=new sv(ten,dob,a,b,c);
        x.kq();
        //}
    }
}
