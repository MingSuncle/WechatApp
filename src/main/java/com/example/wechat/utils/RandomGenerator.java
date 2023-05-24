package com.example.wechat.utils;
import com.google.zxing.WriterException;

import java.io.IOException;
import java.util.Random;
/**
 * @Author xuke
 * @Description 飞哥
 * @Date 13:05 2021/4/24
 * @Param
 * @return
 **/
public class RandomGenerator {
    /**
     * 获取一定长度的随机字符串
     *
     * @param length 指定字符串长度
     * @return 一定长度的字符串
     */
    public static String getRandomStringByLength(int length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException, WriterException {
        RandomGenerator randomGenerator = new RandomGenerator();
        String key = randomGenerator.getRandomStringByLength(32);
        System.out.println(key);
    }
}