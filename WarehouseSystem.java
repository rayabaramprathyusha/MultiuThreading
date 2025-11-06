
class OrderPacker extends Thread{
    private String workername;
    public OrderPacker(String workername){
        this.workername=workername;
    }
    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println(workername + " packed item #" + i);
            try{Thread.sleep(1000);}catch(InterruptedException e){}
        }
        System.out.println("Order packer finished"+workername);
    }

}

public class WarehouseSystem {
    public static void main(String[] args) {
        new OrderPacker("Worker-A").start();
        new OrderPacker("Worker-B").start();
        new OrderPacker("Worker-C").start();

    }
}
