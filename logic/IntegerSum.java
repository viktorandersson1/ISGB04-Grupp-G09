package logic;

import java.util.List;

public final class IntegerSum {
    private IntegerSum() {
    }

    public static int sum(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
