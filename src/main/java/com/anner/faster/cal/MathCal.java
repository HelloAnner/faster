package com.anner.faster.cal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 数学计算
 *
 * @author anner
 * @version 11.0
 * Created by anner on 2022/11/3
 */
public class MathCal {

    public long slow() {
        List<Integer> numbers = data();
        long res = 0L;
        for (int n : numbers) {
            res += n;
        }
        return res;
    }

    public long faster() {
        return data().stream().reduce(0, Integer::sum);
    }


    private List<Integer> data() {
        List<Integer> res = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            res.add(random.nextInt(100000));
        }
        return res;
    }
}
