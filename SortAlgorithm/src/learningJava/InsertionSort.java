package learningJava;

public class InsertionSort {

    public void insertionSort(int[] A) {
        int n = A.length;
        for(int i = 1; i < n; i++){
            int t = A[i];
            int index = 0;
            for (int j = i - 1; j >= 0; j--){
                if (A[j] > t){
                    A[j + 1] = A[j];
                } else {
                    index = j + 1;
                    break;
                }
            }
            A[index] = t;
        }
    }
/** Python Version **/
//    def insertionSort(A):
//    n = len(A)
//    for i in range(1, n):
//    t = A[i]
//    index = 0
//    j = i - 1
//            while j >= 0:
//            if A[j] > t:
//    A[j + 1] = A[j]
//            else:
//    index = j + 1
//            break
//    j -= 1
//    A[index] = t
//    return A

/** C++ Version **/
//void insertionSort(vector<int> A) {
//    int n = A.size();
//    for(int i = 1; i < n; i++){
//        int t = A[i];
//        int index = 0;
//        for (int j = i - 1; j >= 0; j--){
//            if (A[j] > t){
//                A[j + 1] = A[j];
//            } else {
//                index = j + 1;
//                break;
//            }
//        }
//        A[index] = t;
//    }
//}
}
