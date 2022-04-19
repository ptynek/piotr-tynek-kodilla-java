package com.kodilla.testing.extra;

import java.util.*;

public class LotteryMachine {

    public int miniLotto(Database database) {
        Set<Integer> lotteryNumbers = new HashSet<>();
        Set<Integer> userNums = database.lottery(5);

        lotteryNumbers.add(2);
        lotteryNumbers.add(6);
        lotteryNumbers.add(17);
        lotteryNumbers.add(1);
        lotteryNumbers.add(9);

        int count = 0;

        for (Integer number : userNums) {
            if (number >= 1 && number <= 36 && lotteryNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    public int jackpot(Database database) {
        Set<Integer> lotteryNumbers = new HashSet<>();
        Set<Integer> userNumbers2 = database.lottery(2);
        Set<Integer> userNumbers5 = database.lottery(5);
        lotteryNumbers.add(3);
        lotteryNumbers.add(9);

        int count = 0;

        if (lotteryNumbers.size() == 2) {
            for (Integer number : userNumbers2) {
                if (number >= 1 && number <= 10 && lotteryNumbers.contains(number)) {
                    count++;
                }
            }
        } else if (lotteryNumbers.size() == 5) {
            for (Integer number : userNumbers5) {
                if (number >= 1 && number <= 50 && lotteryNumbers.contains(number)) {
                    count++;
                }
            }
        }
        return count;
    }
}


