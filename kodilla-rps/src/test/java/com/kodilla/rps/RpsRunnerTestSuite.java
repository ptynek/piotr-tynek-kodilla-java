package com.kodilla.rps;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Rock Paper Scissors Tests")
public class RpsRunnerTestSuite {

    private static int testCounter = 0;
    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("Starting tests");
    }

    @BeforeEach
    public void beforeEach(){
        testCounter ++;
        System.out.println("Execute test #" + testCounter);
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Tests are finished!");
    }

    @Nested
    @DisplayName("Test inputs before start game")
    class TestBeforeStartGame {
        @Test
        @DisplayName("Name and instruction")
        void testNameAndInstruction(){
            Instruction instruction = new Instruction();

            String name = "Piotrek";

            assertEquals(("Witaj " + name + "!\n"
                            + "1 - Kamień\n2 - Papier \n3 - Nożyce \nx - Zakończ grę \nn - Nowa gra"),
                    instruction.instructionForTheGame(name));
        }
    }
    @Nested
    @DisplayName("Tests with rounds")
    class TestRounds {
        @Test
        @DisplayName("Check rounds are equal")
        void testRoundsAreEquals() {
            CheckRounds checkRounds = new CheckRounds();
            int roundNumber = 2;
            int rounds = 2;

            boolean result = checkRounds.checkRound(roundNumber, rounds);

            assertFalse(result);
        }

        @Test
        @DisplayName("Check rounds not equal")
        void testRoundsAreNotEquals() {
            CheckRounds checkRounds = new CheckRounds();
            int roundNumber = 1;
            int rounds = 2;

            boolean result = checkRounds.checkRound(roundNumber, rounds);

            assertTrue(result);
        }
    }

    @Nested
    @DisplayName("Computer moves tests")
    class TestComputerMoves{

        @Test
        @DisplayName("Create computer move")
        void testGetWrongComputerMove(){
            ComputerMoves computerMoves = new ComputerMoves();
            String userMove = "4";

            assertEquals("Błędny ruch!", computerMoves.getComputerMove(userMove));
        }

        @Test
        @DisplayName("Get computer move")
        void testGetComputerMove(){
            ComputerMoves computerMoves = new ComputerMoves();
            String userMove = "2";

            assertTrue(computerMoves.getComputerMove(userMove) == "1"
                    || computerMoves.getComputerMove(userMove) == "2"
                    || computerMoves.getComputerMove(userMove) == "3"
            );
        }

    }

    @Nested
    @DisplayName("Testing results")
    class TestResults{

        @Test
        @DisplayName("Test restart game")
        void testRestartGame(){
            Result result = new Result();

            result.setUserResult(5);
            result.setComputerResult(6);

            result.restartGame();

            assertAll(
                    () -> assertEquals(0, result.getComputerResult()),
                    () -> assertEquals(0, result.getUserResult())
            );
        }

        @Test
        @DisplayName("Test draw result")
        void testDrawResult(){
            Result result = new Result();
            int computerResult = 3;
            int userResult = 3;

            String resultAnswer = result.announcement(computerResult, userResult);

            assertEquals("Remis!", resultAnswer);
        }

        @Test
        @DisplayName("Test computer win")
        void testComputerWin(){
            Result result = new Result();
            int computerResult = 4;
            int userResult = 3;

            String resultAnswer = result.announcement(computerResult, userResult);

            assertEquals("Komputer wygrał!", resultAnswer);
        }

        @Test
        @DisplayName("Test user win")
        void testUserWin(){
            Result result = new Result();
            int computerResult = 3;
            int userResult = 4;

            String resultAnswer = result.announcement(computerResult, userResult);

            assertEquals("Wygrałeś!", resultAnswer);
        }

        @Test
        @DisplayName("Test one move")
        void testOneMove(){
            Result result = new Result();
            result.gameResult("1", "2");

            int userResult = result.getUserResult();
            int computerResult = result.getComputerResult();

            assertEquals(0, userResult);
            assertEquals(1, computerResult);
        }
    }
}
