import java.util.*;
class Agregate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sub1 marks:");
        double s1=sc.nextDouble();
        System.out.println("Enter the sub2 marks:");
        double s2=sc.nextDouble();
        System.out.println("Enter the sub3 marks:");
        double s3=sc.nextDouble();
        System.out.println("Enter the sub4 marks:");
        double s4=sc.nextDouble();
        double avg=(s1+s2+s3+s4)/4;
        System.out.println("Total percentage: "+avg);
        if(avg>=75){
            System.out.println("Distinction");
        }else if(avg>=60&&avg<75){
            System.out.println("First Division");
        }else if(avg>=50&&avg<60){
            System.out.println("Second Division");
        }else if(avg>=40&&avg<50){
            System.out.println("Third Division");
        }else{
            System.out.println("Fail");
        }
    }
}
