package com.dovsnier.utils;

import com.blankj.utilcode.util.EncryptUtils;
import com.dvsnier.utils.StringUtils;

/**
 * Created by lizw on 2017/7/14.
 */

public class MD5 {

    public static String obtainDefaultValue() {
        return obtainValue(String.valueOf(System.currentTimeMillis()));
    }

    public static String obtainDefaultValue(String value) {
        return obtainValue(String.valueOf(System.currentTimeMillis()) + ":" + value);
    }

    public static String obtainValue(String value) {
        if (StringUtils.isNotEmpty(value))
            return EncryptUtils.encryptMD5ToString(value);
        return value;
    }

    public static String obtainValue(String name, String value) {
        return obtainValue(name + ":" + value);
    }

}
