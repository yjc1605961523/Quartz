package com.ty.asserts;


import com.mysql.jdbc.StringUtils;

public class NotNullTest {
    public static void main(String[] args) {
        System.out.println("' '的Unicode编码为：" + (int)' ');
        System.out.println(StringUtils.isNullOrEmpty(" ".trim()));
    }
}
