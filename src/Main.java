import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemperature(20, 30));
        System.out.println(ageAndTemperature(23, 12));
        System.out.println(ageAndTemperature(37, -8));
        System.out.println(ageAndTemperature(55, -15));
        System.out.println(ageAndTemperature(61, -20));
        System.out.println(ageAndTemperature(generateRandomAge(),generateRandomAge()));
    }

    public static String ageAndTemperature(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30)
            return "Можно идти гулять";
        else if (age <= 20 && temperature >= 0 && temperature <= 28)
            return "Можно идти гулять";
        else if (age > 45 && temperature >= -10 && temperature <= 25)
            return "Можно идти гулять";
        else
            return "Оставайтесь дома";
    }

        public static int generateRandomAge () {
            Random rn = new Random();
            int conc = rn.nextInt(96);
            return conc;


        }


}