package lv.rvt;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import rvt.Book;
import rvt.Box;
import rvt.CD;
import rvt.Money;

public class MoneyTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testPlusMethod()
    {
        Money a = new Money(34, 50);
        Money b = new Money(40, 50);
        Money c = a.plus(b);
        Money Expect1 = new Money(75, 0);
        assertEquals(Expect1, c);
        Money d = a.plus(5);
        Money Expect2 = new Money(39, 50);
        assertEquals(Expect2, d);
        Money e = a.plus((byte)50);
        Money Expect3 = new Money(35);
        assertEquals(Expect3, e);

    }
    @Test
    public void testLessThanMethod()
    {
        Money a = new Money(5, 0);
        Money b = new Money(8, 0);
        boolean c = a.lessThan(b);
        assertTrue(c);
    }
    @Test
    public void testMinusMethod()
    {
        Money a = new Money(50, 50);
        Money b = new Money(40, 60);


        
        Money c = a.minus(b);
        Money d = new Money(9, 90);
        assertEquals(d, c);

    }

    @Test
    public void isMoneyEqual() {
        Money mon1 = new Money(5, 50);
        Money mon2 = new Money(5, 50);

        assertEquals(mon1, mon2);
    }

    @Test
    public void boxTest() {
        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));
        
        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
        
        System.out.println(box);
        
        assertEquals("Box: 6 items, total weight 4.0 kg", box);
    }
}
