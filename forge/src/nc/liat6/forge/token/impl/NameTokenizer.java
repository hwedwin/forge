package nc.liat6.forge.token.impl;

import nc.liat6.forge.token.AbstractTokenizer;
import nc.liat6.forge.token.TokenType;
import nc.liat6.forge.token.TokenizerChain;

public class NameTokenizer extends AbstractTokenizer{
  public NameTokenizer(TokenizerChain chain){
    super(new String[]{"姓名"},TokenType.name,chain);
  }

}