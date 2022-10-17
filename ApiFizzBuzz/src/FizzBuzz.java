public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean Fizz = number % 3 == 0;
        boolean Buzz = number % 5 == 0;
        if(Fizz && Buzz)
            return "FizzBuzz";

        if(Fizz)
            return "Fizz";

        if(Buzz)
            return "Buzz";

        return number + "";
    }
}