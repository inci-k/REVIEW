package MARCH08;

public class D10VowelCountingIf {
    public static void main(String[] args) {
        String sentence = "We are in love with Java";
        int counter=0;
        for (int i=0;  i<sentence.length();  i++){
            if(sentence.charAt(i)=='a'  ||
               sentence.charAt(i)=='e'  ||
               sentence.charAt(i)=='i'  ||
               sentence.charAt(i)=='o'  ||
               sentence.charAt(i)=='u'  ){
                counter++;
            }
        }
        System.out.println("Total : " + counter+ " vowels");
    }
}
