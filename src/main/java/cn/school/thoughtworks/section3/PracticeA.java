package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {

        for (String key : object.keySet()) {

            if ("value".equals(key)) {
                List<String> eleOfSpeKeyValInObj = object.get(key);

                updateCollectionBasedVal(collectionA, eleOfSpeKeyValInObj);

            } else {
                continue;
            }
        }

        return collectionA;
    }

    private void updateCollectionBasedVal(Map<String, Integer> collectionA, List<String> eleOfSpeKeyValInObj) {
        for (String s1 : eleOfSpeKeyValInObj) {
            boolean isContains = collectionA.containsKey(s1);

            if (isContains) {
                int speEleNum = collectionA.get(s1) - 1;
                collectionA.put(s1, speEleNum);
            }
        }
    }
}
