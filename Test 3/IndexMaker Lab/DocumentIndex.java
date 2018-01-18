import java.util.*;

public class DocumentIndex extends ArrayList<IndexEntry> {
    public DocumentIndex() {
        super();
    }
    
    public DocumentIndex(int capacity) {
        super(capacity);
    }
    
    public void addWord(String word, int num) {
        boolean contains = false;
        if (this.size() == 0) {
            IndexEntry indexEntry = new IndexEntry(word);
            indexEntry.add(num);
            add(indexEntry);
        } else {
            int index = -1;
            int sizeSaved = this.size();
            for (int i = 0; i < sizeSaved; i++) {
                if (word.toUpperCase().equals(this.get(i).getWord())) index = i;
            }
            if (index == -1) {
                for (int i = 0; i < sizeSaved; i++) {
                    if (word.toUpperCase().compareTo(this.get(i).getWord()) < 0) {
                        index = i;
                        break;
                    }
                }
                IndexEntry indexEntry = new IndexEntry(word);
                indexEntry.add(num);
                if (index == -1) {
                    add(indexEntry);
                } else {
                    add(index, indexEntry);
                }
            } else {
                this.get(index).add(num);
            }
        }
    }
    
    public void addAllWords(String str, int num) {
        for (String word : str.split("\\W+")) {
            if (!word.equals("")) this.addWord(word, num);
        }
    }
}