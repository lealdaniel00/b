public class Hilo2 implements Runnable {
    
    @Override public void run(){
        int y = 1, x = 0;
        try{
            while(y>0) {
                System.out.println("Numero "+x);
                x++;
                Thread.sleep(500);
            }
        }catch(Exception ex){
            System.out.println(""+ex);
        }
    }
    
}
