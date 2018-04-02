package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {

        Map<String, Integer> collection3 = countSameElements(collectionA);

        for (String key : object.keySet()) {

            if ("value".equals(key)) {
                List<String> eleOfSpeKeyValInObj = object.get(key);

                updateCollectInKeyIsValue(collection3, eleOfSpeKeyValInObj);

            } else {
                continue;
            }
        }


        return collection3;

    }

    private void updateCollectInKeyIsValue(Map<String, Integer> collection3, List<String> eleOfSpeKeyValInObj) {
        for (String s1 : eleOfSpeKeyValInObj) {
            boolean isContains = collection3.containsKey(s1);

            if (isContains) {
                int speEleNum = collection3.get(s1);

                int threeNumInSpeEleNum = speEleNum / 3;
                speEleNum -= threeNumInSpeEleNum;
                collection3.put(s1, speEleNum);
            }
        }
    }

    private Map<String, Integer> countSameElements(List<String> collectionA) {
        Map<String, Integer> calSameEleNumInCa = new HashMap<String, Integer>();

        for (String s1 : collectionA) {

            boolean isContains = calSameEleNumInCa.containsKey(s1);

            if (isContains) {
                int speEleNum = calSameEleNumInCa.get(s1) + 1;
                calSameEleNumInCa.put(s1, speEleNum);
            } else {
                calSameEleNumInCa.put(s1, 1);
            }
        }
        return calSameEleNumInCa;
    }
}
