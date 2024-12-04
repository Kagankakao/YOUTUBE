public class soru3 {
    
    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!isVowel(chars[left])) {
                left++;
                continue;
            }
            
            if (!isVowel(chars[right])) {
                right--;
                continue;
            }
            
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            left++;
            right--;
        }
        
        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "hello";
        String output = reverseVowels(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
