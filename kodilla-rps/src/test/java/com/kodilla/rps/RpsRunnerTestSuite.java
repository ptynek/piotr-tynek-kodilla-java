package com.kodilla.rps;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class RpsRunnerTestSuite {

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("Starting tests");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Test case: end");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Tests are finished!");
    }

    @Test
    @DisplayName("Name and instruction")
    void testNameAndInstruction(){
        Instruction instruction = new Instruction();

        String name = "Piotrek";
        System.out.println("Checking instructions script for name: " + name);

        assertEquals(("Witaj " + name + "!\n"
                + "1 - Kamień\n2 - Papier \n3 - Nożyce \nx - Zakończ grę \nn - Nowa gra"),
                instruction.instructionForTheGame(name));
    }

    @Test
    @DisplayName("Check rounds are equal")
    void testRoundsAreEquals(){
        CheckRounds checkRounds = new CheckRounds();
        int roundNumber = 2;
        int rounds = 2;
        System.out.println("Checking when current round is last one.");

        boolean result = checkRounds.checkRound(roundNumber, rounds);

        assertFalse(result);
    }

    @Test
    @DisplayName("Check rounds not equal")
    void testRoundsAreNotEquals(){
        CheckRounds checkRounds = new CheckRounds();
        int roundNumber = 1;
        int rounds = 2;
        System.out.println("Checking when current round is the first one.");

        boolean result = checkRounds.checkRound(roundNumber, rounds);

        assertTrue(result);
    }
}
