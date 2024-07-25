import java.util.*;
class Decimalconversion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary number:");
        String binary=sc.nextLine();
        int deci=Integer.parseInt(binary,2);
        String octal=Integer.toOctalString(deci);
        System.out.println("Decimal: "+deci);
        System.out.println("Octal: "+octal);
    }
}
