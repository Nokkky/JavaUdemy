package learningJava;


public class WoodCut {
    /**
     * @param L: Given n pieces of wood with length L[i]
     * @param k: An integer
     * @return: The maximum length of the small pieces
     */
    // intitution: search through a possible range, the search range can be decided and then use binary search.
    // maxLength * k <= total length && maxLength < maxLengthInArray.
    // start * k <= totalLength <= end * k, because start * k <= mid * k <= end * k there must exist one mid that mid * k most near //
    // totalLength
    public static void main(String[] args) {
        // write your code here
        int[] array = {232,124,456};
        System.out.println(woodCut(array, 7));
    }

    public static int woodCut(int[] L, int k) {
        // write your code here
        int totalLength = calculateTotalLength(L);
        int start = 1, end = totalLength / k;

        while (end - start >= 2){

            int mid = start + (end - start)/2;

            if (countPieces(L, mid) < k){
                end = mid;
            }
            if (countPieces(L, mid) >= k){
                start = mid;
            } //

        }

        if (countPieces(L, end) >= k){
            return end;
        }
        if (countPieces(L, start) >= k){
            return start;
        }
        return 0;

    }

    public static int countPieces(int[] L, int mid){

        int pieces = 0;
        for (int length : L){
            pieces += length / mid;
        }
        return pieces;
    }

    public static int calculateTotalLength(int[] L){

        int totalLength = 0;
        for (int length : L){
            totalLength += length ;
        }
        return totalLength;
    }
}