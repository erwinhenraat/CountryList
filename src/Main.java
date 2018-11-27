import java.util.Random;

public class Main {


    public static void main(String[] args) {

        System.out.println(getRandomCountry());
    }
    public static String getRandomCountry(){
        int r = new Random().nextInt(CountryList.LIST.length-1);
       return CountryList.LIST[r];
    }
}
