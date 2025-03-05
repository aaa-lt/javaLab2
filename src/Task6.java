public class Task6 {
    public static void main(String[] args) {
        processString("I like Java!!!");
    }

    public static void processString(String str) {
        System.out.println("последний символ строки: " + str.charAt(str.length() - 1));
        System.out.println("заканчивается ли строка подстрокой '!!!': " + str.endsWith("!!!"));
        System.out.println("начинается ли строка подстрокой 'I like': " + str.startsWith("I like"));
        System.out.println("содержит ли строка подстроку 'Java': " + str.contains("Java"));
        System.out.println("позицию подстроки 'Java': " + str.indexOf("Java"));
        System.out.println("Замените все символы: " + str.replace('a', 'o'));
        System.out.println("строку к верхнему регистру: " + str.toUpperCase());
        System.out.println("строку к нижнему: " + str.toLowerCase());
        System.out.println("Вырежьте строку: " + str.substring(str.indexOf("Java"), str.indexOf("Java") + 4));
    }
}