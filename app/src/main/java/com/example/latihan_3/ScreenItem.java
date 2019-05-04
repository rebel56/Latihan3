package com.example.latihan_3;

/*
 * NIM      : 10116056
 * Nama     : Bagea Junan Muhammad
 * Kelas    : AKB2
 * CHANGELOG
 * Aplikasi V0.1 01/05/2019
 * Selesai 04/05/2019
 */

public class ScreenItem {
    String Title,Description;
    int ScreenImg;

    public ScreenItem(String title, String description, int screenImg) {
        Title = title;
        Description = description;
        ScreenImg = screenImg;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }

}
