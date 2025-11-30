package J04006;

import java.util.*;

class Sv{
    private String ma="B20DCCN001", ten, lop, dob;
    private float gpa;
    public Sv(){
        this("","","",0f);
    }
    public Sv(String ten, String lop, String dob, float a){
        this.ten=ten;
        this.lop=lop;
        this.dob=dob;
        this.gpa=a;
    }
    public void chuanhoa(){
        String[] a=dob.split("/");
        String d=a[0];
        String m=a[1];
        String y=a[2];
        if(d.length()==1) d="0"+d;
        if(m.length()==1) m="0"+m;
        this.dob=d+"/"+m+"/"+y;
    }
    public void kq(){
        System.out.printf("%s %s %s %s %.2f\n", ma, ten, lop, dob, gpa);
    }
}

public class J04006_KhaiBaoLopSinhVien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int t=sc.nextInt();
        //while(t-->0){
        String ten=sc.nextLine();
        String lop=sc.nextLine();
        String dob=sc.nextLine();
        float a=sc.nextFloat();
        Sv x=new Sv(ten,lop,dob,a);
        x.chuanhoa();
        x.kq();
        //}
    }
}
