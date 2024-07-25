import java.util.*;
class Nthlargest{
    public static int find(int[] arr,int n){
        Arrays.sort(arr);
        return arr[arr.length-n];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("N:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the n largest number:");
        int N=sc.nextInt();
        int largest=find(arr,N);
        System.out.println("Largest array: "+largest);
    }
}
