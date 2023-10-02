package apr11;

public class ProcessMangaer {

    // private BankService bank;
    // private DBUtil db;
    

    // // bank = BankFactory.create();
    // // db = DBUtilFactory.create();

    // public ProcessMangaer(BankService Bank, DBUtil db) {

    //     this.bank = bank;
    //     this.db = db;
    //             // better sollution would be like
    //             // BankSerivce bank = bank = BankFactory.create();
    //             // bank.transfer(fromID, toID, amount);
    //             // DBUtil db = DBUtilFactory.create();
    //             // db.insertTransaction(fromID, toID, amount);
    // }

    // // Dependency Injection (DI)
    // // each service would need a class, with DI, it will help optimize the classes
    // // so if you have 10 services, you will need 10 classes, with DI, you can 
    // // have maximum of 2-3 classes for all of the services

    // // PSEUDOCODE
    // public void process(int fromID, int toID, double amount) {
    //     ByblosBankSerivce bank = new ByblosBankService();
    //     bank.transfer(fromID, toID, amount);
    //     DBUtil db = new DBUtilOracleDB();
    //     db.insertTransaction(fromID, toID, amount);



}
