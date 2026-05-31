package multithreadingextratasks;

class Table1 {
    synchronized void print(int val) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(val * i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Thread3 extends Thread {
    Table1 t;

    Thread3(Table1 t) {
        this.t = t;
    }

    public void run() {
        t.print(4);
    }
}

class Thread4 extends Thread {
    Table1 t;

    Thread4(Table1 t) {
        this.t = t;
    }

    public void run() {
        t.print(6);
    }
}

public class MainWithSynchronizationObjectLevel {
    public static void main(String[] args) {
        Table1 table = new Table1(); // Corrected from Table to Table1

        Thread3 t1 = new Thread3(table);
        Thread4 t2 = new Thread4(table);

        t1.start();
        t2.start();
    }
}
