package by.ruslan.radevich.homework.lessons9;

import java.util.Arrays;

public class Voter {

    static Voter vote;

    static {
        Object[] vote = new Object[100];
        Arrays.fill(vote, new Object() {
            private int count = 0;

            @Override
            public String toString() {
                return Integer.toString(++count);
            }
        });
        System.out.println(Arrays.toString(vote));
    }

}
