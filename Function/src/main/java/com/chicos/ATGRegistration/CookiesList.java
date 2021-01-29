package com.chicos.ATGRegistration;

public class CookiesList {

 private String name;
 private String value;
 private String expires;
 private String isHttpOnly;   
 private String isSecure;
 private String isSessionOnly;
 private String path;
 private String domain;

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getValue() {
     return value;
 }

 public void setValue(String value) {
     this.value = value;
 }

 public String getExpires() {
     return expires;
 }

 public void setExpires(String expires) {
     this.expires = expires;
 }

 public String getIsHttpOnly() {
     return isHttpOnly;
 }

 public void setIsHttpOnly(String isHttpOnly) {
     this.isHttpOnly = isHttpOnly;
 }

 public String getIsSecure() {
     return isSecure;
 }

 public void setIsSecure(String isSecure) {
     this.isSecure = isSecure;
 }

 public String getIsSessionOnly() {
     return isSessionOnly;
 }

 public void setIsSessionOnly(String isSessionOnly) {
     this.isSessionOnly = isSessionOnly;
 }

 public String getPath() {
     return path;
 }

 public void setPath(String path) {
     this.path = path;
 }

 public String getDomain() {
     return domain;
 }

 public void setDomain(String domain) {
     this.domain = domain;
 }

 public CookiesList(String name, String value, String expires, String isHttpOnly, String isSecure, String isSessionOnly,
         String path, String domain) {
     this.name = name;
     this.value = value;
     this.expires = expires;
     this.isHttpOnly = isHttpOnly;
     this.isSecure = isSecure;
     this.isSessionOnly = isSessionOnly;
     this.path = path;
     this.domain = domain;
 }

 @Override
 public String toString() {
     return "CookiesList [domain=" + domain + ", expires=" + expires + ", isHttpOnly=" + isHttpOnly + ", isSecure="
             + isSecure + ", isSessionOnly=" + isSessionOnly + ", name=" + name + ", path=" + path + ", value=" + value
             + "]";
 }

 
 
}
