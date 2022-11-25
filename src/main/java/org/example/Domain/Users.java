package org.example.Domain;

import org.springframework.stereotype.Component;

import java.util.Objects;


public class Users {

    private String username;
    private String password;
    private String tel;
    private String id;


    public Users() {
    }

    public Users(String username, String password, String tel, String id) {
        this.username = username;
        this.password = password;
        this.tel = tel;
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "Users{username = " + username + ", password = " + password + ", tel = " + tel + ", id = " + id + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass( ) != o.getClass( )) return false;
        Users users = (Users) o;
        return Objects.equals( username, users.username ) && Objects.equals( password, users.password ) && Objects.equals( tel, users.tel ) && Objects.equals( id, users.id );
    }

    @Override
    public int hashCode() {
        return Objects.hash( username, password, tel, id );
    }
}
