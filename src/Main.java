
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String city = "Columbus";
        int zipCode = 43215;
        double weather[] = {32,25,27,40,45};
        System.out.println("City: "+ city);
        System.out.println("Zipcode: " + zipCode);
        double sum = 0;
        for(int i = 0 ; i < weather.length; i++){
            sum += weather[i]/weather.length;
        }
        System.out.println("Average Temperature: " +sum);

    }


}