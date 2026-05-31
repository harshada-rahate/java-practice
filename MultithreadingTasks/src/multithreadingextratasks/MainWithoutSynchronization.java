package multithreadingextratasks;
class Table 
{
    void print(int val) 
    {  
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(val * i);
            try 
            {
                Thread.sleep(1000);
            }
            catch (Exception e) 
            {
                System.out.println(e);
            }
        }
    }
}

class Thread1 extends Thread 
{
    Table t;

    Thread1(Table t) 
    {
        this.t = t;
    }

    public void run() 
    {
        t.print(4);
    }
}


class Thread2 extends Thread 
{
    Table t;

    Thread2(Table t) 
    {
        this.t = t;
    }

    public void run() 
    {
        t.print(6);
    }
}

public class MainWithoutSynchronization 
{
    public static void main(String[] args) 
    {
        Table table = new Table(); 

        Thread1 t1 = new Thread1(table);
        Thread2 t2 = new Thread2(table);

        t1.start();
        t2.start();
    }
}
