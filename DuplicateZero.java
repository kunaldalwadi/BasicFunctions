import java.util.Arrays;

public class DuplicateZero {

    public static void main(String[] args) {

        int i,j;
        int[] arr = new int[]{1,0,0,0,9,5,6,4,5};
        System.out.println(Arrays.toString(arr));

//expected output is = {1,2,0,0,3,4,0,0}

        for (i=0; i<arr.length; i++)
        {
            if (arr[i] == 0)
            {
                // shift everything else to the right one step
                // dont worry about overwriting anything.
                System.out.println("value of i = " + i);
                for (j=arr.length-2; j>i; j--)
                {
                    arr[j+1] = arr[j];
                }
                System.out.println("value of j = " + j);
                arr[j+1] = 0;
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
