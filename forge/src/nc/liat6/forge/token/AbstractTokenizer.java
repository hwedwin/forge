package nc.liat6.forge.token;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTokenizer implements ITokenizer{
  protected String spliter = "~~~";
  protected String[] keywords = new String[]{};
  protected TokenType type;
  protected TokenizerChain chain;

  protected AbstractTokenizer(String[] keywords,TokenType type,TokenizerChain chain){
    this.keywords = keywords;
    this.type = type;
    this.chain = chain;
  }

  public TokenType getType(){
    return type;
  }

  public boolean fit(String keyword){
    for(String k:keywords){
      if(k.equals(keyword)){
        return true;
      }
    }
    return false;
  }

  protected void parseToken(Token token){
    if(TokenType.unknow!=token.getType()) return;
    String str = token.getContent();
    List<String> keywords = new ArrayList<String>();
    for(String keyword:this.keywords){
      keywords.add(keyword);
    }
    String rs = str;
    for(String keyword:keywords){
      rs = rs.replace(keyword,spliter+type+spliter);
    }
    String[] ss = rs.split(spliter,-1);
    for(int i = 0,j = ss.length;i<j;i++){
      String s = ss[i];
      if(s.length()<1) continue;
      Token t = new Token();
      t.setContent(s);
      if(s.equals(type.toString())){
        t.setType(type);
      }else{
        t.setType(TokenType.unknow);
      }
      token.addChild(t);
    }
  }

  public void parse(TokenRequest req,TokenizerChain chain){
    List<Token> l = new ArrayList<Token>();
    for(Token t:req.getTokens()){
      parseToken(t);
    }
    for(Token t:req.getTokens()){
      if(t.getChildren().size()>0){
        l.addAll(t.getChildren());
      }else{
        l.add(t);
      }
    }
    req.setTokens(l);
    chain.doTokenizer(req);
  }
}