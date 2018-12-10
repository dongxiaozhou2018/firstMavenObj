package com.neuedu.jdbc.mybatisDemo;

import java.io.Serializable;

public class Boys implements Serializable {

   public Boys()
   {

   }

    private  Integer id;

    private  String boyName;

    private  String userCP;

    public Boys(Integer id, String boyName, String userCP) {
        this.id = id;
        this.boyName = boyName;
        this.userCP = userCP;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBoyName() {
        return boyName;
    }

    public void setBoyName(String boyName) {
        this.boyName = boyName;
    }

    public String getUserCP() {
        return userCP;
    }

    public void setUserCP(String userCP) {
        this.userCP = userCP;
    }

    @Override
    public String toString() {
        return "Boys{" +
                "id=" + id +
                ", boyName='" + boyName + '\'' +
                ", userCP='" + userCP + '\'' +
                '}';
    }
}
