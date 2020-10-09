package run;



import java.util.Scanner;
import model.ListOfDocument;



public class Menu {
    public static void main(String[] args) {
        ListOfDocument list=new ListOfDocument();
        
        while(true){
            System.out.println("1. input Book");
            System.out.println("2. input M");
            
            System.out.println("3. List");
            
                        
            System.out.println("0. Exit");
            System.out.print("Your choice (0->4):");
            
            int choice;
            Scanner in=new Scanner(System.in);
            choice=Integer.parseInt(in.nextLine());
            switch(choice){
                case 0:System.out.println("Bye!!!!");
                       System.exit(0);
                    break;
                case 1:list.inputBooK();
                    break;
                case 2:list.inputMagazine();
                    break;
                case 3: list.print();
                    break;
                   
                default:System.out.println("only select 0->7");
                
            }
        }
        
    }
}
