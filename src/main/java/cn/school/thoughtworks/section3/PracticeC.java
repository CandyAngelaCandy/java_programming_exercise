package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {

        Map<String, Integer> collection3 = countSameElements(collectionA);

        List<String> speValEleInObj = object.get("value");

        for (String s1 : speValEleInObj) {
            boolean isContains = collection3.containsKey(s1);

            if (isContains) {
                int speEleNum = collection3.get(s1);

                int threeNumInSpeEleNum = speEleNum / 3;
                speEleNum -= threeNumInSpeEleNum;
                collection3.put(s1, speEleNum);
            }
        }

        return collection3;

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
