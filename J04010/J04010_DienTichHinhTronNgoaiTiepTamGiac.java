package J04010;

import java.util.*;

class Triangle{
    private double a, b, c;
    public Triangle(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void kq(){
        double S=Math.sqrt((this.a+this.b+this.c)*(this.a+this.b-this.c)*(this.a-this.b+this.c)*(-this.a+this.b+this.c));
        double R=(this.a*this.b*this.c)/S;
        System.out.printf("%.3f",Math.PI*R*R);
    }
}

class Point{
    private double x;
    private double y;
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double kc(Point a){
        return Math.sqrt(Math.pow(this.x-a.x,2)+Math.pow(this.y-a.y,2));
    }
}

public class J04010_DienTichHinhTronNgoaiTiepTamGiac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            double a=sc.nextDouble(), b=sc.nextDouble();
            double c=sc.nextDouble(), d=sc.nextDouble();
            double e=sc.nextDouble(), f=sc.nextDouble();
            Point x=new Point(a,b);
            Point y=new Point(c,d);
            Point z=new Point(e,f);
            double ab=x.kc(y);
            double bc=y.kc(z);
            double ca=z.kc(x);
            Triangle w=new Triangle(ab,bc,ca);
            if(ab+bc<=ca||bc+ca<=ab||ca+ab<=bc){
                System.out.print("INVALID");
            }
            else w.kq();
            System.out.println();
        }
    }
}
