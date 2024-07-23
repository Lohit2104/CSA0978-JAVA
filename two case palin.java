import java.util.*;
class Twocasespalin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Choose:");
        System.out.print("1.String");
        System.out.print("2.Number");
        int choice=sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1:
                System.out.print("String:");
                String str=sc.nextLine();
                if(ispalin(str)){
                    System.out.println("Palindrome");
                }
                else{
                    System.out.println("Not a palindrome");
                }
                break;
            case 2:
                System.out.print("Number:");
                int num=sc.nextInt();
                if(ispalin(num)){
                    System.out.print("palindrome");
                }else{
                   System.out.println("Not a palindrome"); 
                }
                break;
            default:
                System.out.print("Invalid");
        }
    }
    public static boolean ispalin(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean ispalin(int num){
        int temp=num;
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum+=10*digit;
            num/=10;
        }
        return temp==sum;
    }

}
