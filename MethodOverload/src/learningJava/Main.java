package learningJava;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(60, 10));
        System.out.println(getDurationString(65, 9));
        System.out.println(getDurationString(3610));

        printYearsAndDays(0);
    }

    public static String getDurationString(int minutes, int seconds){

        String output;
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        int totalMinutes = minutes + seconds / 60;
        int remainSeconds = seconds % 60;
        int totalHours = totalMinutes / 60;
        int remainMinutes = totalMinutes % 60;
        if ( totalHours < 10) {
            output = "0" + totalHours + "h ";
        }else {
            output = totalHours + "h ";
        }
        if ( remainMinutes < 10) {
            output = output + "0" + remainMinutes + "m ";
        }else {
            output = output + remainMinutes + "m ";
        }
        if ( remainSeconds < 10) {
            output = output + "0" + remainSeconds + "s ";
        }else {
            output = output + remainSeconds + "s ";
        }
        return output;
    }

    public static String getDurationString(int seconds){

        String output;
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int totalMinutes = seconds / 60;
        int remainSeconds = seconds % 60;
        output = getDurationString(totalMinutes,remainSeconds);
        return output;
    }

    public static void printYearsAndDays(long minutes){

        if (minutes < 0){
            System.out.println( "Invalid Value");
        }else{

            long hours = minutes / 60;
            long days = hours / 24;
            long remainDays = days % 365;
            long years = days / 365;

            String yearString = years + " y";
            if (years < 10){
                yearString = "0" + yearString;
            }

            String dayString = remainDays + " d";
            if (remainDays < 10){
                dayString = "0" + dayString;
            }

            String result = minutes + " min = " + yearString + " and " + dayString;

            System.out.println(result);
        }
    }

    public static void printEqual(int first, int second, int third){
        if (first < 0 || second < 0 || third < 0){
            System.out.println("Invalid Value");

        }else if (first == second && second == third) {

            System.out.println("All numbers are equal");
        }else if( first != second && first != third && second != third){

            System.out.println("All numbers are different");
        }else {

            System.out.println("Neither all are equal or different");
        }
    }
    public static boolean isCatPlaying(boolean summer, int temperature){

        if(temperature >= 25 && temperature <= 35) {

            return true;
        }else if(summer == true && temperature >=25 && temperature <= 45){
            return true;
        }else{ return false;}

}
}
