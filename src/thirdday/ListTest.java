package thirdday;

import java.util.ArrayList;
import java.util.Comparator;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(5);
        for(int i = 0; i<5; i++){
            list.add(String.valueOf(i));
        }
        list.remove(0);
        list.remove("3");
        int index = 0;
        for(int i = 0; i<5; i++){
            if(list.contains(String.valueOf(i))){
                System.out.println("list 속에 "+ index+"번째에 들어있는 값:" + list.get(index++));
            }
        }
        System.out.println(list.size());
        list.sort(Comparator.reverseOrder());
        System.out.println("거꾸로 하면 이렇게: " + String.join(", ", list));
    }
}