package nc.liat6.forge.builder;

import nc.liat6.forge.token.TokenType;

public abstract class AbstractForgeBuilder implements IForgeBuilder{
  protected TokenType type;
  protected BuilderContext context;
  
  protected AbstractForgeBuilder(TokenType type,BuilderContext context){
    this.type = type;
    this.context = context;
  }

  public TokenType getType(){
    return type;
  }

  public void setType(TokenType type){
    this.type = type;
  }
  
  protected int random(int start,int end){
    return (int)(Math.random()*(end-start+1)+start);
  }
}