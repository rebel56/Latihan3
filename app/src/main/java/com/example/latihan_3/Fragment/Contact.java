package com.example.latihan_3.Fragment;


/*
 * NIM      : 10116056
 * Nama     : Bagea Junan Muhammad
 * Kelas    : AKB2
 * CHANGELOG
 * Aplikasi V0.1 01/05/2019
 * Selesai 04/05/2019
 */

public class Contact {

    private String Name;
    private String Deskripsi;
    private int Photo;




    public Contact() {
    }
        public Contact(String name, String deskripsi, int photo) {
            Name = name;
            Deskripsi = deskripsi;
            Photo = photo;
        }

        public String getName() {
            return Name;
        }

        public String getPhone() {
            return Deskripsi;
        }

        public int getPhoto() {
            return Photo;
        }

        public void setName(String name) {
            Name = name;
        }

        public void setPhone(String deskripsi) {
            Deskripsi = deskripsi;
        }

        public void setPhoto(int photo) {
            Photo = photo;
        }




    }

