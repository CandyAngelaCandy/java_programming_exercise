package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {

        List<String> sameEleInC1AndC2 = new ArrayList();
        HashMap<String, Integer> removeDuplicatedEleInc2 = new HashMap();

        for (String key : collection2.keySet()) {

            if ("value".equals(key)) {

                List<String> eleOfSpeKeyValInc2 = collection2.get(key);

                collectSameEleInKeyIsValue(removeDuplicatedEleInc2, eleOfSpeKeyValInc2);

            }else{
                continue;
            }

        }

        for (String subEleInC1 : collection1) {
            if (removeDuplicatedEleInc2.containsKey(subEleInC1)) {
                sameEleInC1AndC2.add(subEleInC1);
            }

        }

        return sameEleInC1AndC2;

    }

    private void collectSameEleInKeyIsValue(HashMap<String, Integer> removeDuplicatedEleInc2, List<String> eleOfSpeKeyValInc2) {
        for (String eleOfSubListInC2 : eleOfSpeKeyValInc2) {

            if (!removeDuplicatedEleInc2.containsKey(eleOfSubListInC2)) {
                removeDuplicatedEleInc2.put(eleOfSubListInC2, 1);
            }
        }
    }
}
