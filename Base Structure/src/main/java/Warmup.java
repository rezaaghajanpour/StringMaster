public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String[] words = sentence.split(" ");
        if(number>words.length)
        {
        return " Number = " + number + " is out Of Bound";
        } 
        else
        return words[number-1];
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        char[] ch = number.toCharArray();
        int i=0 , p=0 , q=0;
        while(i<ch.length)
        {
            if(ch[i]%2==0)
            p++;
            else
            q++;
            i++;
        }
        if(searchForEven==true)
        return p;
        else
        return q;
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        char[] ch1 = wordA.toCharArray();
        char[] ch2 = wordB.toCharArray();
        String a=wordA , b=wordB;
        int f, j = 0;
        int f1=wordA.length();
        int f2=wordB.length();
        if (wordA.length() < wordB.length())
            f = wordA.length();
        else
            f = wordB.length();
        while (j < f) {
            if (ch1[j] > ch2[j]) {
                return b;
            }
            else if (ch2[j] > ch1[j]) {
                return a;
            }
            j++;
        }
        if (j == f)
        {
            if(f1==f2)
            return a;
            else if(f1>f2)
            return b;
            else if (f1<f2)
            return a;
        }
        return b;
    }
}
