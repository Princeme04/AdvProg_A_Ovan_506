package module1.codelab;

import java.util.ArrayList;
import java.util.List;

public class Codelab1 {
    public static void main(String[] args) {
        String[] names = {"Adi", "Budi", "Cahyo", "Diana", "Eva"};
        List<String> longestNames = findLongestNames(names);
        System.out.println("Longest Name: " + longestNames);
    }
    public static List<String> findLongestNames(String[] array) {
        List<String> result = new ArrayList<>();
        int maxLength = 0;

        for(String name : array) {
            if(name.length() > maxLength) {
                result.clear();
                result.add(name);
                maxLength = name.length();
            }else if(name.length() == maxLength) {
                result.add(name);
            }
        }
        return result;
    }
}
