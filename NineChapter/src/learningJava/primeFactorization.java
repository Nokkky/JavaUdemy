package learningJava;

import java.util.ArrayList;
import java.util.List;

public class primeFactorization {

    public List<Integer> primeFactorization(int n) {
        List<Integer> result = new ArrayList<>();
        int up = (int) Math.sqrt(n);

        for (int k = 2; k <= up && n > 1; ++k) {
            while (n % k == 0) {
                n /= k;
                result.add(k);
            }
        }

        if (n > 1) {
            result.add(n);
        }

        return result;
    }

    /** Python **/
//    def primeFactorization(n):
//    result = []
//    up = int(math.sqrt(n));
//
//    k = 2
//            while k <= up and n > 1:
//            while n % k == 0:
//    n //= k
//            result.append(k)
//    k += 1
//
//            if n > 1:
//            result.append(n)
//
//            return result

    /** C++ **/
//    vector<int> primeFactorization(int n) {
//        vector<int> result;
//        int up = (int)sqrt(n);
//
//        for (int k = 2; k <= up && n > 1; ++k) {
//            while (n % k == 0) {
//                n /= k;
//                result.push_back(k);
//            }
//        }
//
//        if (n > 1) {
//            result.push_back(n);
//        }
//
//        return result;
//    }
}
