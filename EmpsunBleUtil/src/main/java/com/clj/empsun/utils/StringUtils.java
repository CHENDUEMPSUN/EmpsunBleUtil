package com.clj.empsun.utils;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class StringUtils {
    /**
     * 是否为空字符或null
     * @param str
     * @return
     */
    public static boolean isEmpty(CharSequence str) {
        return TextUtils.isEmpty(str);
    }

    /**
     * 字符更改颜色
     * @param context 上下文
     * @param content 内容
     * @param start 变换颜色文字开始位置
     * @param end 变换颜色文字结束位置
     * @param color 变换的颜色
     * @return
     */
    public static SpannableStringBuilder getSpannableString(Context context, String content, int start, int end, int color) {
        SpannableStringBuilder s = new SpannableStringBuilder(content);
        s.setSpan(new ForegroundColorSpan(context.getResources().getColor(color)), start, end,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return s;
    }

    /**
     * 取double数据后面两位小数的上界
     *
     * @param dbl 需转换的数据
     * @return 返回double型
     * */
    public static double getValueWith2Suffix(double dbl){
        BigDecimal bg = new BigDecimal(dbl);
        return bg.setScale(1, BigDecimal.ROUND_CEILING).doubleValue();
    }

    /**
     * 取小数点后两位
     * @param dbl
     * @return 返回字符型
     */
    public static String getStringValueWith2Suffix(double dbl){
        return String.valueOf(getValueWith2Suffix(dbl));
    }
    /**
     * 检查字符串是否为电话号码的方法,并返回true or false的判断值
     */
    public static boolean isPhoneNumberValid(String phoneNumber)
    {
        boolean isValid = false;
        String expression = "((^(13|14|15|17|18)[0-9]{9}$))";
        CharSequence inputStr = phoneNumber;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }

    public static String stringFilter(String str)throws PatternSyntaxException {
        String regEx = "[\n\t]"; //要过滤掉的字符
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("").trim();
    }
}
