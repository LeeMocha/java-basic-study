package thirdday;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapTest1 {
    public static void main(String[] args) {
        Map<Integer, String> map= new HashMap<>(5);
        for(int i=0; i<5; i++){
            map.put(i+1, i+1+"입니다. ");
        }
        System.out.println(map.remove(3));
        System.out.println(map.remove(7)); //없는 key값이기 때문에 null 반
        Set<Integer> keyset = map.keySet();
        for(int i=0; i<keyset.size(); i++){
            if(map.containsKey(i+1)){
                System.out.println(map.get(i+1));
            }else{
                System.out.println("삭제된 값입니다.");
            }
        }
        System.out.println(String.join(" : ", map.values()));
    }
}
