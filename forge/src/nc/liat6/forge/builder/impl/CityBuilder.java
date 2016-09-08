package nc.liat6.forge.builder.impl;

import nc.liat6.forge.Statics;
import nc.liat6.forge.builder.AbstractForgeBuilder;
import nc.liat6.forge.builder.BuilderContext;
import nc.liat6.forge.token.TokenType;

/**
 * 行政区划-市
 * @author 6tail
 *
 */
public class CityBuilder extends AbstractForgeBuilder{
  
  public CityBuilder(BuilderContext context){
    super(TokenType.city,context);
  }
  public String build(){
    String[] ps = Statics.ADDRESS.split("#",-1);
    int len = ps.length;
    String p = context.getValue(TokenType.province);
    int pIndex = random(0,len-1);
    if(null!=p){
      for(int i=0;i<len;i++){
        if(ps[i].startsWith(p)){
          pIndex = i;
          break;
        }
      }
    }
    p = ps[pIndex];
    ps = p.split("\\$");
    String c = "";
    if(ps.length>1){
      p = ps[1];
      String[] cs = p.split("\\|",-1);
      c = cs[random(0,cs.length-1)];
      c = c.split(";")[0];
    }
    return c;
  }
}