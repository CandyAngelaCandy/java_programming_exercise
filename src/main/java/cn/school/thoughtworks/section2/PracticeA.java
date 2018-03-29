package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> calSameEleNumInc1 = new HashMap<String, Integer>();

        for (String s1 : collection1) {

            boolean isContains = calSameEleNumInc1.containsKey(s1);

            if (isContains) {
                int speEleNum = calSameEleNumInc1.get(s1) + 1;
                calSameEleNumInc1.put(s1, speEleNum);
            } else {
                calSameEleNumInc1.put(s1, 1);
            }
        }

        return calSameEleNumInc1;
    }
}
