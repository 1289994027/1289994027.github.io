import java.util.Scanner;
public class BreakExercise{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int chance = 3;
        for(int i = 1;i <= 3;i++){
            System.out.println("请输入用户名");
            String user = myScanner.next();
            System.out.println("请输入密码");
            int password = myScanner.nextInt();
            if("丁真".equals(user) && password == 666){
                System.out.println("登陆成功1");
                break;
            }
            chance--;
            System.out.println("用户名或密码输入错误，你还有" + chance + "次机会");
        }
    }
}
