class Task11 {
        int p = 3, y = 2, sum;

        void methodA() {
            int x = 0;
            int y = 0;
            y = y + this.y;
            x = sum + 2 + p;
            sum = x + y + methodB(p, y);
            System.out.printf("%-5d %-5d %-5d%n", x, y, sum);
        }

        int methodB(int p, int n) {
            int x = 0;

            y = y + (++p);
            x = x + 2 + n;
            sum = sum + x + y;

            System.out.printf("%-5d %-5d %-5d%n", x, y, sum);

            return sum;
        }
    }
public class Assignment211 {
    public static void main(String[] args) {

        System.out.println("X     Y     Sum");
        System.out.println("----------------");

        Task11 t1 = new Task11();
        t1.methodA();
        t1.methodA();
    }
}
