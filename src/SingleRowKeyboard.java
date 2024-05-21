import java.util.Arrays;

public class SingleRowKeyboard {
    public static void main(String[] args) {
        String keyboard="pqrstuvwxyzabcdefghijklmno";
        String word="leetcode";
       // int x=input.indexOf('a');
        // System.out.println(x);
        // System.out.println(input.charAt(0));
        // System.out.println(t.indexOf(input.charAt(0)));
        int resul=calculateTime(keyboard,word);
        System.out.println(resul);
    }
    public static int calculateTime(String keyboard, String word){
        int[] positions=new int[26];
        for (int i=0; i!=keyboard.length();i++){
            positions[keyboard.charAt(i)-'a']=i;
        }

        System.out.println(Arrays.toString(positions));
        int res=0;
        int pos=0;
        for (int i=0; i!=word.length();i++){
            final int ch=word.charAt(i)-'a';
            System.out.println("ch "+ch);
            res+=Math.abs(pos-positions[ch]);
            pos=positions[ch];
        }
        return res;
    }
}






















