import java.util.LinkedHashMap;
import java.util.Map;

public class DecodeMessage {
    public static void main(String[] args) {
        String key="the quick brown fox jumps over the lazy dog";
        String message="vkbs bs t suepuv";

        String resul=decodeMessage(key, message);
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
}
