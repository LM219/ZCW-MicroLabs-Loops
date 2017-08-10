package io.zipcoder.microlabs.mastering_loops;

import org.junit.Assert;
import org.junit.Test;

public class NumbersTest {

    @Test
    public void oneToTenTest(){
        //: Given
        Numbers numbers = new Numbers();
        String expected = "oneToTen()\n*** Output ***\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        String actual = numbers.oneToTen();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void oddNumbersTest(){
        //: Given
    	Numbers numbers = new Numbers ();
    	String expected ="oddNumbers()\n*** Output ***\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";
        //: When
    	String actual = numbers.oddNumbers();
        //: Then
    	Assert.assertEquals("The two strings are equal" , expected, actual);
    }

    @Test
    public void squaresTest(){
        //: Given
    	Numbers numbers = new Numbers();
    	String expected = "squares()\n*** Output ***\n1\n4\n9\n16\n25\n36\n49\n64\n81\n100";

        //: When
    	String actual = numbers.squares();

        //: Then
    	Assert.assertEquals("The two strings are equals", expected, actual);
    }

    @Test
    public void random4Test(){
        //: Given
    	Numbers numbers = new Numbers();
    	//String expected = "random4()\n*** Output ***\n" + int +
        //: When

        //: Then
    }

    @Test
    public void evenTest(){
        //: Given
    	Numbers numbers = new Numbers();
    	String expected = "even()\n*** Output ***\n2\n4\n6\n8\n10";
        //: When
    	String actual = numbers.even(10);
    	
        //: Then
    	Assert.assertEquals("The two strings are equals", expected, actual);
    }

    @Test
    public void powersTest(){
        //: Given
    	Numbers numbers = new Numbers();
    	String expected = "powers()\n*** Output ***\n2\n4\n8";
        //: When
    	String actual = numbers.powers(3);
        //: Then
    	Assert.assertEquals("The two strings are equals", expected, actual);
    }

    @Test    
    public void areWeThereYetTest(){
        //: Given
    	Numbers numbers = new Numbers();
    	String expected = "Good!";
        //: When
    	String actual = numbers.areWeThereYet("yes");
        //: Then
    	Assert.assertEquals("The two strings are equals", expected, actual);
    }
    
    @Test    
    public void triangle(){
        //: Given
    	Numbers numbers = new Numbers();
    	String expected = "*\n**\n***\n****\n*****";
//        //: When
    	String actual = numbers.triangle("*", 5);
//        //: Then
    	Assert.assertEquals("The two strings are equals", expected, actual);
    	
    	//numbers.triangle("", 5);
    }
    
    @Test    
    public void testSquare(){
        //: Given
    	Numbers numbers = new Numbers();
        String expected = "\n|  1 |  2 |  3 |  4 |\n|  2 |  4 |  6 |  8 |\n|  3 |  6 |  9 | 12 |\n|  4 |  8 | 12 | 16 |";
    	//String expected = " 1 2 3  4 \n  2  4  6  8 \n  3  6  9  12 \n  4  8  16  20 ";

        //: When
    	String actual = numbers.testSquare();
        //: Then
    	Assert.assertEquals("The two strings are equals", expected, actual);
    }
    
    @Test    
    public void testSquaresn(){
        //: Given
    	Numbers numbers = new Numbers();
        String expected = "\n|  1 |  2 |  3 |  4 |\n|  2 |  4 |  6 |  8 |\n|  3 |  6 |  9 | 12 |\n|  4 |  8 | 12 | 16 |";
    	//String expected = " 1 2 3  4 \n  2  4  6  8 \n  3  6  9  12 \n  4  8  16  20 ";

        //: When
    	String actual = numbers.testSquaresn(4,4);
        //: Then
    	Assert.assertEquals("The two strings are equals", expected, actual);
    }
}
