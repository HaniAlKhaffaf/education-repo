package oct10;

public class App {

    // Todays topic is Data Interoperability

    // How to serialize a data from one node to another
    // sending a node over while ensuring its reliability

    // Moving Complex data, u want to transfer it from one node to another
    // and u want the other node to receive it in the same format

    // if both the sender and receiver are written in java, then it is a very procedure
    // by just using ObjectInput/OutputStream

    // but the problem arises in distributed system, is when the nodes are 
    // written in two different languages, Ex: node1 in java and node2 in C++
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Hani";
        p1.age = 21;
        p1.salary = 300;

        // in java we will transfer data using ObjectOutputStream()
        // Todays obj is to format it into a string and send it over


        // we need to use a format to describe complex data type over the web
        // and that is JSON

        // String msg = "";
        // msg += "{";
        // msg += "name:\"" + p1.name + "\",";
        // msg += "age:" + p1.age + ",";
        // msg += "salary:" + p1.salary + ",";
        // msg += "}";

        // System.out.println(msg);

        // {} --> Object
        // {
        // Key: "value", --> the syntax and dont forget comma
        // key: "value"
        // courses:["", "", ""] --> a data structure, usually an array
        // }

        // You have to always follow the exact standard

        // you need to install Third-party API GSON
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        // From Object to JSON String
        String msg = gson.toJson(p1);
        System.out.println(msg);


        //Disadvantages
        // 1- The data types are missing
        // 2- Formatting it over String, which means more bytes you have to send over
        // String --> always more data

        // The second Disadvantage is present for both XML and JSON

        // You can also transfer data using XML, which can avoid the disadvantage number 1 in JSON
        // XML is nowadays less popular, JSON is more popular and enough to do our daily job
        // but when u deal with enterprise level, it is always better to use XML


    }
}