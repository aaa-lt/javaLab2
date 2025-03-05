public class Task5 {
    public static void main(String[] args) {
        Double doubleVal = Double.valueOf("20.5");

        System.out.println("Double: " + Double.parseDouble(doubleVal.toString()));
        System.out.println("Float: " + doubleVal.floatValue());
        System.out.println("Int: " + doubleVal.intValue());
        System.out.println("Long: " + doubleVal.longValue());
        System.out.println("Short: " + doubleVal.shortValue());
        System.out.println("Byte: " + doubleVal.byteValue());

        String d = Double.toString(3.14);
        System.out.println("String: " + d);
    }
}
