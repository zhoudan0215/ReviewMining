package ml.topicModel.common.data;

import java.util.List;

public class Sentence {
    List<Integer> tokens;
    
    public void setTokens(List<Integer> tokens){
        this.tokens = tokens;
    }
    
    public List<Integer> getTokens(){
        return tokens;
    }
}