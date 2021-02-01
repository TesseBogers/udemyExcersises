package udemy.challenges.Java;

public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(25.42));
        printConversion(25.42);
    }

    //Method toMilesPerHour
    public static long toMilesPerHour(double kilometersPerHour) {
        //kilometersPerHour = int distance int time;
        if (kilometersPerHour < 0) {
            return -1;
        } else { //You can write the if statement without the 'else'
            return Math.round(kilometersPerHour / 1.609);
            //you already say that a long will be returned, so it's extra code if you'd write it down. We can put the calculation after the
            // return statement
        }

    }

    public static void printConversion(double kilometersPerHour) {
        //double kilometersPerHour;
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}


//
//        2. Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
//
//        This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
//
//        Then it needs to print a message in the format "XX km/h = YY mi/h".
//
//        XX represents the original value kilometersPerHour.
//        YY represents the rounded milesPerHour from the kilometersPerHour parameter.
//
//        If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".
//
//
//        Examples of input/output:
//        * printConversion(1.5); → should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h
//        * printConversion(10.25); → should print the following text (into the console - System.out): 10.25 km/h = 6 mi/h
//        * printConversion(-5.6); → should print the following text (into the console - System.out): Invalid Value
//        * printConversion(25.42); → should print the following text (into the console - System.out): 25.42 km/h = 16 mi/h
//        * printConversion(75.114); → should print the following text (into the console - System.out): 75.114 km/h = 47 mi/h
//
//
//        Use method Math.round to round the number of calculated miles per hour(double). The method round returns long.
//
//        TIP: In the method printConversion, call the method toMilesPerHour instead of duplicating the code.
//
//        NOTE: All methods should be defined as public static like we have been doing so far in the course.
//


