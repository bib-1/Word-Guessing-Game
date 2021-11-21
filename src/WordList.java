/**Application Purpose: To create a class object to store the words to display as a question
 * Author: Bibek Poudel
 * Date: 12 April 2021
 * Time: 11:30 am
 */

//this class contains words as well as methods to pass words to other classes
public class WordList {

    //single dimension array containing list of words to display as a question to players
    private String []questionWords = {"PET","RED", "GOD", "RAM", "CUT",
                                    "BANG", "FlAG", "BODY", "GAME", "MODE",
                                     "RANDOM", "OBJECT", "LINKED", "IMPORT", "BEFORE"};

    //this method returns list of words depending on the length ordered
    public String[] giveQuestionWords(int length)
    {
        //the single dimension array word list contains 5 words
        String []wordList = new String[5];
        //this stores the  index where the words should be stored
        int indexOfWordList = 0;

        //this loop search the appropriate words in the array and stores it return list
        for(int i = 0; i < questionWords.length; i++)
        {
            //checks of the required length is matched
            if(questionWords[i].length() == length)
            {
                //stores words if matched
                wordList[indexOfWordList] = questionWords[i];
                //increases the index to store next word
                indexOfWordList++;
            }
        }
        //returns word list
        return wordList;
    }
}
