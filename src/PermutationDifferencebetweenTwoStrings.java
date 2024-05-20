import java.util.HashMap;
import java.util.Map;

public class PermutationDifferencebetweenTwoStrings {
    public static void main(String[] args) {
        String input="abc";
        String t="bac";
        int x=input.indexOf('a');
       // System.out.println(x);
       // System.out.println(input.charAt(0));
       // System.out.println(t.indexOf(input.charAt(0)));
        int resul=findPermutationDifference2(input, t);
        System.out.println(resul);
    }

    public static int findPermutationDifference(String s, String t) {
        int sum=0;
        for (int i=0; i<s.length(); i++){
            sum=sum+(Math.abs(s.indexOf(s.charAt(i))-t.indexOf(s.charAt(i))));
        }
        return sum;
    }
    public static int findPermutationDifference2(String s, String t) {
        HashMap<Character,Integer> permutationA =new HashMap<>();
        Map<Character,Integer> permutationB =new HashMap<>();
        int sum=0;
        for (int i=0; i<s.length(); i++){
            permutationA.put(s.charAt(i),s.indexOf(s.charAt(i)));
            permutationB.put(t.charAt(i),s.indexOf(t.charAt(i)));
        }
        for (int i=0; i<s.length(); i++){
            sum=sum+Math.abs(permutationA.get(s.charAt(i))-permutationB.get(t.charAt(i)));
        }
        return sum;
    }

}
