public class DateUtil {
    public static String[] strMonths = {"Jan", "Feb", "Mar", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));
        System.out.println(getDayOfWeek(2022, 9, 30));
        System.out.println(printDate(2022, 9, 30));

    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year >= 1 && year <= 9999) {
            if (isLeapYear(year)) {
                if (month == 2 && day <= 29 && day >= 1)
                    return true;
            } else {
                for (int i = 1; i <= daysInMonths.length; i++) {
                    if (month == i && day >= 1 && day <= daysInMonths[i - 1])
                        return true;
                }
            }
        }
        return false;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int[] Digit = {4, 2, 0, 6, 4, 2, 0, 6};
        int[] digitNonLeapYear = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] digitLeapYear = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int twofistdigitOfYear = year / 100;
        int twolastdigitOfYear = year - 100 * twofistdigitOfYear;
        int dayOfWeek;
        if (isLeapYear(year)) {
            dayOfWeek = (Digit[twofistdigitOfYear - 17] + twolastdigitOfYear + twolastdigitOfYear / 4 + digitLeapYear[month - 1] + day) % 7;
        } else {
            dayOfWeek = (Digit[twofistdigitOfYear - 17] + twolastdigitOfYear + twolastdigitOfYear / 4 + digitNonLeapYear[month - 1] + day) % 7;
        }
        return dayOfWeek;
    }

    public static String printDate(int year, int month, int day) {
        String[] days = {"Sunday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int dayOfweek = getDayOfWeek(year, month, day);
        return days[dayOfweek - 1] + " " + day + " " + strMonths[month - 1] + " " + year;
    }
}