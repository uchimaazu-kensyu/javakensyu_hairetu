public class ArrayPractice01 {
    public static void main(String[] args) {
        int sum =0;
        var nums = new int[10];


        for (var i=0; i<10; i++){
            nums[i] =i+1;
        }

        for(var i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        double ave = sum/10;
        System.out.println("合計値は"+sum+"です。");
        System.out.println("平均値は"+ave+"です。");

    }
}
