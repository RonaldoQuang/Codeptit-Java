package J05062;

import java.util.*;

class sv{
    private String ten;
    private float gpa, drl;
    public sv(String ten, float gpa, float drl){
        this.ten=ten;
        this.gpa=gpa;
        this.drl=drl;
    }
    public String getTen() {
        return ten;
    }
    public float getGpa() {
        return gpa;
    }
    public float getDrl() {
        return drl;
    }
}
public class J05062_HocBongSinhVien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt();
        List<sv> a=new ArrayList<>();
        List<Float> b=new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ten=sc.nextLine();
            float gpa=sc.nextFloat(), drl=sc.nextFloat();
            a.add(new sv(ten,gpa,drl));
            if(gpa>=2.5&&drl>=70) b.add(gpa);
        }
        Collections.sort(b,Collections.reverseOrder());
        float san=10f;
        if(k>b.size()) san=b.get(b.size()-1);
        else san=b.get(k-1);
        for(sv x:a){
            if(x.getGpa()>=san){
                if(x.getGpa()>=3.6&&x.getDrl()>=90) System.out.println(x.getTen()+": XUATSAC");
                else if(x.getGpa()>=3.2&&x.getDrl()>=80) System.out.println(x.getTen()+": GIOI");
                else if(x.getGpa()>=2.5&&x.getDrl()>=70) System.out.println(x.getTen()+": KHA");
                else System.out.println(x.getTen()+": KHONG");
            }
            else System.out.println(x.getTen()+": KHONG");
        }
    }
}
