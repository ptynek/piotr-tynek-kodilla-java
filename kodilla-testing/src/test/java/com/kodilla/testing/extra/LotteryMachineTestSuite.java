package com.kodilla.testing.extra;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LotteryMachineTestSuite {

    @Mock
    private LotteryMachine lotteryMachineMock;
    @Test
    void testMiniLotto(){
        Set<Integer> lotteryNumbers = new HashSet<>();
        lotteryNumbers.add(2);
        lotteryNumbers.add(6);
        lotteryNumbers.add(17);
        lotteryNumbers.add(1);
        lotteryNumbers.add(9);
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(5);
        userNumbers.add(7);
        userNumbers.add(2);
        userNumbers.add(8);
        userNumbers.add(18);
        when(lotteryMachineMock.lottery(5)).thenReturn(userNumbers);






    }
}
