package nc.liat6.forge.token;

import java.util.ArrayList;
import java.util.List;

public class Token{
  private String content;
  private TokenType type;
  private List<Token> children = new ArrayList<Token>();

  public String getContent(){
    return content;
  }

  public void setContent(String content){
    this.content = content;
  }

  public TokenType getType(){
    return type;
  }

  public void setType(TokenType type){
    this.type = type;
  }
  
  public List<Token> getChildren(){
    return children;
  }

  public void setChildren(List<Token> children){
    this.children = children;
  }
  
  public void addChild(Token childToken){
    children.add(childToken);
  }

  public String toString(){
    return type+":"+content;
  }
}