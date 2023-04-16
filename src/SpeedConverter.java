public class SpeedConverter {
    // Kilometers per hour method
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        }
        //Math. has many built in Java Methods.
        return Math.round(kilometersPerHour / 1.609);
    }
    // print method
    public static void printConversion(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mph");
        }
    }
}
