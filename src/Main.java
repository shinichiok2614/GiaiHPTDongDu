public class Main {
    static int tinhNghichDaoDongDu(int a, int m){
        int a1=a,m1=m;
        int q,r,y0,y1,y,b;
        q=y0=y=0;
        y1=r=1;
        b=0;
        System.out.printf("%d^-1 mod \t%d=\n",a, m);
        while (r!=0){
            q=m/a;
            r=m%a;
            y=y0-y1*q;
            System.out.printf("%4d\t%4d\t%4d\t%4d\t%4d\t%4d\t%4d\n",m,a,q,r,y0,y1,y);
            m=a;
            a=r;
            y0=y1;
            y1=y;
        }
        System.out.printf("%d^-1 mod \t%d = %d\n",a1, m1,y0);
        return y0;
    }
    public static void main(String[] args) {
        int c=tinhHPTDongDu(5,7,3,11,10,13);
        int c1=tinhHPTDongDu(4,3,3,11,7,13);
        int c2=tinhHPTDongDu(4,3,5,7,7,13);
        int c3=tinhHPTDongDu(4,17,13,24,12,29);
    }

    private static int tinhHPTDongDu(int a1, int a2, int b1, int b2, int c1, int c2) {
        int m=a2*b2*c2;
        int m1=b2*c2;
        int m2=a2*c2;
        int m3=a2*b2;
        int y1=tinhNghichDaoDongDu(m1,a2);
        int y2=tinhNghichDaoDongDu(m2,b2);
        int y3=tinhNghichDaoDongDu(m3,c2);
        int x1=(a1*m1*y1)+(b1*m2*y2)+(c1*m3*y3);
        int x=x1%m;
        System.out.printf("%3d\t%3d\t%3d\t%3d\t%3d\t%3d\t%3d\t%3d\t%3d\n",m,m1,m2,m3,y1,y2,y3,x1,x);
        System.out.println("--------------------------");
        return x;
    }

}