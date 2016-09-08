package nc.liat6.forge.builder.impl;

import java.util.Calendar;
import nc.liat6.forge.builder.AbstractForgeBuilder;
import nc.liat6.forge.builder.BuilderContext;
import nc.liat6.forge.token.TokenType;

public class BirthdayBuilder extends AbstractForgeBuilder{
  
  public BirthdayBuilder(BuilderContext context){
    super(TokenType.birthday,context);
  }
  public String build(){
    int age = random(1,100);
    String ageStr = context.getValue(TokenType.age);
    if(null!=ageStr){
      age = Integer.parseInt(ageStr);
    }
    Calendar c = Calendar.getInstance();
    int currentMonth = c.get(Calendar.MONTH)+1;
    c.add(Calendar.YEAR,-age);
    int year = c.get(Calendar.YEAR);
    int month = random(1,12);
    int day = random(1,31);
    switch(month){
      case 2:
        if(day>28) day = 28;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        if(day>30) day = 30;
        break;
    }
    if(month>currentMonth){
      year--;
    }
    return year+"-"+(month<10?"0":"")+month+"-"+(day<10?"0":"")+day;
  }
}