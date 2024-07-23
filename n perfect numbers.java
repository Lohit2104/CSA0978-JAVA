import java.util.*;
class Nperfect{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("no.of perfect num:");
        int n=sc.nextInt();
        System.out.println("First"+n+"numbers are");
        int count=0;
        int num=1;
        while(count<n){
            if(isperfect(num)){
                System.out.println(num+" ");
                count++;
            }
            num++;
        }
    }
    public static boolean isperfect(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }
}
