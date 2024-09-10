package OOP;

public class EnumDay {
    public enum Day {
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");
        private String russianNameOfDay;
        Day(String day) {
            this.russianNameOfDay = day;
        }
        public boolean isWeekend() {
            return (this.equals(SATURDAY) || this.equals(SUNDAY)) ? true : false;
        }
        public String getRusName() {
            return russianNameOfDay;
        }
    }

    public static void main(String[] args) {
        System.out.println(Day.SATURDAY.isWeekend());
        System.out.println(Day.MONDAY.getRusName());
    }
}
