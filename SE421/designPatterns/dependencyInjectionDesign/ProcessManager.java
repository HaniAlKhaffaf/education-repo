package designPatterns.dependencyInjectionDesign;

public class ProcessManager {
    private Bankservice bank;  // these two are interfaces
    private DBUtil db;

    public ProcessManager(Bankservice bank, DBUtil db){
        this.bank = bank;
        this.db = db;
    }

    public void process(int fromID, int toID, double amount){
        bank.transfer(fromID, toID, amount);
        db.insertTransaction(fromID, toID, amount);
    }
}
