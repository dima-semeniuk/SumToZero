

public class Sum {
    public int[] sumZero(int n) {

        int[] arr = new int[n];
        int index = 0;
        int num = n / 2;

        while (index < n / 2) {
            arr[index++] = num * (-1);
            if (num > 1) {
                num--;
            }
        }

        if (n % 2 != 0) {
            arr[index++] = 0;
        }


        while (index < n) {
            arr[index++] = num;
            num++;
        }

        return arr;
    }
}
