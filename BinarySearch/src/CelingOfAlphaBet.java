public class CelingOfAlphaBet {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'}; 
        char target = 'c';
        System.out.println(CelingofChar(arr, target));
    }
    static char CelingofChar(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
//        if (target > letters[letters.length - 1]){
//            return 'o';
//        }
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < letters[mid]){
                end = mid - 1;
            }
           else {
               start = mid + 1;
            }
        }
        return letters[start  % letters.length];
        // this will return the first index if no element is found in the array .

    }
}
