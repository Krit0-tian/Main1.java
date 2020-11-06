import java.util.Scanner;
public class Main extends TheWayTOCalculate {
    public static void main(String[] args) {
        TheWayTOCalculate a = new TheWayTOCalculate();
        char[] chs = new char[100];
        System.out.println("请输入数字x=");
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        System.out.println("请输入运算符：");
        String b = input.next();
        System.out.println("请输入数字y=");
        int c = input.nextInt();
        chs[0]=b.charAt(0);
        a.calculate(d,chs[0],c);
    }
}
