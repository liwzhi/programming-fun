package divide_conquer;

/**
 * Created by weizhi on 2/1/17.
 */
public class main_test {

    public static void main(String [] args)
    {
        maximum_sub_array max_array = new maximum_sub_array();
        int[] nums = {1,2,3,-4,5};
        int result = max_array.maxSubArray(nums);

        System.out.println(result);

        int[] nums_2 = {2,1};


        jump_index_2 jump_2 = new jump_index_2();
        System.out.println(jump_2.jump(nums_2));



    }


}
