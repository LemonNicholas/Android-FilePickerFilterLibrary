package com.necistudio.libarary.utils;

import java.io.File;

/**
 * Created by droidNinja on 29/07/16.
 */
public class Utils {

    public static String getFileExtension(File file) {
        String name = file.getName();
        try {
            return name.substring(name.lastIndexOf(".") + 1);
        } catch (Exception e) {
            return "";
        }
    }

    public static boolean contains(String[] types, String path) {
        for (String string : types) {
            if (path.toLowerCase().endsWith(string)) return true;
        }
        return false;
    }
}
