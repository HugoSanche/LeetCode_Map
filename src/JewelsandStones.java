import java.util.HashSet;
import java.util.Set;

//771. Jewels and Stones
//Easy
//Topics
//Companies
//Hint
//You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
//
//Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//
//
//Example 1:
//
//Input: jewels = "aA", stones = "aAAbbbb"
//Output: 3
//Example 2:
//
//Input: jewels = "z", stones = "ZZ"
//Output: 0
public class JewelsandStones {
    public static void main(String[] args) {
        String jewels="aA";
        String stones="aAAbbbb";
        int resul=numJewelsInStones2(jewels, stones);
        System.out.println(resul);
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0; i<jewels.length(); i++){
           // System.out.println(jewels.charAt(i));
            for(int j=0; j<stones.length();j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                   //System.out.println(i+" i "+jewels.charAt(i)+j+" j "+stones.charAt(j));
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static int numJewelsInStones2(String jewels, String stones) {
        int count=0;
        Set setJewel=new HashSet<>();

        for(char c:jewels.toCharArray()){
            setJewel.add(c);
        }
        for(char c:stones.toCharArray()){
            if(setJewel.contains(c)){
                count++;
            }
        }
        return count;
    }
}



