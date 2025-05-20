package Assignments.PrintableItems;

public class Barcode implements Printable {

    private String code;

    public Barcode (String code) {
        this.code = code;
    }

    @Override
    public void print() {
        System.out.println("Barcode " + code + "sent to label printer");
    }
}
