package nc.liat6.forge.token.impl;

import nc.liat6.forge.token.AbstractTokenizer;
import nc.liat6.forge.token.TokenType;
import nc.liat6.forge.token.TokenizerChain;

public class MobileTokenizer extends AbstractTokenizer{
  public MobileTokenizer(TokenizerChain chain){
    super(new String[]{"手机号码","手机号","手机"},TokenType.mobile,chain);
  }

}