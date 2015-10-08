package easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by user on 07.10.2015.
 */
public class SolutionTest {

    /**
     * 1) Программа, возвращающая 2-й по величине элемент набора чисел.
     * Тестирование первого задания
     */

    @Test
    public void testCalculate() throws Exception {
        Solution solution = new Solution();
        assertEquals(4,solution.calculate(new int[]{-33,5,4,8,9}));
        assertEquals(2,solution.calculate(new int[]{1,2}));
    }

    /**
     * 1) Программа, возвращающая 2-й по величине элемент набора чисел.
     * @throws ArrayIndexOutOfBoundsException - исключение если массив пустой
     */

    @Test (expected = IllegalArgumentException.class)
    public void testCalculateException() throws IllegalArgumentException {
        Solution solution = new Solution();
        solution.calculate(new int[]{});
    }

    /**
     * 1) Программа, возвращающая 2-й по величине элемент набора чисел.
     * @throws IllegalArgumentException - исключение если массив содержит 1 эелемент
     */

    @Test (expected = IllegalArgumentException.class)
    public void testCalculateExceptionByOneArg() throws IllegalArgumentException {
        Solution solution = new Solution();
        solution.calculate(new int[]{123});
    }

    /**
     * 2) Программа, выполняющая разложение числа на набор простых множителей
     * Тестирование второго задания
     */

    @Test
    public void testNumberPartition() throws Exception {
        Solution solution = new Solution();
        assertTrue(Arrays.equals(new int[]{3,41},solution.numberPartition(123)));
        assertTrue(Arrays.equals(new int[]{7,11,19},solution.numberPartition(1463)));
        assertTrue(Arrays.equals(new int[]{3},solution.numberPartition(3)));
    }

    /**
     * 2) Программа, выполняющая разложение числа на набор простых множителей
     * @throws IllegalArgumentException - исключение если в качестве аргумента передана еденица
     */
    @Test (expected = IllegalArgumentException.class)
    public void testNumberPartitionExceptionBy1() throws IllegalArgumentException {
        Solution solution = new Solution();
        solution.numberPartition(1);
    }

    /**
     * 2) Программа, выполняющая разложение числа на набор простых множителей
     * @throws IllegalArgumentException - исключение если число отрицательное
     */
    @Test (expected = IllegalArgumentException.class)
    public void testNumberPartitionExceptionByNegative() throws IllegalArgumentException {
        Solution solution = new Solution();
        solution.numberPartition(-123);
    }

    /**
     * 3) Программа, выполняющая проверку строки на то, что она является палиндромом
     * Тестирование задачи
     */
    @Test
    public void testIsPalindrom() throws Exception {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrom("a"));
        assertTrue(solution.isPalindrom(""));
        assertTrue(solution.isPalindrom("a121a"));
        assertFalse(solution.isPalindrom("abcd"));
    }


    /**
     * 5) Программа, выполняющая поиск подстроки в строке.
     * Тестирование, результат сравнивается с библиотечной фукцией indexOf()
     */
    @Test
    public void testSearchSubString() throws Exception {
        Solution solution = new Solution();
        assertEquals("abcdef".indexOf("bcd"),solution.searchSubString("bcd","abcdef"));
        assertEquals("asdzxcqwe".indexOf("qwe"),solution.searchSubString("qwe","asdzxcqwe"));
        assertEquals("abcdef".indexOf("123"),solution.searchSubString("123","abcdef"));
    }
}