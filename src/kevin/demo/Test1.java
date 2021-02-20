package kevin.demo;

import java.text.DateFormat;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: 李润豪
 * @Date: 2021/2/20 10:46
 */
public class Test1 {
    public void getTimeByDate(){
        Date date = new Date();
        DateFormat df1 = DateFormat.getDateInstance();//日期格式，精确到日
        System.out.println(df1.format(date));
        DateFormat df2 = DateFormat.getDateInstance();//可以精确到时分秒

        System.out.println(df2.format(date));
        DateFormat df3 = DateFormat.getTimeInstance();//只显示出时分秒
        System.out.println(df3.format(date));
        DateFormat df4 = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);//显示日期，周上下午，时间（精确到秒）
        System.out.println(df4.format(date));
        DateFormat df5 = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);//显示日期，周上下午，时间（精确到秒）
        System.out.println(df5.format(date));
        DateFormat df6 = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);//显示日期，周上下午，时间（精确到秒）
        System.out.println(df6.format(date));
        DateFormat df7 = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);//显示日期，周上下午，时间（精确到秒）
        System.out.println(df7.format(date));

    }

    public void getTimeByCalendar(){
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);//获取年份
        int month = cal.get(Calendar.MONTH);//获取月份
        int day = cal.get(Calendar.DATE);//获取日
        int hour = cal.get(Calendar.HOUR);//小时
        int minute = cal.get(Calendar.MINUTE);//分
        int second = cal.get(Calendar.SECOND);//秒
        int WeekOfYear = cal.get(Calendar.DAY_OF_WEEK);//一周的第几天
        System.out.println("现在的时间是：公元"+year+"年"+month+"月"+day+"日"+hour+"时"+minute+"分"+second+"秒  星期"+ WeekOfYear);

    }

//    public static void main(String[] args) {
//      Test1 t = new Test1();
//      t.getTimeByDate();
//        System.out.println("**********************");
//        t.getTimeByCalendar();
//    }

    public static void main(String[] args) throws Exception{
        int j;
        Calendar cc = Calendar.getInstance();
        int myYear = cc.get(Calendar.YEAR);
        int myMonth = cc.get(Calendar.MONTH);
        j = cc.get(Calendar.DATE)>16?3:2;
        cc.set(Calendar.MONTH,myMonth+j);
        System.out.println(myYear+"-"+cc.get(cc.MONTH));
        for (int i =0;i<7;i++){
            cc.add(cc.MONTH,1);
            int mm = cc.get(cc.MONTH);
            int mmm=mm==0?12:mm;
            System.out.println(myYear+"-"+mmm);
        }
    }
}
