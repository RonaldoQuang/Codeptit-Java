package J05056;

import java.util.*;

class vdv implements Comparable<vdv>{
    private String ma, ten, thuc, ut, ao;
    private int gio_ao, phut_ao, giay_ao;
    public vdv(String ma, String ten, String dob, String bd, String kt){
        this.ma=ma;
        this.ten=ten;
        this.ut="00:00:";
        String[] a=dob.split("/");
        String[] t1=bd.split(":");
        String[] t2=kt.split(":");

        int x=Integer.parseInt(t1[0]), y=Integer.parseInt(t1[1]), z=Integer.parseInt(t1[2]);
        int time_start=x*3600+y*60+z;
        int x1=Integer.parseInt(t2[0]), y1=Integer.parseInt(t2[1]), z1=Integer.parseInt(t2[2]);
        int time_end=x1*3600+y1*60+z1;
        int tg=time_end-time_start;
        int gio_thuc=tg/3600, phut_thuc=(tg%3600)/60, giay_thuc=tg-gio_thuc*3600-phut_thuc*60;
        this.thuc=String.format("%02d",gio_thuc)+":"+String.format("%02d",phut_thuc)+":"+String.format("%02d",giay_thuc);

        int tuoi=2021-Integer.parseInt(a[2]), UT=0;
        if(tuoi>=32){
            UT=3;
            this.ut+="03";
        }
        else if(tuoi>=25){
            UT=2;
            this.ut+="02";
        }
        else if(tuoi>=18){
            UT=1;
            this.ut+="01";
        }
        else this.ut+="00";

        int tg1=tg-UT;
        this.gio_ao=tg1/3600;
        this.phut_ao=(tg1%3600)/60;
        this.giay_ao=tg1-gio_ao*3600-phut_ao*60;
        this.ao=String.format("%02d",this.gio_ao)+":"+String.format("%02d",this.phut_ao)+":"+String.format("%02d",this.giay_ao);
    }
    public String getAo() {
        return ao;
    }
    @Override
    public int compareTo(vdv a){
        if(this.gio_ao!=a.gio_ao) return this.gio_ao-a.gio_ao;
        if(this.phut_ao!=a.phut_ao) return this.phut_ao-a.phut_ao;
        return this.giay_ao-a.giay_ao;
    }
    public void kq(){
        System.out.printf("%s %s %s %s %s ",ma,ten,thuc,ut,ao);
    }
}


public class J05056_XepHangVanDongVien2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<vdv> a=new ArrayList<>();
        Map<String,Integer> mp=new HashMap<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            String ma="J05015.VDV"+String.format("%02d",i);
            String ten=sc.nextLine();
            String dob=sc.nextLine();
            String bd=sc.nextLine();
            String kt=sc.nextLine();
            a.add(new vdv(ma,ten,dob,bd,kt));
        }
        Collections.sort(a);
        int rank=1;
        for(vdv x:a){
            if(!mp.containsKey(x.getAo())){
                mp.put(x.getAo(),rank);
            }
            ++rank;
        }
        for(vdv x:a){
            x.kq();
            System.out.println(mp.get(x.getAo()));
        }
    }
}
