package nc.liat6.forge.builder;

import nc.liat6.forge.token.TokenType;

public interface IForgeBuilder{
  TokenType getType();
  String build();
}