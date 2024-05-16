public class PermutationDifferencebetweenTwoStrings {
    public static void main(String[] args) {
        String input="abcde";
        String t="edbac";
        int x=input.indexOf('a');
       // System.out.println(x);
       // System.out.println(input.charAt(0));
       // System.out.println(t.indexOf(input.charAt(0)));
        int resul=findPermutationDifference(input, t);
        System.out.println(resul);
    }

    public static int findPermutationDifference(String s, String t) {
        int sum=0;
        for (int i=0; i<s.length(); i++){
            sum=sum+(Math.abs(s.indexOf(s.charAt(i))-t.indexOf(s.charAt(i))));
        }
        return sum;
    }
}
