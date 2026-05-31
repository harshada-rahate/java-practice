package multithreadingextratasks;
class Table3 
{
    void print(int val) 
    {  
    	  synchronized(this){  
    	        
    	      for(int i=1;i<=10;i++){
    	       System.out.println(val*i);
    	       try{
    	       Thread.sleep(1000);
    	       }catch(Exception e){
    	           System.out.println(e);
    	        }
    	       
    	      }
    	       
    	           
    	   }
    }
}


class Thread7 extends Thread 
{
    Table3 t;

    Thread7(Table3 t) 
    {
        this.t = t;
    }

    public void run() 
    {
        t.print(4);
    }
}


class Thread8 extends Thread 
{
    Table3 t;

    Thread8(Table3 t) 
    {
        this.t = t;
    }

    public void run() 
    {
        t.print(6);
    }
}

public class MainWithSynchronizeBlock 
{
    public static void main(String[] args) 
    {
    	System.out.println("Main Method");
        Table3 table = new Table3(); 

        Thread7 t1 = new Thread7(table);
        Thread8 t2 = new Thread8(table);

        t1.start();
        t2.start();
    }
}
