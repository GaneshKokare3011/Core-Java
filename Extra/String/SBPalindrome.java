class SBPalindrome {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("racecar");
        
        String original = sb.toString();
        String reversed = new StringBuilder(original).reverse().toString();;
        
        if (original.equals(reversed)) {
            System.out.println("String is palindrome.");
        } else {
            System.out.println("String is not palindrome.");
        }
    }
}
