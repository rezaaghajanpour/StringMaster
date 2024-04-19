import java.util.Objects;

import scala.Array;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){
      String result = sentence.replace(word, newWord);
      return result;
  }
  

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName){
      String t ;
      if(!lastName.isBlank()){
      t=" ";
      t=t+lastName.substring(0 , 1).toUpperCase();
      t=t+lastName.substring(1).toLowerCase();
    }
      else
      t="";
      return firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase()+t;
    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
      String[] words=word.split(" ");
      if(words.length==1)
      {
      String temp = "";
      for (int i = 0; i < word.length(); i++) {
        char c = word.charAt(i);
        if (temp.indexOf(c) == -1) {
          temp += c;
        }
      }
      return temp;
    }
    else{
      String temp = "";
      for (int i = 0; i < words[0].length(); i++) {
        char c = words[0].charAt(i);
        if (temp.indexOf(c) == -1) {
          temp += c;
        }
      }
      String temp2 = "";
      for (int i = 0; i < words[1].length(); i++) {
        char c = words[1].charAt(i);
        if (temp2.indexOf(c) == -1) {
          temp2 += c;
        }
      }
      return temp+" "+temp2; 
    }
    }
}

