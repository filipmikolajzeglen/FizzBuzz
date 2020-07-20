public class Main {

    public static void fizzbuzz(int from, int to)
    {
        for(int i = from; i <= to; i++) {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(i + " - FizzBuzz");
            }
            else if(i % 3 == 0)
            {
                System.out.println(i + " - Fizz");
            }
            else if(i % 5 == 0)
            {
                System.out.println(i + " - Buzz");
            }
        }
    }

    public static void main(String[] args)
    {
        fizzbuzz(0,150);
    }

}
