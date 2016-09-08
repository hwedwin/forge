package nc.liat6.forge.token.impl;

import nc.liat6.forge.token.AbstractTokenizer;
import nc.liat6.forge.token.TokenType;
import nc.liat6.forge.token.TokenizerChain;

/**
 * 行政区划-市
 * 
 * @author 6tail
 *
 */
public class CityTokenizer extends AbstractTokenizer{
  public CityTokenizer(TokenizerChain chain){
    super(new String[]{"市"},TokenType.city,chain);
  }
}