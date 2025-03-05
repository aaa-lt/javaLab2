import java.util.Scanner;

public class Task3 {
    String author;
    String title;
    int year;
    int pageCount;

    public Task3() {
        author = null;
        title = null;
        year = 0;
        pageCount = 0;
    }

    public Task3(String Author, String Title, int Year, int PageCount) {
        this.author = Author;
        this.title = Title;
        this.year = Year;
        this.pageCount = PageCount;
    }

    private String getTextFromUser(String getMsg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(getMsg);

        return sc.nextLine();
    }

    private int getIntFromUser(String getMsg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(getMsg);

        if (sc.hasNextInt()) {
            return sc.nextInt();
        }

        return 0;
    }

    public void changeAuthor(String newAuthor) {
        author = newAuthor;
    }

    public void changeAuthor(){
        changeAuthor(getTextFromUser("Enter Author: "));
    }

    public void changeTitle(String newTitle) {
        title = newTitle;
    }

    public void changeTitle(){
        changeTitle(getTextFromUser("Enter Title: "));
    }

    public void changeYear(int newYear) {
        year = newYear;
    }

    public void changeYear(){
        changeYear(getIntFromUser("Enter year: "));
    }

    public void changePageCount(int newPageCount) {
        pageCount = newPageCount;
    }

    public void changePageCount(){
        changePageCount(getIntFromUser("Enter page count: "));
    }

    public String getInfo(String title) {
        if (title.equals(this.title)) {
            return "Author: " + author + " Title: " + title + " Year: " + year + " Page Count: " + pageCount;
        }

        return "Not found";
    }


    public static void main(String[] args) {
        Task3 task3 = new Task3("Max", "How to become Max", 2022, 456);

//        System.out.println(task3.year);
//        task3.changeAuthor();
//        System.out.println(task3.author);
//        task3.changeYear();
//        System.out.println(task3.year);

        System.out.println(task3.getInfo("How to become Max"));
    }
}
