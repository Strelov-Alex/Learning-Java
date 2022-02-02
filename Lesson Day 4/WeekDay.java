package Day4;

public class WeekDay {
    public static void main(String[] args) {
        var day = 50;

        String[] days = {"Mondey", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        var result = day >= 1 && day <= 7 ? days[day - 1] : "Invalid day " + day;
        System.out.println(result);

    }
}
