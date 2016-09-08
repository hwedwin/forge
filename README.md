# forge
一个无第三方依赖的常用测试数据生成器，可按自定义的格式生成内容。
> 支持jdk1.5及以上。

示例代码：

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

输出结果：

    正毓昭,女,52岁,1964-09-19,13508721553,仫佬族,湖北,黄冈市
    阮爽,女,57岁,1958-11-18,13500581726,回族,福建,莆田市
    {name:'熊馥舒',age:18,mobile:'13002917308'}
    {name:'毕广',age:18,mobile:'13402176257'}
