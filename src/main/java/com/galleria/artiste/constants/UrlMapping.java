package com.galleria.artiste.constants;

public interface UrlMapping {
  String DOWNLOAD_FILE = "/file/{fileName:.+}";
  String USER_LOGIN = "/login";
  String USER_REGISTRATION = "/registration";
  String ADMIN = "/admin";
  String API = "/api";
  String DRAWINGS = "/drawings";
  String PHOTOGRAPHS = "/photographs";
  String ART = "/art";
}
