package nc.liat6.forge.token.impl;

import nc.liat6.forge.token.AbstractTokenizer;
import nc.liat6.forge.token.TokenType;
import nc.liat6.forge.token.TokenizerChain;

/**
 * 行政区划-乡、镇
 * 
 * @author 6tail
 *
 */
public class TownTokenizer extends AbstractTokenizer{
  public TownTokenizer(TokenizerChain chain){
    super(new String[]{"乡镇","乡","镇"},TokenType.town,chain);
  }
}