package multithreadingextratasks;

class Table2 {
   static synchronized void print(int val) {
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

class Thread5 extends Thread {
    Table2 t;

    Thread5(Table2 t) {
        this.t = t;
    }

    public void run() {
        Table2.print(4);
    }
}

class Thread6 extends Thread {
    Table2 t;

    Thread6(Table2 t) {
        this.t = t;
    }

    public void run() {
        Table2.print(6);
    }
}

public class MainWithSynchronizationClassLevel {
    public static void main(String[] args) {
        Table2 table = new Table2(); 

        Thread5 t1 = new Thread5(table);
        Thread6 t2 = new Thread6(table);

        t1.start();
        t2.start();
    }
}
