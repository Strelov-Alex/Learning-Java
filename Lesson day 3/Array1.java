public class Array1 {
    public static void main(String[] args) {
        int [] nums = new int[100];
        for (int i = 0; i < nums.length; i++ ){
            nums[i] = i * 10;
        }
        for (int i = 0; i < nums.length; i++ ){
            System.out.println(nums[i]);
        }

    }
}
