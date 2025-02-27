package questions.List;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        if (numRows == 0) return answer;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        answer.add(list);
        if (numRows == 1) return answer;
        for (int i = 1;i < numRows;i++){
            List<Integer> list1 = new ArrayList<>();
            list1.add(1);
            for (int j = 1;j <= i;j++){
                if(j == i || i == 1){
                    list1.add(1);
                } else {
                    int number = answer.get(i-1).get(j) + answer.get(i-1).get(j-1);
                    list1.add(number);
                }
            }
            answer.add(list1);
        }
        return answer;
    }
}
