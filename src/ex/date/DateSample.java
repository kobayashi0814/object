package ex.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


public class DateSample {
    public static void main(String[] args) {

        question1();
        question2();
        question3();
    }

        public static void question1() {

        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();
        DateFormat format = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");

        //現在日時
        System.out.println("現在日時：" + format.format(now));
        //1年後
        calendar.setTime(now);
        calendar.add(Calendar.YEAR, 1);
        Date date1 = calendar.getTime();
        System.out.println("1年後：" + format.format(date1));
        //2ヵ月後
        calendar.setTime(now);
        calendar.add(Calendar.MONTH, 2);
        Date date2 = calendar.getTime();
        System.out.println("2カ月後：" + format.format(date2));
        //3ヵ月前
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_WEEK_IN_MONTH, -3);
        Date date3 = calendar.getTime();
        System.out.println("3週間前：" + format.format(date3));
        //4日前
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_MONTH, -4);
        Date date4 = calendar.getTime();
        System.out.println("4日前：" + format.format(date4));
        //5時間前
        calendar.setTime(now);
        calendar.add(Calendar.HOUR, -5);
        Date date5 = calendar.getTime();
        System.out.println("5時間前：" + format.format(date5));
        //6分前
        calendar.setTime(now);
        calendar.add(Calendar.MINUTE, -6);
        Date date6 = calendar.getTime();
        System.out.println("6分前：" + format.format(date6));
        //7秒前
        calendar.setTime(now);
        calendar.add(Calendar.SECOND, -7);
        Date date7 = calendar.getTime();
        System.out.println("7秒前：" + format.format(date7));
    }

    public static void question2() {
        LocalDateTime dateTime = LocalDateTime.now();

        LocalDateTime date1 = dateTime.plusYears(1);
        LocalDateTime date2 = dateTime.plusMonths(2);
        LocalDateTime date3 = dateTime.minusWeeks(3);
        LocalDateTime date4 = dateTime.minusDays(4);
        LocalDateTime date5 = dateTime.plusHours(5);
        LocalDateTime date6 = dateTime.minusMinutes(6);
        LocalDateTime date7 = dateTime.minusSeconds(7);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒");

        System.out.println("1年後：" + format.format(date1));
        System.out.println("2ヵ月後：" + format.format(date2));
        System.out.println("3週間前：" + format.format(date3));
        System.out.println("4日前：" + format.format(date4));
        System.out.println("5時間後：" + format.format(date5));
        System.out.println("6分前：" + format.format(date6));
        System.out.println("7秒前：" + format.format(date7));
    }

    //あってるかわからない　※回答確認！！
    public static void question3() {
        for (int year = 2000; year < 2101; year++) {
            if (year % 4 == 0) {
                if(year / 100 != 0) {
                    System.out.println(year + "年はうるう年");
                } if (year / 400 == 0) {
                    System.out.println(year + "年はうるう年");
                }
            }
        }
    }
}



