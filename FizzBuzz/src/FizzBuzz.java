public class FizzBuzz {
    private int number;
    public FizzBuzz(int number) {
        this.number = number;
    }
    public String toString(){
        boolean isDivideBy3 = this.number % 3 == 0;
        boolean isDivideBy5 = this.number % 5 == 0;
        if (isDivideBy3 && isDivideBy5)
            return "FizzBuzz";
        else if(isDivideBy3)
            return "Fizz";
        else if(isDivideBy5)
            return  "Buzz";
        else
            return "0";
    }
}
