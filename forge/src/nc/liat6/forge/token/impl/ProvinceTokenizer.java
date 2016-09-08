package nc.liat6.forge.token.impl;

import nc.liat6.forge.token.AbstractTokenizer;
import nc.liat6.forge.token.TokenType;
import nc.liat6.forge.token.TokenizerChain;

/**
 * 行政区划-省、直辖市
 * 
 * @author 6tail
 *
 */
public class ProvinceTokenizer extends AbstractTokenizer{
  public ProvinceTokenizer(TokenizerChain chain){
    super(new String[]{"省"},TokenType.province,chain);
  }
}