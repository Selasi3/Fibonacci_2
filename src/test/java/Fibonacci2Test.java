import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Fibonacci2Test {
    Fibonacci2 fib = new Fibonacci2();

    @Test
    public  void numberLessTanZero(){
        assertThrows(IllegalArgumentException.class, () -> {
            fib.fibonacciList(-1);
        });
        }

    @Test
    void numberEqualsOne(){
        assertEquals(List.of(0), fib.fibonacciList(1));
    }
    @Test
    void numberEqualsTwo(){
        assertEquals(List.of(0,1), fib.fibonacciList(2));
    }

    @Test
    void FibonacciTest(){
        assertEquals(List.of(0,1,1,2,3), fib.fibonacciList(5));
    }
}