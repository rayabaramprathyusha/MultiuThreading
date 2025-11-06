
class SensorThread extends Thread{
    private String SensorName;
    public SensorThread(String SensorName){
        this.SensorName=SensorName;
    }
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            double value=Math.random()*100;
            System.out.println(SensorName + " Reading: " + value);
            try{Thread.sleep(500);}catch(Exception e){}

        }
        System.out.println(SensorName + " Stopped");
    }
}


public class SensorSystem {
    public static void main(String[] args) {
        new SensorThread("Temperature sensor").start();
        new SensorThread("Pressure sensor").start();
        new SensorThread("Humidity sensor").start();
    }
}
