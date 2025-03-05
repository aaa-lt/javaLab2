import java.util.Arrays;

public class Task4 {
    int m, n;

    public Task4() {
        this(1, 1);
    }

    public Task4(int m, int n) {
        if (n == 0) {
            return;
        };

        this.m = m;
        this.n = n;
        simplify();
    }

    private void simplify() {
        int min = 0, nod = 0;

        min = Math.max(n, m);

        for (int i = 1; i <= min; i++) {
            if(m % i == 0 && n % i == 0) {
                nod = i;
            }
        }

        m /= nod;
        n /= nod;

        if (n < 0) {
            m = -m;
            n = -n;
        }
    }

    public static Task4 add(Task4... items) {
        int m = 0, n = 1;
        for (Task4 item : items) {
            m = m * item.n + item.m * n;
            n *= item.n;
        }
        return new Task4(m, n);
    }

    public static Task4 multiply(Task4... items) {
        int m = 1, n = 1;
        for (Task4 item : items) {
            m *= item.m;
            n *= item.n;
        }
        return new Task4(m, n);
    }

    public Task4 subtract(Task4 item) {
        return add(this, new Task4(-item.m, item.n));
    }

    public Task4 divide(Task4 item) {
        return multiply(this, new Task4(item.n, item.m));
    }

    public static void modifyArray(Task4[] items) {
        for (int i = 0; i < items.length - 1; i += 2) {
            items[i] = add(items[i], items[i + 1]);
        }
    }

    public String toString() {
        return m + "/" + n;
    }

    public static void main(String[] args) {
        Task4[] items = {
                new Task4(1, 2), new Task4(1, 3),
                new Task4(2, 5), new Task4(3, 4),
                new Task4(5, 6)
        };

        System.out.println("Original items:");
        System.out.println(Arrays.toString(items));

        modifyArray(items);

        System.out.println("Modified items:");
        System.out.println(Arrays.toString(items));
    }
}
