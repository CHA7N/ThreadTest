public class MyThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                int num = 5;
                String name ="chenqi";
                System.out.println("MyThread....");
                try {
                    Thread.sleep(500000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
