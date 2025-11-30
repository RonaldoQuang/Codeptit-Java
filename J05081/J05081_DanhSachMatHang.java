package J05081;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class mh implements Comparable<mh>{
    private String ma, ten, dv;
    private int gm, gb, ln;
    public mh(String ma, String ten, String dv, int gm, int gb, int ln){
        this.ma=ma;
        this.ten=ten;
        this.dv=dv;
        this.gm=gm;
        this.gb=gb;
        this.ln=ln;
    }
    @Override
    public int compareTo(mh a){
        return a.ln-this.ln;
    }
    public void kq(){
        System.out.print(this.ma+" "+this.ten+" "+this.dv+" ");
        System.out.println(this.gm+" "+this.gb+" "+this.ln);
    }
}

public class J05081_DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int t=sc.nextInt();
        //while(t-->0){
            int n=sc.nextInt();
            ArrayList<mh> a=new ArrayList<>();
            for(int i=0;i<n;i++){
                sc.nextLine();
                String ma="";
                if(i<9) ma="MH00"+String.valueOf(i+1);
                else ma="MH0"+String.valueOf(i+1);
                String ten=sc.nextLine();
                String dv=sc.nextLine();
                int gm= sc.nextInt(), gb=sc.nextInt();
                mh x=new mh(ma,ten,dv,gm,gb,gb-gm);
                a.add(x);
            }
            Collections.sort(a);
            for(mh i:a){
                i.kq();
            }
        //}
    }
}
