public class Task2 {
    int count;
    int price;

    public Task2(){
        this.count = 0;
        this.price = 0;
    }
    public Task2(int count, int price){
        this.count = count;
        this.price = price;
    }

    public void changeCount(int count){
        this.count = count;
    }

    public void changePrice(int price){
        this.price = price;
    }

    public int getFullPrice(){
        return this.price * this.count;
    }

    public boolean isPriceGreater(Task2 toCompare){
        return this.price * this.count > toCompare.price * toCompare.count;
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
