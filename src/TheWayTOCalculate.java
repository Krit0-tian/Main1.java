import java.util.Scanner;

public class TheWayTOCalculate implements Calculate{
    @Override
    public double calculate(double x, char operate, double y)
    {
        switch (operate){
            case '+':{
                System.out.println(x+"+"+y+"="+(x+y));}
                break;
            case '-':{
                System.out.println(x+"-"+y+"="+(x-y));}
                break;
            case '*':{
                System.out.println(x+"*"+y+"="+(x*y));
            break;}
            case '/':{
                System.out.println(x+"/"+y+"="+(x/y));
            break;}
        }
        return 0;
    };
}
