package Assignments.PrintableItems;

public class Document implements Printable {
 private  String filename;

 public  Document (String filename){
     this.filename = filename;
 }

    @Override
    public void print() {
        System.out.println("Printing document: " + filename);
    }
}
