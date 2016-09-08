package nc.liat6.forge.builder;

import java.util.HashMap;
import java.util.Map;
import nc.liat6.forge.token.TokenType;

public class BuilderContext{
  private Map<TokenType,String> values = new HashMap<TokenType,String>();
  
  public void setValue(TokenType type,String value){
    values.put(type,value);
  }
  
  public String getValue(TokenType type){
    return values.get(type);
  }
}