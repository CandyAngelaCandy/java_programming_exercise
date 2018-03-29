package cn.school.thoughtworks.section2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {

    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> calSameEleNumInc1 = new HashMap<String, Integer>();

        for (String s1 : collection1) {

            //对键值处理
            if (isContainsSpecEle(s1)) {
                dealSpecListEle(calSameEleNumInc1, s1);
                continue;
            }

            isKeyExist(calSameEleNumInc1, s1,1);
        }

        return calSameEleNumInc1;
    }

    private void isKeyExist(Map<String, Integer> calSameEleNumInc1, String s1,int count) {
        boolean isContains = calSameEleNumInc1.containsKey(s1);

        if (isContains) {
            int speEleNum = calSameEleNumInc1.get(s1) + count;
            calSameEleNumInc1.put(s1, speEleNum);
        } else {
            //对Key值处理
            calSameEleNumInc1.put(s1, count);

        }
    }

    private boolean isContainsSpecEle(String s1){
         if (s1.indexOf("-") != -1 || s1.indexOf(":") != -1 || s1.indexOf("[")!= -1){
             return true;
         }
         return false;
     }

    private void dealSpecListEle(Map<String, Integer> calSameEleNumInc1, String s1) {
        if (s1.indexOf("-") != -1) {
            addEleInc1(calSameEleNumInc1, s1,"-");
        }

        if (s1.indexOf(":") != -1) {
            addEleInc1(calSameEleNumInc1, s1,":");
        }

        if(s1.indexOf("[")!= -1){
            s1 = s1.substring(0,s1.length() - 1);
            addEleInc1(calSameEleNumInc1, s1,"\\[");
        }

    }

    private void addEleInc1(Map<String, Integer> calSameEleNumInc1, String s1,String tag) {

        String[] divideArrBasedLine = s1.split(tag);

        String speKeyVal = divideArrBasedLine[0];
        int speEleCount = Integer.parseInt(divideArrBasedLine[1]);

        isKeyExist(calSameEleNumInc1, speKeyVal,speEleCount);
    }
}
