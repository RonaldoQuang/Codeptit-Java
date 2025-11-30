package J04011;

import java.util.*;

class Point3D{
    private int x, y, z;
    public Point3D(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public static boolean check(Point3D A, Point3D B, Point3D C, Point3D D){
        int abx = B.x - A.x, aby = B.y - A.y, abz = B.z - A.z;
        int acx = C.x - A.x, acy = C.y - A.y, acz = C.z - A.z;
        int adx = D.x - A.x, ady = D.y - A.y, adz = D.z - A.z;
        int nx = aby * acz - abz * acy;
        int ny = abz * acx - abx * acz;
        int nz = abx * acy - aby * acx;
        int bt = nx * adx + ny * ady + nz * adz;
        if(bt==0) return true;
        else return false;
    }
}

public class J04011_BonDiemTrenMatPhang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
