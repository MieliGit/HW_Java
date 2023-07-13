package org.example.HW_4_4;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
public class Task_2 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(2,3,1));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,2,7));
        Task_2 mu = new Task_2();
        Deque<Integer> result = mu.multi(d1, d2);
        System.out.println(result);
    }
    public Deque<Integer> multi(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> result = new ArrayDeque<>();
        int n = 0;
        while (!d1.isEmpty() || !d2.isEmpty()) {
            int multi = n + 1;
            if (!d1.isEmpty()) {
                multi *= d1.removeFirst();
            }
            if (!d2.isEmpty()) {
                multi *= d2.removeFirst();
            }
            result.addLast(multi);

        }
        if (n != 0) {
            result.addLast(n);

        }
        return result;
    }
}

