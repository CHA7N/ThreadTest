public class MyThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                int num = 5;
                String name ="chenqi";
                String name1="chenqi1";
                String name2="chenqi2";
                String name23="chenqi234";
                String name223="chenqi2334";
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
