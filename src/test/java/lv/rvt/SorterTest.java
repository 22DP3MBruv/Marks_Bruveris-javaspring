package lv.rvt;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import rvt.Sorter;

public class SorterTest {
    @Test
    public void SortTest() {
        int[] array = {8, 66, 3, 6, 1};
        Sorter.sort(array);
        int[] expected = {1, 3, 6, 8, 66};

        assertArrayEquals(expected, array);

    }
    @Test
    public void binarytest() {
        int[] arr = {5, 6, 7, 8, 9, 10, 35, 80};
        assertEquals(Sorter.binarySearch(arr, 55), -1);
        assertEquals(Sorter.binarySearch(arr, 35), 6);
    }
}
