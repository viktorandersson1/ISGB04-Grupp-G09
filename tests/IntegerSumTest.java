package tests;

import java.util.List;
import logic.IntegerSum;

public final class IntegerSumTest {
    public static void main(String[] args) {
        AK1_emptyListReturnsZero();
        System.out.println("PASS: AK1_emptyListReturnsZero");
    }

    private static void AK1_emptyListReturnsZero() {
        int actual = IntegerSum.sum(List.of());
        if (actual != 0) {
            throw new AssertionError("Expected 0 for an empty list, got " + actual);
        }
    }
}
