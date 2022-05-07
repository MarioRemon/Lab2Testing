import junit.framework.TestCase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class Sheet3Test  extends TestCase{
    @Nested
    class ECo{
        Sheet3 o;
        @BeforeEach
        public void setup(){
            o = new Sheet3();
        }
        @Test
        public void test1(){
            String[] res = o.input('a');
            assertEquals("NORMAL", res[0]);
            assertEquals("DATE", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }
        @Test
        public void test2(){
            o.input('a');
            String[] res = o.input('a');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }
        @Test
        public void test3(){
            o.input('a');
            o.input('a');
            String[] res = o.input('c');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }
        @Test
        public void test4(){
            o.input('a');
            o.input('a');
            o.input('c');
            String[] res = o.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:1", res[3]);
        }
        @Test
        public void test5(){
            o.input('a');
            o.input('a');
            o.input('c');
            o.input('b');
            String[] res = o.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:1", res[3]);
        }
        @Test
        public void test6(){
            o.input('a');
            o.input('a');
            o.input('c');
            o.input('b');
            o.input('a');
            String[] res = o.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void test7(){
            o.input('a');
            o.input('a');
            o.input('c');
            o.input('b');
            o.input('a');
            o.input('b');
            String[] res = o.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void test8(){
            o.input('a');
            o.input('a');
            o.input('c');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            String[] res = o.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void test9(){
            o.input('a');
            o.input('a');
            o.input('c');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            String[] res = o.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-1-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void test10(){
            o.input('a');
            o.input('a');
            o.input('c');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            String[] res = o.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void test11(){
            o.input('a');
            o.input('a');
            o.input('c');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            String[] res = o.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2000-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void test12(){
            o.input('a');
            o.input('a');
            o.input('c');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            String[] res = o.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void test13(){
            o.input('a');
            o.input('a');
            o.input('c');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            String[] res = o.input('a');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void test14(){
            o.input('a');
            o.input('a');
            o.input('c');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            String[] res = o.input('c');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void test15(){
            o.input('a');
            o.input('a');
            o.input('c');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('c');
            String[] res = o.input('d');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void test16(){
            o.input('a');
            o.input('a');
            o.input('c');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('c');
            o.input('d');
            String[] res = o.input('b');
            assertEquals("ALARM", res[0]);
            assertEquals("Alarm", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void test17(){
            o.input('a');
            o.input('a');
            o.input('c');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('c');
            o.input('d');
            o.input('b');
            String[] res = o.input('a');
            assertEquals("ALARM", res[0]);
            assertEquals("Chime", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void test18(){
            o.input('a');
            o.input('a');
            o.input('c');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('b');
            o.input('a');
            o.input('c');
            o.input('d');
            o.input('b');
            o.input('a');
            String[] res = o.input('d');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
    }
    @Nested
    class ADUP{
        Sheet3 e;
        @BeforeEach
        public void setup(){
            e = new Sheet3();
        }
        @Test
        public void test1(){
            String[] res = e.input('c');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }
        @Test
        public void test2(){
            e.input('c');
            String[] res = e.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:1", res[3]);
        }
        @Test
        public void test3(){
            e.input('c');
            e.input('b');
            String[] res = e.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:2", res[3]);
        }
        @Test
        public void test4(){
            e.input('c');
            e.input('b');
            e.input('b');
            String[] res = e.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:2", res[3]);
        }
        @Test
        public void test5(){
            e.input('c');
            e.input('b');
            e.input('b');
            e.input('a');
            String[] res = e.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("1:2", res[3]);
        }
        @Test
        public void test6(){
            e.input('c');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            String[] res = e.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void test7(){
            e.input('c');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            e.input('b');
            String[] res = e.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void test8(){
            e.input('c');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            e.input('b');
            e.input('a');
            String[] res = e.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-2", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void test9(){
            e.input('c');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            String[] res = e.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-3", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void test10(){
            e.input('c');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            e.input('b');
            String[] res = e.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-1-3", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void test11(){
            e.input('c');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            e.input('b');
            e.input('a');
            String[] res = e.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-2-3", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void test12(){
            e.input('c');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            String[] res = e.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-3-3", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void test13(){
            e.input('c');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            e.input('b');
            String[] res = e.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2000-3-3", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void test14(){
            e.input('c');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            e.input('b');
            e.input('a');
            String[] res = e.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2001-3-3", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void test15(){
            e.input('c');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            e.input('b');
            e.input('a');
            e.input('b');
            String[] res = e.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2002-3-3", res[2]);
            assertEquals("2:2", res[3]);
        }
    }
}
