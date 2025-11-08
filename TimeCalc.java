public class TimeCalc {
    public static void main(String[] args) {
       String time = args[0];        
        int minutesToAdd = Integer.parseInt(args[1]); 

        
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        
        int totalMinutes = hours * 60 + minutes + minutesToAdd;


        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;

        if (newHours < 10 && newMinutes < 10) {
            System.out.println("0" + newHours + ":0" + newMinutes);
        } else if (newHours < 10) {
            System.out.println("0" + newHours + ":" + newMinutes);
        } else if (newMinutes < 10) {
            System.out.println(newHours + ":0" + newMinutes);
        } else {
            System.out.println(newHours + ":" + newMinutes);
        }
    }
}
