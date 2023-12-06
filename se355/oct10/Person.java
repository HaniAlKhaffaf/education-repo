package oct10;

import com.google.gson.annoatations.*;

public class Person {

    // for the following, it means that when u sent it as a JSON object, then please dont send it as
    // a name but rather full_name, also it only works for what is under it exactly
    @SerializedName("full_name")
    public String name;
    public int age;
    public int salary;
}