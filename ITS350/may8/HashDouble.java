package may8;

public class HashDouble {
    Entry hashArray[];
    int elements;
    int hashSize;
    int prime = 3;
    HashDouble(int size){
        hashSize = size;
        hashArray = new Entry[hashSize];
        elements = 0;
    }
    
    int hash(int key){
        return key%hashSize;
    }
    int hash2(int key){
        return prime - (key%hashSize);
    }
    public void put(Entry item){
        if(elements<hashSize){
           int index = hash(item.key); 
           int stepSize = hash2(item.key);
           while(hashArray[index] != null){
               if(hashArray[index].key == -1){
                   break;
               }
               index += stepSize; //the second hash function
               index %= hashSize; //wraparround
           }
           elements++;
           hashArray[index] = item;
        }else
            System.out.println("the hashtable is full");
    }
    Entry remove(int key){
        int index = hash(key);
        int stepSize = hash2(key);
        while(hashArray[index] != null){
            if(hashArray[index].key == key){
                Entry delIetm = hashArray[index];
                hashArray[index] = new Entry(-1, "");
                elements--;
                return delIetm;
            }
            index+=stepSize;
            index%=hashSize;
        }
        return null;
    }
    
    public void display(){
        for(int i=0; i<hashSize; i++){
            if(hashArray[i] != null)
                System.out.print("key-->"+hashArray[i].key + " " + hashArray[i].val+" ");
            else
                System.out.print(" * ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        HashDouble hash = new HashDouble(10);
        //Entry item1 = new Entry(5, "A");
        hash.put(new Entry(5, "A"));
        hash.put(new Entry(10, "B"));
        hash.put(new Entry(20, "C"));
        hash.display();
        hash.remove(10);
        hash.display();
        hash.remove(20);
        hash.display();
        hash.put(new Entry(10, "R"));
        hash.display();
    }
}