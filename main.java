import java.util.*;
class checkPalindrone{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Stringbas an input to check whether it is palindorne or not:");
        String input=scanner.nextLine();

        if(isPalindrone(input))
        {
            System.out.println(input+"is a palindrone String");

        }
        else{
            System.out.println(input+"is not a palindrone String");
            
        }
    }
    public static boolean isPalindrone(String str){
        int left=0,right=str.length()-1;
        while(left<right)
{
            if(str.charAt(left)!=str.charAt(right))
            {return false;}
            left++;
            right--;
}
      return true;
    }
}