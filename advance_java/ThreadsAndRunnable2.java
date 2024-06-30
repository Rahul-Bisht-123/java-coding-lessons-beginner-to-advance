package advance_java;

public class ThreadsAndRunnable2 {
  
  public static void main(String[] args) {
    Runnable obj_a = new Runnable() {
      @Override
      public void run() {
        for(int i=0;i<5;i++){
          System.out.println("Hi A");
    
          try {
            Thread.sleep(10);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    };

    Runnable obj_b = new Runnable() {
      @Override
      public void run() {
        for(int i=0;i<5;i++){
          System.out.println("Hello B");
    
          try {
            Thread.sleep(10);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    };

    Thread t1 = new Thread(obj_a);
    Thread t2 = new Thread(obj_b);

    t1.start();
    t2.start();

  }
}

class A implements Runnable{

  @Override
  public void run() {
    for(int i=0;i<5;i++){
      System.out.println("Hi A");

      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
class B implements Runnable{

  @Override
  public void run() {
    for(int i=0;i<5;i++){
      System.out.println("hi B..");

      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
  
}