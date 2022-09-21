package lesson12.wx;

public class MainArray {
    public static void main(String[] args) {
        int[] num = new int[] {1,2,3,4,5};
        int result = 0;
        for (int i =num.length -1 , n = 0; i >= 0; --i, n++) {
            int pos = (int)Math.pow(10, i);
            result += num[n] * pos;
        }
        System.out.println(addOneToArray(result));

    }

    public static int addOneToArray(int num){
        num++;
        String s = Integer.toString(num);
        int[] arr = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num /= 10;
        }
        return num;
    }
}
