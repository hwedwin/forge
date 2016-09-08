package nc.liat6.forge.token.impl;

import nc.liat6.forge.token.AbstractTokenizer;
import nc.liat6.forge.token.TokenType;
import nc.liat6.forge.token.TokenizerChain;

/**
 * 民族
 * @author 6tail
 *
 */
public class RaceTokenizer extends AbstractTokenizer{
  public RaceTokenizer(TokenizerChain chain){
    super(new String[]{"民族"},TokenType.race,chain);
  }

}