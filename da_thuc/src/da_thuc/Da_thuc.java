/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da_thuc;

/**
 *
 * @author dangngoccuong
 */
public class DaThuc {
  private double a[];
    private int n;
    DaThuc(){}
    DaThuc(int m){
        n=m;
        a= new double[n+1];
    }
    DaThuc(double m[]){
        n= m.length;
        a= new double[n+1];
        a=m;
    }
    public void nhapDaThuc(){
        System.out.print("Nhap bac cua  Da Thuc: ");
        n= nhap.Int();

        a= new double[n+1];
        for(int i=0;i<=n;i++){
            System.out.print("Nhap chi so bac "+i+" : ");
            a[i]= nhap.Int();

        }
    }
    public void inDaThuc(){
        System.out.print(" Da Thuc : "+a[0]);
        for(int i =1; i<=n; i++){
            System.out.print("+("+a[i]+")x^"+i);
        }
        System.out.println();
    }
    public DaThuc congDaThuc(DaThuc d1){
        DaThuc d;
        int i,j;
        if (n>d1.n) {
            d= new DaThuc(n);
            for( i=0;i<=d1.n;i++){
            d.a[i]= a[i]+d1.a[i];
            }
            for( j=i; j<=n;i++){
                d.a[j]= a[j];
            }
        }
        else {
            d= new DaThuc(d1.n);
            for(i=0;i<=n;i++)
                d.a[i]= a[i]+d1.a[i];
            for(j= i;j<=d1.n;j++)
                d.a[j]= d1.a[j];
        }

        return d;

    }
    public DaThuc truDaThuc(DaThuc d1){
        DaThuc d;
        int i,j;
        if(n>d1.n){
            d= new DaThuc(n);
            for(i=0;i<=d1.n;i++)
                d.a[i]= a[i]-d1.a[i];
            for(j=i;j<=n;j++)
                d.a[j]= a[j];
        }
        else
        {
            d= new DaThuc(d1.n+1);
            for(i=0;i<=n;i++)
                d.a[i]= -d1.a[i];
        }
        return d;
    }
    public DaThuc nhanDaThuc(DaThuc d1)
    {
        DaThuc d;
        int k=d1.n;
        d= new DaThuc(k);
        for(int t= 0; t<=d.n;t++)
            d.a[t]=0;
        int i,j;
        for( i= 0; i<=n;i++){
            for(j=0;j<=d1.n;j++){
                d.a[i+j]= d.a[i+j]+(a[i]*d1.a[j]);
            }
        }
        return d;
    }
    public void chiaDaThuc(DaThuc d1){
        DaThuc kq,sc,sbc,du;
        du= new DaThuc();
        sc= new DaThuc(a);
        sbc= new DaThuc(d1.a);
        kq= new DaThuc(sc.n-sbc.n);
        if(sc.n<sbc.n) System.out.println(" Bac cua so chia nho hon so bi chia");
        else
        {
            while(sc.n>sbc.n)
            {

                kq.a[kq.n]= sc.a[sc.n]/sbc.a[sbc.n];
                du= kq.nhanDaThuc(sbc);
                sc=sc.truDaThuc(du);
            }
            System.out.println(" Thuong la: ");
            kq.inDaThuc();
            System.out.println("So Du: ");
            du.inDaThuc();
        }

    }

}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DaThuc dt1= new DaThuc();
        DaThuc dt2= new DaThuc();

        System.out.println("Nhap Da Thuc 1");
        dt1.nhapDaThuc();
        System.out.println("Nhap Da Thuc 2");
        dt2.nhapDaThuc();

        System.out.println("=====================Da Thuc 1");
        dt1.inDaThuc();
        System.out.println("=====================Da Thuc 2");
        dt2.inDaThuc();
        System.out.println("Tong 2 Da Thuc la:");
        DaThuc tong;
        tong =dt1.congDaThuc(dt2);
        tong.inDaThuc();
        System.out.println("hieu  2 Da Thuc la:");
        DaThuc hieu;
        hieu =dt1.truDaThuc(dt2);
        hieu.inDaThuc();
        System.out.println("tich 2 Da Thuc la:");
        DaThuc tich;
        tich =dt1.nhanDaThuc(dt1);
        tich.inDaThuc();
        System.out.println("thuong 2 Da Thuc la:");
        dt1.chiaDaThuc(dt2);
    }
}
