//package com.ganesh.abstractclass;
//
//
//import com.ganesh.generics.Student;
//
//import java.util.StringTokenizer;
//
//public class Aided extends Student {
//    private double round(double value, int precision) {
//        int scale = (int) Math.pow(10, precision);
//        return (double) Math.round(value * scale) / scale;
//    }
//
//    Double calcu(int mark) {
//        Double ans;
//        if (mark >= 75) {
//
//            ans = 9.0 + Math.floor(((mark - 75) / 2.36)) * 0.1;
//        } else if (mark >= 60) {
//            ans = 8.0 + Math.floor(((mark - 60) / 1.5)) * 0.1;
//
//        } else if (mark >= 50) {
//            ans = 7.0 + ((mark - 50)) * 0.1;
//
//        } else if (mark >= 40) {
//            ans = 6.0 + ((mark - 40)) * 0.1;
//
//        } else {
//            ans = 0.0;
//        }
//        // String temp=Double.toString(ans);
//        System.out.println(round(ans, 1));
//        return round(ans, 1);
//    }
//
//    public String result(String allMarks) {
//
//        StringTokenizer st = new StringTokenizer(allMarks, "|");
//        String subjMarks = st.nextToken();
//        String NCCMarks = st.nextToken();
//        String SportsMarks = st.nextToken();
//
//        //subjects
//        StringTokenizer subjMarksu = new StringTokenizer(subjMarks, ",");
//        int cnt = 0;
//        Double val = 0.0;
//        while (subjMarksu.hasMoreTokens()) {
//            StringTokenizer xx = new StringTokenizer(subjMarksu.nextToken(), " ");
//            String mark = xx.nextToken();
//            String point = xx.nextToken();
//            val += calcu(Integer.parseInt(mark)) * Double.parseDouble(point);
//            cnt++;
//        }
//        StringTokenizer nccMarksu = new StringTokenizer(NCCMarks, ",");
//        if (nccMarksu.nextToken().charAt(0) == '1') {
//            String mark = nccMarksu.nextToken();
//            String point = nccMarksu.nextToken();
//            val += calcu(Integer.parseInt(mark)) * Double.parseDouble(point);
//            cnt++;
//        }
//        StringTokenizer SportsMarksu = new StringTokenizer(SportsMarks, ",");
//        if (SportsMarksu.nextToken().charAt(0) == '1') {
//            String mark = SportsMarksu.nextToken();
//            String point = SportsMarksu.nextToken();
//            val += calcu(Integer.parseInt(mark)) * Double.parseDouble(point);
//            cnt++;
//        }
//        val /= (cnt * 5);
//        return String.format("%.2f", round(val, 2));
//
//    }
//
//}