package FirstClass;

public class strStr {

    public int strStr(String source, String target) {
        // Write your code here
        // uppercase and lowercase?
        //
        int match = -1;

        if (source == null || target == null){
            return -1;
        }

        for (int i = 0; i < source.length(); i++){

            if (target.length() > (source.length() - i) ){
                break;
            }

            match = matchTarget(source.substring(i), target);

            if (match == 1){
                match = i;
                break;
            }

        }

        return match;
    }

    public int matchTarget(String source, String target){

        for (int i = 0; i < target.length(); i++){

            if (source.charAt(i) != target.charAt(i)) {
                return -1;
            }
        }

        return 1;
    }

}

