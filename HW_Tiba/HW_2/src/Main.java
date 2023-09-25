// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RegularPolygon RP1 = new RegularPolygon();
        RegularPolygon RP2 = new RegularPolygon(6,4);
        RegularPolygon RP3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println(RP1.toString());
        System.out.println(RP2.toString());
        System.out.println(RP3.toString());
    }
}