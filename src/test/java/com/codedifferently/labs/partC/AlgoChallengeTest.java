package com.codedifferently.labs.partC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partC.AlgoChallenge;

public class AlgoChallengeTest {

    @Test
    public void oneTeenTest01() {


        int a = 13;
        int b = 99;


        Boolean expected = true;
        Boolean actual = AlgoChallenge.oneTeen(a, b);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void oneTeenTest02() {


        int a = 21;
        int b = 19;


        Boolean expected = true;
        Boolean actual = AlgoChallenge.oneTeen(a, b);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void oneTeenTest03() {


        int a = 13;
        int b = 13;


        Boolean expected = false;
        Boolean actual = AlgoChallenge.oneTeen(a, b);


        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void beginWithOzTest01() {


        String str = "ozymandias";


        String expected = "oz";
        String actual = AlgoChallenge.beginWithOz(str);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beginWithOzTest02() {


        String str = "bzoo";


        String expected = "z";
        String actual = AlgoChallenge.beginWithOz(str);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beginWithOzTest03() {


        String str = "oxx";


        String expected = "o";
        String actual = AlgoChallenge.beginWithOz(str);


        Assertions.assertEquals(expected, actual);
    }
}
