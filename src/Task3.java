import java.util.Scanner;

public class Task3 {
    String Author;
    String Title;
    int Year;
    int PageCount;

    public Task3() {
        Author = null;
        Title = null;
        Year = 0;
        PageCount = 0;
    }

    public Task3(String Author, String Title, int Year, int PageCount) {
        this.Author = Author;
        this.Title = Title;
        this.Year = Year;
        this.PageCount = PageCount;
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
        Author = newAuthor;
    }

    public void changeAuthor(){
        changeAuthor(getTextFromUser("Enter Author: "));
    }

    public void changeTitle(String newTitle) {
        Title = newTitle;
    }

    public void changeTitle(){
        changeTitle(getTextFromUser("Enter Title: "));
    }

    public void changeYear(int newYear) {
        Year = newYear;
    }

    public void changeYear(){
        changeYear(getIntFromUser("Enter year: "));
    }

    public void changePageCount(int newPageCount) {
        PageCount = newPageCount;
    }

    public void changePageCount(){
        changePageCount(getIntFromUser("Enter page count: "));
    }


    public static void main(String[] args) {
        Task3 task3 = new Task3("Max", "How to become Max", 2022, 456);
        System.out.println(task3.Year);
        task3.changeAuthor();
        System.out.println(task3.Author);
        task3.changeYear();
        System.out.println(task3.Year);
    }
}
