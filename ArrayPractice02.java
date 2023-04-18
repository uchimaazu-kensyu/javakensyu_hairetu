import java.util.Scanner;
public class ArrayPractice02 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        var input = sc.nextInt();
        var nums = new int[input];
        int sum =0;

        for (var i=0; i<nums.length; i++){
            var factor = sc.nextInt();
            nums[i] =factor;
        }

        for(var i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        double ave = sum/nums.length;
        System.out.println("合計値は"+sum+"です。");
        System.out.println("平均値は"+ave+"です。");

    }
}
