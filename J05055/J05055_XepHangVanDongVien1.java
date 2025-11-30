package J05055;

import java.util.*;

class vdv{
    private String ma, ten, thuc, ut, ao;
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
        int gio_ao=tg1/3600, phut_ao=(tg1%3600)/60, giay_ao=tg1-gio_ao*3600-phut_ao*60;
        this.ao=String.format("%02d",gio_ao)+":"+String.format("%02d",phut_ao)+":"+String.format("%02d",giay_ao);
    }
    public String getAo() {
        return ao;
    }

    public void kq(){
        System.out.printf("%s %s %s %s %s ",ma,ten,thuc,ut,ao);
    }
}

class Tg implements Comparable<Tg>{
    private String t;
    private int gio, phut, giay;
    public Tg(String tg){
        this.t=tg;
        String[] a=tg.split(":");
        this.gio=Integer.parseInt(a[0]);
        this.phut=Integer.parseInt(a[1]);
        this.giay=Integer.parseInt(a[2]);
    }
    public String getT() {
        return t;
    }
    @Override
    public int compareTo(Tg a){
        if(this.gio!=a.gio) return this.gio-a.gio;
        if(this.phut!=a.phut) return this.phut-a.phut;
        return this.giay-a.giay;
    }
}

public class J05055_XepHangVanDongVien1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<vdv> a=new ArrayList<>();
        List<Tg> b=new ArrayList<>();
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
        for(vdv x:a) b.add(new Tg(x.getAo()));
        Collections.sort(b);
        int rank=1;
        for(Tg x:b){
            if(!mp.containsKey(x.getT())){
                mp.put(x.getT(),rank);
            }
            ++rank;
        }
        for(vdv x:a){
            x.kq();
            System.out.println(mp.get(x.getAo()));
        }
    }
}
