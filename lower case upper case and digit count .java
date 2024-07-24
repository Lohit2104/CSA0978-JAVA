import java.util.*;
class lowupnumcount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ucount=0,lcount=0,ncount=0;
        char ch;
        System.out.println("Enter * to exit");
        System.out.println("Enter any characters:");
        while(true){
            ch=sc.next().charAt(0);
            if(ch=='*'){
                break;
            }
            if(Character.isUpperCase(ch)){
                ucount++;
            }
            else if(Character.isLowerCase(ch)){
                lcount++;
            }
            else if(Character.isDigit(ch)){
                ncount++;
            }
        }
        System.out.println("Upper case count: "+ucount);
        System.out.println("Lower case count: "+lcount);
        System.out.println("Digit count: "+ncount);
    }
}
