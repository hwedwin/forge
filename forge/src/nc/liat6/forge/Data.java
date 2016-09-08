package nc.liat6.forge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.liat6.forge.builder.BuilderContext;
import nc.liat6.forge.builder.IForgeBuilder;
import nc.liat6.forge.builder.impl.AgeBuilder;
import nc.liat6.forge.builder.impl.AreaBuilder;
import nc.liat6.forge.builder.impl.BirthdayBuilder;
import nc.liat6.forge.builder.impl.CityBuilder;
import nc.liat6.forge.builder.impl.GenderBuilder;
import nc.liat6.forge.builder.impl.MobileBuilder;
import nc.liat6.forge.builder.impl.NameBuilder;
import nc.liat6.forge.builder.impl.ProvinceBuilder;
import nc.liat6.forge.builder.impl.RaceBuilder;
import nc.liat6.forge.builder.impl.TownBuilder;
import nc.liat6.forge.token.ITokenizer;
import nc.liat6.forge.token.Token;
import nc.liat6.forge.token.TokenRequest;
import nc.liat6.forge.token.TokenType;
import nc.liat6.forge.token.TokenizerChain;
import nc.liat6.forge.token.impl.AgeTokenizer;
import nc.liat6.forge.token.impl.AreaTokenizer;
import nc.liat6.forge.token.impl.BirthdayTokenizer;
import nc.liat6.forge.token.impl.CityTokenizer;
import nc.liat6.forge.token.impl.GenderTokenizer;
import nc.liat6.forge.token.impl.MobileTokenizer;
import nc.liat6.forge.token.impl.NameTokenizer;
import nc.liat6.forge.token.impl.ProvinceTokenizer;
import nc.liat6.forge.token.impl.RaceTokenizer;
import nc.liat6.forge.token.impl.TownTokenizer;

/**
 * 数据生成器
 * 
 * @author 6tail
 *
 */
public class Data{
  protected Data(){}

  /**
   * 创建解析器们
   * 
   * @param chain 解析器链
   * @return 解析器们
   */
  protected static List<ITokenizer> getTokenizers(TokenizerChain chain){
    List<ITokenizer> tokenizers = new ArrayList<ITokenizer>();
    tokenizers.add(new GenderTokenizer(chain));
    tokenizers.add(new RaceTokenizer(chain));
    tokenizers.add(new MobileTokenizer(chain));
    tokenizers.add(new AgeTokenizer(chain));
    tokenizers.add(new BirthdayTokenizer(chain));
    tokenizers.add(new ProvinceTokenizer(chain));
    tokenizers.add(new CityTokenizer(chain));
    tokenizers.add(new AreaTokenizer(chain));
    tokenizers.add(new TownTokenizer(chain));
    tokenizers.add(new NameTokenizer(chain));
    return tokenizers;
  }

  /**
   * 创建数据构建器们
   * 
   * @param context 构建上下文
   * @return 数据构建器们
   */
  protected static Map<TokenType,IForgeBuilder> getBuilders(BuilderContext context){
    Map<TokenType,IForgeBuilder> map = new HashMap<TokenType,IForgeBuilder>();
    List<IForgeBuilder> builders = new ArrayList<IForgeBuilder>();
    builders.add(new GenderBuilder(context));
    builders.add(new RaceBuilder(context));
    builders.add(new MobileBuilder(context));
    builders.add(new AgeBuilder(context));
    builders.add(new BirthdayBuilder(context));
    builders.add(new ProvinceBuilder(context));
    builders.add(new CityBuilder(context));
    builders.add(new AreaBuilder(context));
    builders.add(new TownBuilder(context));
    builders.add(new NameBuilder(context));
    for(IForgeBuilder builder:builders){
      map.put(builder.getType(),builder);
    }
    return map;
  }

  /**
   * 生成默认数据
   * 
   * @param format 数据格式，示例：姓名,年龄
   * @return 数据内容，示例：张三,20
   */
  public static String next(String format){
    return next(format,null);
  }

  /**
   * 按指定条件生成数据
   * 
   * @param format 数据格式，示例：姓名,年龄
   * @param defaults 默认值，示例：年龄=18
   * @return 数据内容，示例：张三,18
   */
  public static String next(String format,String[] defaults){
    TokenizerChain chain = new TokenizerChain();
    List<ITokenizer> tokenizers = getTokenizers(chain);
    BuilderContext context = new BuilderContext();
    for(ITokenizer tokenizer:tokenizers){
      chain.addTokenizer(tokenizer);
      if(null!=defaults){
        for(String kv:defaults){
          String k = kv.substring(0,kv.indexOf("="));
          String v = kv.substring(kv.indexOf("=")+1);
          if(tokenizer.fit(k)){
            context.setValue(tokenizer.getType(),v);
          }
        }
      }
    }
    Token token = new Token();
    token.setContent(format);
    token.setType(TokenType.unknow);
    TokenRequest request = new TokenRequest();
    request.addToken(token);
    chain.doTokenizer(request);
    Map<TokenType,IForgeBuilder> builders = getBuilders(context);
    StringBuilder s = new StringBuilder();
    for(Token t:request.getTokens()){
      TokenType type = t.getType();
      String value = null;
      switch(type){
        case unknow:
          value = t.getContent();
          break;
        default:
          value = context.getValue(type);
          if(null==value){
            IForgeBuilder builder = builders.get(type);
            if(null!=builder){
              value = builder.build();
              context.setValue(type,value);
            }
          }
      }
      s.append(null==value?"":value);
    }
    return s.toString();
  }
}