package nc.liat6.forge.builder.impl;

import nc.liat6.forge.Statics;
import nc.liat6.forge.builder.AbstractForgeBuilder;
import nc.liat6.forge.builder.BuilderContext;
import nc.liat6.forge.token.TokenType;

public class NameBuilder extends AbstractForgeBuilder{
  
  public NameBuilder(BuilderContext context){
    super(TokenType.name,context);
  }
  public String build(){
    int index = random(0,Statics.LAST_NAME.length()-1);
    String first = Statics.LAST_NAME.substring(index,index+1);
    String gender = context.getValue(TokenType.gender);
    int sex = random(0,1);
    if("女".equals(gender)){
      sex = 0;
    }else if("男".equals(gender)){
      sex = 1;
    }
    String str = Statics.FIRST_NAME_OF_BOY;
    if(sex==0){
      str = Statics.FIRST_NAME_OF_GIRL;
    }
    int length = str.length();
    index = random(0,length-1);
    String second = str.substring(index,index+1);
    int hasThird = random(0,1);
    String third = "";
    if(hasThird==1){
      index = random(0,length-1);
      third = str.substring(index,index+1);
    }
    return first+second+third;
  }
}