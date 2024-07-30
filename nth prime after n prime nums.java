import java.util.*;
class Nthprime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("N:");
        int N=sc.nextInt();
        int nthprime=findnth(N);
        System.out.println(N + "prime num: "+nthprime);
        ArrayList<Integer> nextprime=findprime(nthprime,N);
        System.out.println(nextprime);
    }
    public static int findnth(int N){
        int count=0;
        int num=1;
        while(count<N){
            num++;
            if(isprime(num)){
                count++;
            }
        }
        return num;
    }
    public static ArrayList<Integer> findprime(int start,int N){
        ArrayList<Integer> prime=new ArrayList<>();
        int count=0;
        int num=start;
        while(count<N){
            num++;
            if(isprime(num)){
                prime.add(num);
                count++;
            }
        }
        return prime;
    }
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
