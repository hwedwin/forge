package nc.liat6.forge.token.impl;

import nc.liat6.forge.token.AbstractTokenizer;
import nc.liat6.forge.token.TokenType;
import nc.liat6.forge.token.TokenizerChain;

public class GenderTokenizer extends AbstractTokenizer{
  public GenderTokenizer(TokenizerChain chain){
    super(new String[]{"性别"},TokenType.gender,chain);
  }

}