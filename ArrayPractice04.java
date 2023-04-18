import java.util.Random;
public class ArrayPractice04 {
    public static void main(String[] args) {
        int sum =0;
        var nums = new int[10];
        Random rand = new Random();


        for (var i=0; i<10; i++){
            nums[i] =rand.nextInt(100);
        }

        for(var i = 0; i < 9; i++){
            for(var j = 9; j > i ; j--){
                if(nums[j]< nums[j-1]){
                    var a =0;
                    a = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = a;
                }

            }
        }

        for(var i=0; i<9; i++) {
            System.out.println(nums[i]);
        }

    }
}
