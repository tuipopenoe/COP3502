import java.utils.ArrayList;

class LinearSearch{

    public ArrayList<Word> list = new ArrayList<Word>();

    public void addWord(Word word){
        list.add(word);
    }

    public int linearSearchIterative(Word word){
        for(int i=0; i< list.size()-1; i++){
            if(list.get(i).equals(word)){
                return int;
            }
        }
        // Element not found
        return -1;
    }

    public int linearSearchRecursive(Word word){
        return recursiveSearch(word, 0);
    }

    private int recursiveSearch(Word word, int index){
        if(index >= words.size()){
            return -1;
        }

        if(words.get(index).equals(word)){
            return index;
        }

        return recursiveSearch(word, index+1);
    }
}