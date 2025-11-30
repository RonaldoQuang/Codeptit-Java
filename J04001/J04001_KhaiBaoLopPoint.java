package J04001;

import java.util.*;

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

public class J04001_KhaiBaoLopPoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            double x=sc.nextDouble(), y=sc.nextDouble();
            double z=sc.nextDouble(), k=sc.nextDouble();
            Point a=new Point(x,y);
            Point b=new Point(z,k);
            System.out.printf("%.4f",a.kc(b));
            System.out.println();
        }
    }
}
