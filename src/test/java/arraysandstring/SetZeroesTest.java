package arraysandstring;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetZeroesTest {
    @Test
    void shouldReplaceZeroes() {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] expected = {{1,0,1},{0,0,0},{1,0,1}};
        SetZeroes.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    void shouldReplaceZeroesBiggerMatrix() {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] expected = {{0,0,0,0},{0,4,5,0},{0,3,1,0}};
        SetZeroes.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    void shouldReplaceZeroesSmallerMatrix() {
        int[][] matrix = {{1}, {0}};
        int[][] expected = {{0}, {0}};
        SetZeroes.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }

}