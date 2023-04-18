public class ArrayPractice03 {
    public static void main(String[] args) {
        int sum =0;
        var nums = new int[9];


        for (var i=0; i<9; i++){
            nums[i] =i+1;
        }

        for(var i = 0; i < nums.length; i++){
            for(var j = 0; j < 9; j++){
                var kuku = nums[i]*nums[j];
                System.out.println(i+ "×" + j + "=" + kuku);

            }
        }

        double ave = sum/10;
        System.out.println("合計値は"+sum+"です。");
        System.out.println("平均値は"+ave+"です。");

    }
}
