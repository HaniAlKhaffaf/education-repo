package may8;
import java.util.LinkedList;


public class HashChain {
    LinkedList<Entry> hashTable [];


    public HashChain(int size) {
        hashTable = new LinkedList[size];
    }

    int hash(int key) {
        return key % hashTable.length;
    }
 
    void put(int key, String val) {
        int index = hash(key);
        if(hashTable[index] == null)
            hashTable[index] = new LinkedList();
        for(Entry entry:hashTable[index]){
            if (entry.key == key) {
                entry.val = val;
                return;
            }
        }
        hashTable[index].addLast(new Entry(key, val));
    }

    void delete(int key){
        Entry entry = getEntry(key);
        if(entry != null) {
            getBucket(key).remove(entry);
        }
    }

    String findValue(int key){
        Entry entry = getEntry(key);
        if(entry != null) {
            return entry.val;
        }
        return null;
        
    }

    Entry getEntry(int key) {
        LinkedList<Entry> bucket = getBucket(key);
        if(bucket!=null) {
            for(Entry entry:bucket) {
                if(entry.key == key)
                return entry;
            }
        }
        return null;
    }

    

    LinkedList<Entry> getBucket(int key) {
        int index = hash(key);
        return hashTable[index];
    }
    void display() {
        for(LinkedList<Entry> bucket:hashTable) {
            if(bucket!=null) {
                for(Entry entry:bucket){
                    System.out.print("Key " + entry.key + " --> " + entry.val);
                }
                System.out.println();
            }
            System.out.println("+");
        }
    }

    public static void main(String[] args) {
        HashChain hash = new HashChain(11);
        hash.put(11, "A");
        hash.put(6, "B");
        hash.put(22, "C");
        hash.put(17, "D");
        hash.display();
        hash.delete(11);
        hash.display();
        System.out.println(hash.findValue(22));
    }
}
