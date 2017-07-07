package com.zqg.annotationdemo.rapper;

/**
 * Created by zhuqiguang on 17/7/6.
 */
public class Rapper {
    @RapperName("吴亦凡")
    private String rapperName;
    @RapperAdress(rapperAdress = RapperAdress.Adress.BEIJING)
    private String rapperAdress;
    @RapperEquipment(rapperLanguage = RapperEquipment.Language.CHINESE, rapperLyrics = "你有free style吗?", rapperClothing = RapperEquipment.Clothing.GLASSES)
    private String rapperEquipment;

    public String getRapperName() {
        return rapperName;
    }

    public void setRapperName(String rapperName) {
        this.rapperName = rapperName;
    }

    public String getRapperAdress() {
        return rapperAdress;
    }

    public void setRapperAdress(String rapperAdress) {
        this.rapperAdress = rapperAdress;
    }

    public String getRapperEquipment() {
        return rapperEquipment;
    }

    public void setRapperEquipment(String rapperEquipment) {
        this.rapperEquipment = rapperEquipment;
    }
}
