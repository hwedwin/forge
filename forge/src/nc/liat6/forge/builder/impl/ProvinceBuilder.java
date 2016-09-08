package nc.liat6.forge.builder.impl;

import nc.liat6.forge.Statics;
import nc.liat6.forge.builder.AbstractForgeBuilder;
import nc.liat6.forge.builder.BuilderContext;
import nc.liat6.forge.token.TokenType;

/**
 * 行政区划-省、直辖市
 * @author 6tail
 *
 */
public class ProvinceBuilder extends AbstractForgeBuilder{
  
  public ProvinceBuilder(BuilderContext context){
    super(TokenType.province,context);
  }
  public String build(){
    String[] ps = Statics.ADDRESS.split("#",-1);
    String p = ps[random(0,ps.length-1)];
    return p.split("\\$",-1)[0];
  }
}