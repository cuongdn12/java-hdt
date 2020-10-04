package view;



import java.util.Scanner;
import model.DanhSach;



public class Menu {
    public static void main(String[] args) {
        DanhSach ds=new DanhSach();
        
        while(true){
            System.out.println("1. Nhap Oto");
            System.out.println("2. Nhap xe may");
            System.out.println("3. nhap xe tai");
            System.out.println("4. viet ra ds");
            
                        
            System.out.println("0. Exit");
            System.out.print("Your choice (0->4):");
            
            int choice;
            Scanner in=new Scanner(System.in);
            choice=Integer.parseInt(in.nextLine());
            switch(choice){
                case 0:System.out.println("Bye!!!!");
                       System.exit(0);
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3: ds.nhapXeTai();
                    break;
                case 4:ds.viet();
                    break;
                   
                default:System.out.println("only select 0->7");
                
            }
        }
        
    }
}
