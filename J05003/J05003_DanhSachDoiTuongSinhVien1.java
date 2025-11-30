package J05003;

import java.util.*;

class sv{
    private String msv, ten, lop, dob;
    private float gpa;
    public sv(String msv, String ten, String lop, String dob, float gpa){
        this.msv=msv;
        this.ten=ten;
        this.lop=lop;
        this.dob=dob;
        this.gpa=gpa;
    }
    public void chuanhoa(){
        String[] a=this.dob.split("/");
        String d=a[0];
        String m=a[1];
        String y=a[2];
        if(d.length()==1) d="0"+d;
        if(m.length()==1) m="0"+m;
        this.dob=d+"/"+m+"/"+y;
    }
    public void kq(){
        System.out.printf("%s %s %s %s %.2f",msv,ten,lop,dob,gpa);
        System.out.println();
    }
}

public class J05003_DanhSachDoiTuongSinhVien1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<sv> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String msv;
            if(i<10) msv="B20DCCN00"+String.valueOf(i);
            else msv="B20DCCN0"+String.valueOf(i);
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String dob=sc.next();
            float gpa=sc.nextFloat();
            sv x=new sv(msv,ten,lop,dob,gpa);
            x.chuanhoa();
            a.add(x);
        }
        for(sv x:a){
            x.kq();
        }
    }
}
