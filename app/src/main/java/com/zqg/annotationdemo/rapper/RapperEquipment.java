package com.zqg.annotationdemo.rapper;

/**
 * Created by zhuqiguang on 17/7/6.
 */
public @interface RapperEquipment {
    //语言选项
    enum  Language{CHINESE, ENGLISH}
    //语言属性
    Language rapperLanguage() default Language.CHINESE;

    //说唱歌词
    String rapperLyrics() default "";
    //穿戴选项
    enum Clothing{GLASSES,  RING}
    Clothing rapperClothing() default Clothing.GLASSES;
}
