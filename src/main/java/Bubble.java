import java.util.Arrays;

/**
 * 冒泡排序
 */

public class Bubble {

    /**
     * 整数数组冒泡排序
     * @param array
     * @return
     */
    public int[] rankInt(int[] array){
        int len = array.length;
        while (len > 1) {
            len--;
            for (int i = 0; i < len; i++) {
                //从第一位开始，依次对比相邻两位的大小，大就交换位置，小就不变
                if (array[i] > array[i + 1]) {
                    int one = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = one;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5,8,9,1,4,6,3,7,2,10};
        Bubble bubble = new Bubble();
        System.out.println(Arrays.toString(bubble.rankInt(array)));
    }

}
