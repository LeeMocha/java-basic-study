package thirdday;

import java.util.ArrayList;
import java.util.List;

public class ForEachTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(5);
        for(int i = 1; i<6; i++){
            list.add(String.valueOf(i));
        }
        for(String i : list){
            System.out.println(i);
        }
    }
}