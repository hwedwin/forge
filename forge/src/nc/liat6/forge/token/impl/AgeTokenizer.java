package nc.liat6.forge.token.impl;

import nc.liat6.forge.token.AbstractTokenizer;
import nc.liat6.forge.token.TokenType;
import nc.liat6.forge.token.TokenizerChain;

public class AgeTokenizer extends AbstractTokenizer{
  public AgeTokenizer(TokenizerChain chain){
    super(new String[]{"年龄","年纪"},TokenType.age,chain);
  }

}