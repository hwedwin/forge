package nc.liat6.forge.builder.impl;

import nc.liat6.forge.Statics;
import nc.liat6.forge.builder.AbstractForgeBuilder;
import nc.liat6.forge.builder.BuilderContext;
import nc.liat6.forge.token.TokenType;

public class GenderBuilder extends AbstractForgeBuilder{
  public GenderBuilder(BuilderContext context){
    super(TokenType.gender,context);
  }

  public String build(){
    int sex = random(0,1);
    String name = context.getValue(TokenType.name);
    if(null!=name){
      String firstName = name.substring(1);
      if(Statics.FIRST_NAME_OF_BOY.contains(firstName)){
        sex = 1;
      }else{
        sex = 0;
      }
    }
    return 0==sex?"女":"男";
  }
}