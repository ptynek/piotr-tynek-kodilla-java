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
    private Database databaseMock;
    @Test
    void testMiniLotto(){
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(5);
        userNumbers.add(7);
        userNumbers.add(2);
        userNumbers.add(8);
        userNumbers.add(18);
        when(databaseMock.lottery(5)).thenReturn(userNumbers);
        LotteryMachine lotteryMachine = new LotteryMachine();

        int containsNumbers = lotteryMachine.miniLotto(databaseMock);

        assertEquals(1, containsNumbers);
    }

    @Test
    void testJackPot(){
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(3);
        userNumbers.add(9);
        when(databaseMock.lottery(2)).thenReturn(userNumbers);
        LotteryMachine lotteryMachine = new LotteryMachine();

        int containsNumbers = lotteryMachine.jackpot(databaseMock);

        assertEquals(2, containsNumbers);
    }
}
