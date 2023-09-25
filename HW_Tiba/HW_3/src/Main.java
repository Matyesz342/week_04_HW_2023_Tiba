// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinearEquation L1 = new LinearEquation(1,2,3,4,5,6);
        LinearEquation L2 = new LinearEquation(1,4,3,4,5,6);
        LinearEquation L3 = new LinearEquation(1,2,10,4,5,6);
        if (L1.isSolvable())
        {
            System.out.println(L1.getX());
            System.out.println(L1.getY());
        }
        else {
            System.out.println("The equation has no solution.");
        }
        if (L2.isSolvable())
        {
            System.out.println(L2.getX());
            System.out.println(L2.getY());
        }
        else {
            System.out.println("The equation has no solution.");
        }
        if (L3.isSolvable())
        {
            System.out.println(L3.getX());
            System.out.println(L3.getY());
        }
        else {
            System.out.println("The equation has no solution.");
        }
    }
}