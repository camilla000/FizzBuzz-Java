import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {

    @Test
    public void NotFizzOrBuzz(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("1", fizzbuzz.convert(1));
        assertEquals("2", fizzbuzz.convert(2));
    }

    @Test
    public void checkIfMultipleOfThree(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("Fizz", fizzbuzz.convert(3));
    }

    @Test
    public void checkIfMultipleOfFive(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("Buzz", fizzbuzz.convert(5));
    }

    @Test
    public void checkIfMultipleOfThreeAndFive(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("FizzBuzz",fizzbuzz.convert(15));
    }

    @Test
    public void outputResults(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        for (int i =1; i <= 50; i++){
            System.out.println(fizzbuzz.convert(i));
        }
    }

}
