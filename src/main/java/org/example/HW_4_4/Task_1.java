package org.example.HW_4_4;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
public class Task_1 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(2,3,1));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(-5,6,-7));
        Task_1 su = new Task_1();
        Deque<Integer> result = su.sum(d1, d2);
        System.out.println(result);
    }
    public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> result = new ArrayDeque<>();
        int n = 0;
        while (!d1.isEmpty() || !d2.isEmpty()) {
            int sum = n;
            if (!d1.isEmpty()) {
                sum += d1.removeFirst();
            }
            if (!d2.isEmpty()) {
                sum += d2.removeFirst();
            }
            result.addLast(sum);
        }
        if (n != 0) {
            result.addLast(n);
        }
        return result;
    }
}
