package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> aList1 = new ArrayList<String>();
        List<String> subarrayEleInc2 = collection2.get(0);

        for (String s1 : collection1) {
            aList1.add(s1);
        }

        aList1.retainAll(subarrayEleInc2);
        return aList1;
    }
}
