package N05_PalindromeNumber;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
       if (0 > x){
           return false;
       }
       String str = Integer.toString(x);
       int left = 0;
       int right = str.length() - 1;
       while (left < right){
           if(str.charAt(left) != str.charAt(right)){
               return false;
           }
           left++;
           right--;

       }
        return true;
    }

    public static void main(String[] arg){
        int number = 1221;
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean ds = palindromeNumber.isPalindrome(number);
        if(ds == true){
            System.out.println("true");
        }

    }

}
