package kevin.demo;

import java.sql.Date;
import java.util.Calendar;

/**
 * @Author: 李润豪
 * @Date: 2021/2/20 9:57
 */
public class Test {
    public static void main(String[] args) throws Exception{
        int j;
        Calendar cc = Calendar.getInstance();
        int myYear = cc.get(Calendar.YEAR);
        int myMonth = cc.get(Calendar.MONTH);
        j = cc.get(Calendar.DATE)>16?3:2;
        cc.set(Calendar.MONTH,myMonth);
        System.out.println(myYear+"-"+cc.get(cc.MONTH));
        for (int i = 0; i<7;i++){
            cc.add(cc.MONTH,1);
            int mm = cc.get(cc.MONTH);
            int mmm = mm==0?12:mm;
            System.out.println(myYear+"-"+mmm);
        }
    }
  }


