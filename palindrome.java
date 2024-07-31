import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String name = sc.nextLine();
        String originalString=name;
        boolean isPalidrome=false;
        for (int i = name.length() - 1; i >= 0; i--) {
            for(int j=0;j<originalString.length();j++){
                if(originalString.charAt(j)==name.charAt(i)){
                    isPalidrome=true;
                }
                else{
                    isPalidrome =false;
                }
            }
        }
        System.out.println(isPalidrome);
       
       
    }
}
