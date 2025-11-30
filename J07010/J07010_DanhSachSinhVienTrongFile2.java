package J07010;

import java.io.File;
import java.util.*;

class sv{
    private String ma, ten, lop, dob;
    private float gpa;
    public sv(String ma, String ten, String lop, String dob, float a){
        this.ma=ma;
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
        System.out.printf("%s %s %s %s %.2f\n",ma,ten,lop,dob,gpa);
    }
}

public class J07010_DanhSachSinhVienTrongFile2 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("SV.in"));
        List<sv> a=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String ma="B20DCCN"+String.format("%03d",i);
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String dob=sc.nextLine();
            float gpa=sc.nextFloat();
            a.add(new sv(ma,ten,lop,dob,gpa));
        }
        for(sv x:a){
            x.chuanhoa();
            x.kq();
        }
    }
}
