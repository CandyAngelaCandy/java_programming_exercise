package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {

        List<String> speValEleInObj = object.get("value");

        for (String s1 : speValEleInObj) {
            boolean isContains = collectionA.containsKey(s1);

            if (isContains) {
                int speEleNum = collectionA.get(s1) - 1;
                collectionA.put(s1, speEleNum);
            }
        }

        return collectionA;
    }
}
