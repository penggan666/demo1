package com.example.demo1.Util;

import com.example.demo1.Bean.orign;
import com.example.demo1.Repository.orignRepository;

import javax.xml.soap.Text;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class orignUtil {
    public orignRepository orignRepository;
    public static List<String> readTxttoString(File file) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            List<String> list=new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    private static String getMatchTime(String s) {
        Pattern p = Pattern.compile("(T<=>)(.*?)(\\[=])");
        Matcher m = p.matcher(s);
        String a=null;
        while (m.find())
            a=m.group(2).trim();
        return  a;
    }
    private static String getMatchTime1(String s) {
        Pattern p = Pattern.compile("(P<=>)(.*?)(\\[=])");
        Matcher m = p.matcher(s);
        String a=null;
        while (m.find())
            a=m.group(2).trim();
        return  a;
    }
    private static String getMatchTime2(String s) {//匹配url
        Pattern p = Pattern.compile("(U<=>)(.*?)(\\[=])");
        Matcher m = p.matcher(s);
        String a=null;
        while (m.find())
            a=m.group(2).trim();
        return  a;
    }
//    public static String readTime(File f)//读取一个txt中的时间
//    {
//        String url = "";
//        String s = readTxttoString(f);
//        List<String> urlByRegex = getMatchTime(s);
//        for (String Url : urlByRegex) {
//            url = url+Url + '|';
//        }
//        return url;
//    }
//    public static String readProgress(File f)//读取一个txt中的进程名
//    {
//        String url = "";
//        String s = readTxttoString(f);
//        List<String> urlByRegex = getMatchTime1(s);
//        for (String Url : urlByRegex) {
//            url = url+Url + '|';
//        }
//        return url;
//    }
//    public static String readUrl(File f)//读取一个txt中的url
//    {
//        String url = "";
//        String s = readTxttoString(f);
//        Set<String> urlByRegex = getMatchTime2(s);
//        for (String Url : urlByRegex) {
//            url = url+Url + '|';
//        }
//        return url;
//    }
    public static List<orign> alldata()//读取所有数据
    {
        int num=1;
        String basePath = "H://data//behavior";
        File file1 = new File(basePath);
        List <orign>  O=new ArrayList<>();
        File[] timeFiles = file1.listFiles();
        for (File f : timeFiles) {
            File[] dataFiles = f.listFiles();
            for (File f_data : dataFiles) {
                List<String> list=readTxttoString(f_data);
                String s=f_data.getName().substring(0,52);
                for(String ss:list) {
                    System.out.println(s);
                    String s1 = getMatchTime(ss);
                    String s2 = getMatchTime2(ss);
                    String s3 = getMatchTime2(ss);
                    orign o = new orign();
                    o.setNum(num);
                    o.setTxtname(s);
                    o.setTime(s1);
                    o.setProgress(s2);
                    o.setUrl(s3);
                    O.add(o);
                    System.out.println(num++);
                }
            }
        }
        return O;
    }

}
