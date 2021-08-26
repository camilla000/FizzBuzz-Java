public class FizzBuzz {

    public String convert(int upto){

        if (upto % 3 == 0  && upto % 5 == 0) {
            return "FizzBuzz";
        }
        else if (upto % 3 == 0){ // check if number is a multiple of 3 and return Fizz
            return "Fizz";

        } else if (upto % 5 == 0){   //check if number is a multiple of five and return Buzz
            return "Buzz";
        }


//        return the numbers
        return String.valueOf(upto);
    }

}
