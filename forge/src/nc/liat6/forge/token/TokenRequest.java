package nc.liat6.forge.token;

import java.util.ArrayList;
import java.util.List;

public class TokenRequest{
  private List<Token> tokens = new ArrayList<Token>();

  public List<Token> getTokens(){
    return tokens;
  }

  public void setTokens(List<Token> tokens){
    this.tokens = tokens;
  }
  
  public void addToken(Token token){
    tokens.add(token);
  }
}