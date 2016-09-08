package nc.liat6.forge.builder.impl;

import nc.liat6.forge.Statics;
import nc.liat6.forge.builder.AbstractForgeBuilder;
import nc.liat6.forge.builder.BuilderContext;
import nc.liat6.forge.token.TokenType;

public class MobileBuilder extends AbstractForgeBuilder{
  
  public MobileBuilder(BuilderContext context){
    super(TokenType.mobile,context);
  }
  public String build(){
    int index = random(0,Statics.MOBILE_PREFIX.length-1);
    String first = Statics.MOBILE_PREFIX[index];
    String second = String.valueOf(random(1,888)+10000).substring(1);
    String third = String.valueOf(random(1,9100)+10000).substring(1);
    return first+second+third;
  }
}