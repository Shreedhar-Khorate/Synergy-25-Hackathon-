import java.util.*;
import java.sql.*;
class Jdbc{
    public void admin(){
        // String discipline;
        // int rollno,enrollmentno,backlog,dropout=0;
        // double per,dropoutPer=0.0;
        int glob=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter admin username:");
        String user=sc.nextLine();
        System.out.println("Enter admin password:");
        String pass=sc.nextLine();
        String tempUsername="Abc";
        String tempPass="admin@123";
        System.out.println("Enter the number of students(max 10) :");
        int num=sc.nextInt();
        String names[]=new String[num];
        int enrollArr[]=new int[num];
        int totalStud=num;
        glob=num;
        int i=1;
        int backlog=0,dropout=0,pos=0;
        double per=0.0,dropoutPer=0.0;


        
        while(i<=num){
        if(user.equals(tempUsername) && pass.equals(tempPass)){
            System.out.println("Welcome: "+user);
            System.out.println("Enter Student name:");
            String studName=sc.next();
            System.out.println("Enter Student discipline:");
            String discipline=sc.next();
            System.out.println("Enter Student rollno:");
            int rollno=sc.nextInt();
            System.out.println("Enter Student enrollment no:");
            int enrollmentno=sc.nextInt();
            System.out.println("Backlogs if any:Y/n");
            char ch=sc.next().charAt(0);
            if(ch=='Y'){
                String dis1=discipline.toUpperCase();
                System.out.println("Enter no of backlogs:");
                backlog=sc.nextInt();
                System.out.println(backlog);
                if(backlog>=4 && dis1.equals("SYCO") || backlog>=1 && dis1.equals("FYCO") || backlog>=1 && dis1.equals("TYCO")){
                    dropout++;
                    names[pos]=studName;
                    enrollArr[pos]=enrollmentno;
                    pos++;
    
                }
                dropoutPer=(double)(dropout*100)/totalStud;
                System.out.println("Total Dropout Students:"+dropout);
                System.out.println("Dropout Statistics:"+dropoutPer);
            }else{
                System.out.println("Enter your percentage:");
                per=sc.nextDouble();
            }
        }else{
            System.out.println("Login Failed!");
        }
        // num++;
        i++;
        }
        System.out.println("Show list? press 1");
        char ch2=sc.next().charAt(0);
        if(ch2=='1'){
            System.out.println("List of dropout students:");
            for(int k=0;k<glob;k++){
            System.out.println(names[k]+" "+enrollArr[k]);
        }
        }
        
   
        

    }
    // public void show(){
    //     System.out.println("List of dropout students:");
    //     for(int i=0;i<glob;i++){
    //         System.out.println(names[i]+" "+enrollArr[i]);
    //     }
    // }

    public void insights(){
        System.out.println("Insights:");
        System.out.println("1.Maintain 75% attendance.\n2.Attend lectures and practicals regularly.\n3.Improve student communication with faculty.\n4.Conduct parent teachers meetings once in every 2 weeks.\n5.If any student is not attending lectures/practicals regularly, he/she will be marked as defaulter and their parents will be informed about the same.\n6.Extra Lectures should be conducted to improve the overall results.\n7.Faculties should keep a track on defaulters along with other students.\n");
    }




}

class Main{
    public static void main(String args[]){
        // System.out.println("---Welcome To-----");
        

        Scanner sc = new Scanner(System.in);
        
        
        Jdbc j=new Jdbc();
        while(true){
            System.out.println("*******************Dropout Rate Analysis System*******************");
            System.out.println("1.Login As Administartor ");
            System.out.println("2.Insights to help reduce dropout rates.");
            
            System.out.println("3.Exit.");
            System.out.println("4.Reasons of dropout.");

            System.out.println("Enter your choice:");
            int ch=sc.nextInt();
            switch(ch){
            case 1:j.admin();
            break;
            case 2:j.insights();
            break;
            case 3:System.exit(0);
            break;
            case 4:System.out.println("Reasons for Dropout\n1.Few Students dont fulfill 75% attendance criteria.\n2.Students dont attend lectures/ practicals\n3.Low performance in periodic tests.\n4.Poor performance in practicals.");
            break;
            default:System.out.println("Invalid choice");
            break;
        }
        }
        
    }
}