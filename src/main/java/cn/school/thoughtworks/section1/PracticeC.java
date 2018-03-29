package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。

        List<String> aList1 = new ArrayList<String>();
        List<String> speValEleInc2 = collection2.get("value");

        for (String s1 : collection1) {
            aList1.add(s1);
        }

        aList1.retainAll(speValEleInc2);
        return aList1;

    }
}
