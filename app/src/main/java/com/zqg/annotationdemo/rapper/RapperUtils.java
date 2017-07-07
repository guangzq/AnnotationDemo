package com.zqg.annotationdemo.rapper;

import android.util.Log;

import java.lang.reflect.Field;

/**
 * Created by zhuqiguang on 17/7/6.
 */
public class RapperUtils {
    private static String Tag = "RapperUtils";

    public static void getRapperInfo (Class<?> clazz){
        String rapperName = "rapper名字: ";
        String rapperAdress = "rapper住址: ";
        String rapperEquipment = "rapper装备: ";
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field field: declaredFields) {
            if (field.isAnnotationPresent(RapperName.class)) {
                RapperName name = field.getAnnotation(RapperName.class);
                Log.d(Tag, rapperName + name.value());
            }else if (field.isAnnotationPresent(RapperAdress.class)) {
                RapperAdress adress = field.getAnnotation(RapperAdress.class);
                Log.d(Tag, rapperAdress + adress.rapperAdress().toString());
            }else if (field.isAnnotationPresent(RapperEquipment.class)) {
                RapperEquipment equipment = field.getAnnotation(RapperEquipment.class);
                String equ = "语言: " + equipment.rapperLanguage().toString() + " ,歌词: " + equipment.rapperLyrics() + " ,穿戴: " + equipment.rapperClothing().toString();
                Log.d(Tag, rapperEquipment + equ);
            }
        }
    }
}
