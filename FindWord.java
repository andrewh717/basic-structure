public class FindWord 
{
    public static void main(String[] args) 
    {
        String sentence = new String("Coding is fun.");
        int endWord = sentence.indexOf(" ");
        System.out.println(sentence.substring(0, endWord));
        
    }
}
