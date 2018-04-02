package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    public static void main(String[] args) {

    }

    List<String> collectSameElements(List<String> collection1, List<String> collection2) {

        List<String> sameEleInC1AndC2 = new ArrayList();

        for (String eleInC1 : collection1) {

            if (collection2.contains(eleInC1)) {
                sameEleInC1AndC2.add(eleInC1);
            }
        }

        return sameEleInC1AndC2;
    }
}
