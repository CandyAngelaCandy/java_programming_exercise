package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    public static void main(String[] args) {

    }

    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> aList1 = new ArrayList<String>();
        List<String> aList2 = new ArrayList<String>();

        for (String s1 : collection1) {
            aList1.add(s1);
        }


        for (String s2 : collection2) {
            aList2.add(s2);

        }

        aList1.retainAll(aList2);

        return aList1;
    }
}
