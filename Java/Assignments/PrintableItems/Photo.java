package Assignments.PrintableItems;

public class Photo implements Printable {
    @Override
    public void print() {
        System.out.println("Photo printed in color");
    }
}
