import java.util.*;
class Specialcharacters{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the statement:");
        String stat=sc.nextLine();
        int count=0;
        for(int i=0;i<stat.length();i++){
            char ch=stat.charAt(i);
            if(!Character.isLetterOrDigit(ch)&& !Character.isWhitespace(ch)){
                count++;
            }
        }
        System.out.println("total special characters: "+count);
    }
}
