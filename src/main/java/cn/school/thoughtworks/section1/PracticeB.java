package cn.school.thoughtworks.section1;

import java.util.*;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {

        List<String> sameEleInC1AndC2 = new ArrayList();
        HashMap<String, Integer> removeDuplicatedEleInc2 = new HashMap();

        for (List<String> subListInC2 : collection2) {
            for (String eleOfSubListInC2 : subListInC2) {

                if (!removeDuplicatedEleInc2.containsKey(eleOfSubListInC2)) {
                    removeDuplicatedEleInc2.put(eleOfSubListInC2, 1);
                }
            }
        }

        for (String subEleInC1 : collection1) {
            if (removeDuplicatedEleInc2.containsKey(subEleInC1)) {
                sameEleInC1AndC2.add(subEleInC1);
            }

        }

        return sameEleInC1AndC2;
    }
}
