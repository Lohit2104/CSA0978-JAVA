import java.util.*;
class PoseNegavg{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int possum=0,negsum=0;
        int poscount=0,negcount=0;
        int num;
        System.out.print("Enter -1 to exit");
        while(true){
            System.out.println("Enter the numbers:");
            num=sc.nextInt();
            if(num==-1){
                break;
            }
            if(num>0){
                possum+=num;
                poscount++;
            }
            else if(num<0){
                negsum+=num;
                negcount++;
            }
        }
        if(poscount>0){
            double pavg=(double)possum/poscount;
            System.out.println("Positive average: "+pavg);
        }else{
            System.out.println("No positive numbers:");
        }
        if(negcount>0){
            double navg=(double)negsum/negcount;
            System.out.println("negative average: "+navg);
        }else{
            System.out.println("No negative numbers");
        }
    }
}
