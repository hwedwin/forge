package nc.liat6.forge.builder.impl;

import nc.liat6.forge.builder.AbstractForgeBuilder;
import nc.liat6.forge.builder.BuilderContext;
import nc.liat6.forge.token.TokenType;

/**
 * 行政区划-区、县、地级市
 * @author 6tail
 *
 */
public class AreaBuilder extends AbstractForgeBuilder{
  
  public AreaBuilder(BuilderContext context){
    super(TokenType.area,context);
  }
  public String build(){
    return "";
  }
}