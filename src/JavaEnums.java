public class JavaEnums {
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println("Today is " + day + " and it is " + (day.isWeekend() ? "" : "not ") + "weekend.");
        }
    }
}