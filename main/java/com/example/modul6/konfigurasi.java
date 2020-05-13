package com.example.modul6;

public class konfigurasi {

    //Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    public static final String URL_ADD="http://192.168.43.176/modul6/tambah.php";
    public static final String URL_GET_ALL = "http://192.168.43.176/modul6/tampilSemua.php";
    public static final String URL_GET_MHS = "http://192.168.43.176/modul6/tampil.php?id=";
    public static final String URL_UPDATE_MHS = "http://192.168.43.176/modul6/update.php";
    public static final String URL_DELETE_MHS = "http://192.168.43.176/modul6/hapus.php?id=";

    //Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_MHS_ID = "id";
    public static final String KEY_MHS_NAMA = "nama";
    public static final String KEY_MHS_JURUSAN = "jurusan";
    public static final String KEY_MHS_EMAIL = "email";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_JURUSAN = "jurusan";
    public static final String TAG_EMAIL = "email";

    //ID Mahasiswa
    public static final String MHS_ID = "mhs_id";
}