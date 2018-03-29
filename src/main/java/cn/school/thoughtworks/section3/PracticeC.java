package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = new HashMap<String, Integer>();

        for (String s1 : collectionA) {

            boolean isContains = collection3.containsKey(s1);

            if (isContains) {
                int speEleNum = collection3.get(s1) + 1;
                collection3.put(s1, speEleNum);
            } else {
                collection3.put(s1, 1);
            }
        }
        
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
}
