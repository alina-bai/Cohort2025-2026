package Assignments.PrintableItems;

public class PrintQueue {
    private Printable[] queue;

    public PrintQueue (Printable[] queue){
        this.queue = queue;
    }
    public void printAllInreverse (){
        for( int i = queue.length-1; i >=0; i--)
            queue[i].print();
    }

}
