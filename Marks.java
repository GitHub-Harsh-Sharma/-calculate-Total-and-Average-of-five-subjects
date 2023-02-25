import java.util.*;

class Marks {
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Hindi marks:");
        int hindi = sc.nextInt();
        System.out.print("Enter the English marks:");
        int english = sc.nextInt();
        System.out.print("Enter the Maths marks:");
        int maths = sc.nextInt();
        System.out.print("Enter the SST marks:");
        int sst = sc.nextInt();
        System.out.print("Enter the SC marks:");
        int sf = sc.nextInt();
        sum(hindi, english, maths, sst, sf);
    }

    public void sum(int hindi, int english, int maths, int sst, int sf) {
        int total = hindi + english + maths + sst + sf;
        int avg = total / 5;
        print(total, avg);
    }

    public void print(int total, int avg) {
        System.out.println("Total marks=" + total);
        System.out.println("Average marks=" + avg);
    }

    public static void main(String[] args) {
        Marks m = new Marks();
        m.input();
    }
}
