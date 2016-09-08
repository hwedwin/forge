package nc.liat6.forge.token.impl;

import nc.liat6.forge.token.AbstractTokenizer;
import nc.liat6.forge.token.TokenType;
import nc.liat6.forge.token.TokenizerChain;

/**
 * 行政区划-区、县、地级市
 * 
 * @author 6tail
 *
 */
public class AreaTokenizer extends AbstractTokenizer{
  public AreaTokenizer(TokenizerChain chain){
    super(new String[]{"区"},TokenType.area,chain);
  }
}