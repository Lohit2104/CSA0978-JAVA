import java.util.*;
class nthfactor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Enter the nth number:");
        int N=sc.nextInt();
        ArrayList<Integer> factor=new ArrayList<>();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                factor.add(i);
            }
        }
        System.out.println("no.of factors: "+factor.size());
        if(N<=factor.size()){
            System.out.println("Nth factor: "+factor.get(N-1));
        }
        else
        {
            System.out.println("no factors....");
        }
    }
}
