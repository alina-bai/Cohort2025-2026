package Assignments.PrintableItems;

public class Main {
    public static void main(String[] args) {
        Printable[] items = new Printable[3];
        items[0] = new Document("report.pdf");
        items[1] = new Photo();
        items[2] = new Barcode("123456ABC");

        for (Printable item : items) {
            item.print(); // Just use it, don’t redeclare
        }
        System.out.println("\nPrinting in reverse:");
        PrintQueue queue = new PrintQueue(items);
        queue.printAllInreverse();

    }
}
