
import java.util.*;

public class CopyAnArray {
    public static int[] nearby(int x, int y, int range){
        int m;
        int n;
        int[][] multi = new int[][]{
                { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
                { 1, 3, 5, 7 },
                { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
        };
        if (y+range+1>multi[x].length){
            n = multi[x].length;
        }else{
            n = y+range+1;
        }
        int[] positive = Arrays.copyOfRange(multi[x], y+1, n);
        if (y-range<0){
            m = 0;
        }else {
            m = y-range;
        }

        int[] negative = Arrays.copyOfRange(multi[x], m, y);
        int[] both = Arrays.copyOf(negative, positive.length + negative.length);
        System.arraycopy(positive, 0, both, negative.length, positive.length);
        return both;

    }
}
