import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderedStream {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap=new HashMap<>();

        OrderedStream os = new OrderedStream(5);
        os.insert(3, "ccccc"); // Inserts (3, "ccccc"), returns [].
        os.insert(1, "aaaaa"); // Inserts (1, "aaaaa"), returns ["aaaaa"].
        os.insert(2, "bbbbb"); // Inserts (2, "bbbbb"), returns ["bbbbb", "ccccc"].
        os.insert(5, "eeeee"); // Inserts (5, "eeeee"), returns [].
        os.insert(4, "ddddd"); // Inserts (4, "ddddd"), returns ["ddddd", "eeeee"].
       // System.out.println(os.stream);

    }
    public String stream[];

    int ptr=0;
    public OrderedStream(int n) {
        stream=new String[n];
    }

    //os.insert(3, "ccccc"); // Inserts (3, "ccccc"), returns [].
    //os.insert(1, "aaaaa"); // Inserts (1, "aaaaa"), returns ["aaaaa"].
    //os.insert(2, "bbbbb"); // Inserts (2, "bbbbb"), returns ["bbbbb", "ccccc"].
    //os.insert(5, "eeeee"); // Inserts (5, "eeeee"), returns [].
    //os.insert(4, "ddddd"); // Inserts (4, "ddddd"), returns ["ddddd", "eeeee"].
    public List<String> insert(int idKey, String value) {
        stream[idKey-1]=value;
        List<String> chunk = new ArrayList<>();
        System.out.println((stream[0]));
        while(ptr < stream.length && stream[ptr]!=null)
        {
            System.out.println(ptr);
            System.out.println(stream[ptr]);
            chunk.add(stream[ptr]);
            ptr++;
        }
        return chunk;
    }
}
