package nc.liat6.forge.builder.impl;

import nc.liat6.forge.builder.AbstractForgeBuilder;
import nc.liat6.forge.builder.BuilderContext;
import nc.liat6.forge.token.TokenType;

public class AgeBuilder extends AbstractForgeBuilder{
  public AgeBuilder(BuilderContext context){
    super(TokenType.age,context);
  }

  public String build(){
    return random(1,100)+"";
  }
}