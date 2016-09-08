package nc.liat6.forge.token;

import java.util.ArrayList;
import java.util.List;

public class TokenizerChain{
  protected List<ITokenizer> tokenizers = new ArrayList<ITokenizer>();
  protected int index = 0;

  public void doTokenizer(TokenRequest req){
    if(index>=tokenizers.size()) return;
    tokenizers.get(index++).parse(req,this);
  }

  public void addTokenizer(ITokenizer tokenizer){
    tokenizers.add(tokenizer);
  }
}