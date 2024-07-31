public class palindromeLeetocde {
    public static boolean isPalindrome(String s) {
        String cleanedString = s.replaceAll("[ ,:]", "");
        s=cleanedString.toLowerCase();
        String originalString=s;
        System.out.println(s);
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                if(originalString.charAt(j)==s.charAt(i)){
                    return true;
                }
            }
            
        }
        return false;

    }
    public static void main(String[] args) {
        String s="race a car";
        System.out.println(isPalindrome(s));;
    }
}
