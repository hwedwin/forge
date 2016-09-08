package nc.liat6.forge.token.impl;

import nc.liat6.forge.token.AbstractTokenizer;
import nc.liat6.forge.token.TokenType;
import nc.liat6.forge.token.TokenizerChain;

/**
 * 出生日期
 * @author 6tail
 *
 */
public class BirthdayTokenizer extends AbstractTokenizer{
  public BirthdayTokenizer(TokenizerChain chain){
    super(new String[]{"出生日期","生日"},TokenType.birthday,chain);
  }

}