package java_assignment;

public class CheckPangram {

    static boolean checkCharacter(char ch){
        int ascii = (int)ch;
        if(ascii < 65 || ascii > 90){
            return false;
        }
        return true;
    }

    public static boolean pangramCheck(String str){

        String upperCaseString = str.toUpperCase();

        if(str.length() < 26) return false;

        boolean[] isPresent = new boolean[26];
        for(int i=0; i<upperCaseString.length(); i++){
            if(checkCharacter(upperCaseString.charAt(i))){
                int alphabet = upperCaseString.charAt(i) - 'A';
                isPresent[alphabet] = true;
            }
        }
        for(int i=0; i<26; i++){
            if(!isPresent[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        if(pangramCheck(str)){
            System.out.println("The string is Pangram.");
        } else{
            System.out.println("The string is not Pangram.");
        }
    }
}
