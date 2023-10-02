package may8;

public class Quiz {
    
    public Entry find(Entry item) {
        int key = item.key;
        int val = item.val;
        int index = hashfun(key);
        while (hashArr[index] != null) {
            if (item.key == key) {
                item.val == val;
                return item.val;
            }
            index ++;
            index %= hashArr.length;
        }
        return null;
        
    }

}
