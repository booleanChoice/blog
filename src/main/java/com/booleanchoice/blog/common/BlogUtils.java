package com.booleanchoice.blog.common;

import org.apache.tomcat.util.security.MD5Encoder;

import java.util.UUID;

public class BlogUtils {

    public static String UUID() {
        return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
    }

    public static String MD5(String src) {
        if (src != null) {
            MD5Encoder.encode(src.getBytes());
        }
        return null;
    }
}
