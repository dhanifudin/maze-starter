import java.util.Scanner;

/**
 * Maze
 */
public class Maze {

    public static void main(String[] args) {
        final char UP = 'w';
        final char LEFT = 'a';
        final char DOWN = 's';
        final char RIGHT = 'd';
        final char HERO = '\u15E7';
        final char POINT = '\u25CF';
        final char SP = ' ';
        final char LT = '\u250C';
        final char HL = '\u2500';
        final char RT = '\u2510';
        final char VL = '\u2502';
        final char LB = '\u2514';
        final char RB = '\u2518';

        Scanner input = new Scanner(System.in);

        char[][] maps = {
            { LT, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, RT },
            { VL, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, VL },
            { VL, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, VL },
            { VL, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, VL },
            { VL, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, VL },
            { VL, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, VL },
            { VL, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, VL },
            { VL, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, VL },
            { VL, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, VL },
            { LB, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, HL, RB },
        };
        int[][] points = {{4, 2}, { 3, 5}, {15, 8}, {10, 7}, {15, 3}};
        int heroX = 1;
        int heroY = 1;
        int score = 0;

    }
}
