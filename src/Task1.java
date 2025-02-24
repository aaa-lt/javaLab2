public class Task1 {
    public int radius;
    public int xCord;
    public int yCord;

    public Task1() {
        radius = 1;
        xCord = 0;
        yCord = 0;
    }

    public Task1(int r) {
        radius = r;
    }

    public Task1(int x, int y) {
        xCord = x;
        yCord = y;
    }

    public Task1(int r, int x, int y) {
        xCord = x;
        yCord = y;
        radius = r;
    }

    public String getInfo() {
        return "R = " + radius + "; x = " + xCord + "; y = " + yCord;
    }

    public void setCenter(int x, int y) {
        xCord = x;
        yCord = y;
    }

    public void setRadius(int r) {
        radius = r;
    }

    public int getCircleSquare() {
        return radius * radius;
    }

    public double getCircleLength() {
        return Math.floor(radius * 2 * Math.PI * 10) / 10;
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1(5, 10, 10);

        System.out.println(task1.getInfo());
        System.out.println(task1.getCircleSquare());
        System.out.println(task1.getCircleLength());
    }
}
