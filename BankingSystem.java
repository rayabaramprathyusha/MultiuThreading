
class LedgerUpdateThread  extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println("Ledger: Posted transaction #" + i);
            try{Thread.sleep(1000);}catch(Exception e){}
        }
        System.out.println("Ledger: update completed");
    }
}

class FraudDetectionThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println("Fraud System:Scanning Transaction #" + i);
            try{Thread.sleep(1000);}catch(Exception e){}
        }
        System.out.println("Fraud scan Completed");
    }
}

public class BankingSystem {
    public static void main(String[] args){
        new LedgerUpdateThread().start();
        new FraudDetectionThread().start();

    }
}
