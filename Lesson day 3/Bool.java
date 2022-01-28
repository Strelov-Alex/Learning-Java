public class Bool {
    public static void main(String[] args) {
        int time = 12;
        boolean late = time >=23 || time <= 5;
        boolean isGoodWeather = false;
        if (late) {
            System.out.println("SLEEP");
        }
        if (!late && isGoodWeather){
            System.out.println("GO TO WALK!");
        }
        if (!late && !isGoodWeather){
            System.out.println("READ TO BOOK");
        }


         }
    }

