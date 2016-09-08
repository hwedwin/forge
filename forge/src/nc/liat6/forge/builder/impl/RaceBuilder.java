package nc.liat6.forge.builder.impl;

import nc.liat6.forge.Statics;
import nc.liat6.forge.builder.AbstractForgeBuilder;
import nc.liat6.forge.builder.BuilderContext;
import nc.liat6.forge.token.TokenType;

public class RaceBuilder extends AbstractForgeBuilder{
  
  public RaceBuilder(BuilderContext context){
    super(TokenType.race,context);
  }
  public String build(){
    return Statics.RACE[random(0,Statics.RACE.length-1)];
  }
}