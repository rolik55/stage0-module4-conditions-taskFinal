package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int days;
        boolean isLeapYear = false;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = -1;
                break;
        }

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            isLeapYear = true;

        if (isLeapYear && month == 2)
            days++;

        if (days != -1)
            System.out.println(days);
        else
            System.out.println("invalid date");
    }
}
