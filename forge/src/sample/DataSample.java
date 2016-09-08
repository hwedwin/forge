package sample;

import nc.liat6.forge.Data;

public class DataSample{
  public static void main(String[] args){
    //自定义数据格式
    String format = "姓名,性别,年龄岁,出生日期,手机号,民族族,省,市";
    for(int i = 0;i<2;i++){
      //随机生成
      System.out.println(Data.next(format));
    }
    //自定义数据格式
    format = "{name:'姓名',age:年龄,mobile:'手机'}";
    for(int i = 0;i<2;i++){
      //按指定年龄生成数据
      System.out.println(Data.next(format,new String[]{"年龄=18"}));
    }
  }
}