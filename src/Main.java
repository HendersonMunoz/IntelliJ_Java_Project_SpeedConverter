public class Main {
    // test the code by giving parameters tp calculate.
    public static void main(String[] args) {
        // Calling the 'SpeedConverter' class I created, and using the 'toMilesPerHour' method by giving it a value of 10.5.
        // Then assigning the result to a variable I created below called 'miles'. Then printing the result.
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);
    }
}
