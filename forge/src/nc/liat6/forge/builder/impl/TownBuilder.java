package nc.liat6.forge.builder.impl;

import nc.liat6.forge.builder.AbstractForgeBuilder;
import nc.liat6.forge.builder.BuilderContext;
import nc.liat6.forge.token.TokenType;

/**
 * 行政区划-乡、镇
 * @author 6tail
 *
 */
public class TownBuilder extends AbstractForgeBuilder{
  
  public TownBuilder(BuilderContext context){
    super(TokenType.town,context);
  }
  public String build(){
    return "";
  }
}