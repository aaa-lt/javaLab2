public class Task2 {
    int count;
    int price;

    public Task2(){
        this.count = 0;
        this.price = 0;
    }
    public Task2(int c, int p){
        this.count = c;
        this.price = p;
    }

    public void changeCount(int c){
        this.count = c;
    }

    public void changePrice(int p){
        this.price = p;
    }

    public int getFullPrice(){
        return this.price * this.count;
    }

    public boolean isPriceGreater(Task2 a){
        return this.price * this.count > a.price * a.count;
    }

    public int getAllCounts(Task2... arr){
        int sum = 0;
        for(Task2 item : arr){
            sum += item.count;
        }

        return sum;
    }

    public static void main(String[] args) {
        Task2 a = new Task2(100, 2);
        Task2 b = new Task2(150, 3);

        System.out.println(a.getFullPrice());
        System.out.println(b.isPriceGreater(a));
        System.out.println(a.getAllCounts(a, b));
    }
}
