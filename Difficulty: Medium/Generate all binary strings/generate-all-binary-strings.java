// User function Template for Java

class Solution {
    public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> result = new ArrayList<>();
        generate(n, "", result);
        return result;
    }
    public static void generate(int n, String current, List<String> result) {
        if(n == 0){
            result.add(current);
            return;
        }
        generate(n-1, current + "0", result);
        if(current.isEmpty() || current.charAt(current.length() - 1) != '1'){
            generate(n-1, current + "1", result);
        }
    }
}
