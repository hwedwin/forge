package nc.liat6.forge.token;




/**
 * 解析器接口
 * @author 6tail
 *
 */
public interface ITokenizer{
  void parse(TokenRequest req,TokenizerChain chain);
  TokenType getType();
  boolean fit(String keyword);
}