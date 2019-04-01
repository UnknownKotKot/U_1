package Shildt.Glava6;

class QDemo2Orig {
    public static void main(String args[]) {
        // construct 10-element empty queue
        QueueOrig  q1 = new QueueOrig (10);

        char name[] = {'T', 'o', 'm'};
        // construct queue from array
        QueueOrig  q2 = new QueueOrig (name);

        char ch;
        int i;

        // put some characters into q1
        for(i=0; i < 10; i++)
            q1.put((char) ('A' + i));

        // construct queue from another queue
        QueueOrig  q3 = new QueueOrig (q1);

        // Show the queues.
        System.out.print("Contents of q1: ");
        for(i=0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q2: ");
        for(i=0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q3: ");
        for(i=0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
