package nov9;

public class Main {
    public static void main(String[] args) {
        // ZooKeeper part 2

        /*
         * you should always give zookeeper an absolute path, and there is not such
         * thing such as cd directory
         * 
         * What is a watcher, basically an event listener, it will listen and then
         * execute, oen thing to note is that, the method process wont be called until
         * a conncection is established but this is only with the ZooKeeper("ip",
         * "port", wc)
         * because with each constructor the process method will be called according to
         * different action, basically it will be listening to a different thing
         * 
         * another listening event is when u attach it to a getdata of a node, then it
         * will
         * only listen to when a data of that node changes for example
         * byte[] arr zoo.getData(path, new Watcher(){
         * process()...
         * })
         * 
         * you can also have one watched respond with same response of another watcher
         * 
         * note: watchers are one-time triggers, so they only get triggered one time
         * but you can still avoid this thing by
         * reattaching it again similar to recurssion
         * \
         * you can also monitor the children
         * 
         * 
         */
    }
}