import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DecodeMessage {
    public static void main(String[] args) {
        String key="the quick brown fox jumps over the lazy dog";
        String message="vkbs bs t suepuv";

        String resul=decodeMessage2(key, message);
        System.out.println(resul);
    }
    public static String decodeMessage(String key, String message) {
        key=key.replace(" ","");
        LinkedHashMap<Character,Character> decode=new LinkedHashMap<>();
        int x=0;
        for (int i=0; i<key.length(); i++){
            char c=(char)('a'+x);
            //  System.out.println(key.charAt(i));
            if(decode.containsValue(key.charAt(i))==true){
                continue;
            }
            else{
                decode.put(c,key.charAt(i));
            }
            x++;
        }
        StringBuilder stringBuilder=new StringBuilder();
        //busca los caracteres del mensaje
        for (int i=0; i<message.length(); i++){
            for(Map.Entry<Character,Character> set:decode.entrySet()){
                if (message.charAt(i)==' '){
                    stringBuilder.append(' ');
                    break;
                }
                if (message.charAt(i)==set.getValue()){
                    stringBuilder.append(set.getKey());
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }
    public static String decodeMessage2(String key, String message) {
        StringBuilder ans = new StringBuilder();//Using String Builder to append the string
        key = key.replaceAll(" ", "");
        //Removing the spaces
        HashMap<Character,Character> letters = new HashMap<>();
        //Mapping the key into a hashmap.
        char original = 'a';
        for (int i = 0; i < key.length() ; i++) {
            if (!letters.containsKey(key.charAt(i))){
                letters.put(key.charAt(i),original++);
            }
        }
        for(Map.Entry<Character,Character> set:letters.entrySet()){
            System.out.println("Key: "+set.getKey()+" value: "+set.getValue());
        }


        //After the first pass all the letters of the key will be mapped with their respective original letters.
        for (int i = 0; i < message.length(); i++) {
            if (letters.containsKey(message.charAt(i))){
                //Now replacing the letters of the message with appropriate letter according to the key
                ans.append(letters.get(message.charAt(i)));
            }else{
                ans.append(message.charAt(i));
                //This is for characters other than the letters in the key example a space " "
                //They will not be replaced by any letters hence original letter is appended into the StringBuilder
            }
        }
        return ans.toString();
    }

}
