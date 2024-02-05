public enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    boolean isWeekend() {
        return this.equals(SUNDAY) || this.equals(SATURDAY);
    }
}
