package fundamentals;

public class ConvertingVariables {
    public static void main(String[] args) {
        // promotion : From the lower data type => greater data type
        float avg = 2.5f;
        double price = avg;
        // casting : From Greater data type  => Lower data type
        double dd = 3.5;
        float ff = (float) dd;
        // autoboxing : Primitive data type => Wrapper class
        int age = 18;
        Double peronAge = Double.valueOf(age);
        // unboxing : Wrapper class => Primitive data type
        Integer ddd = 5;
        double dddd = ddd;
    }
}
