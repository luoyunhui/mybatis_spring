package cn.itcast.mybatis.domain;

public class User {

    private String id;
    private String userName;
    private String address;

    public String getId() {
        System.out.println("正在通过getId方法获取id的值：" + id);
        return id;
    }

    public void setId(String id) {
        System.out.println("正在通过setId方法注入id的值：" + id);
        this.id = id;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("正在通过setAddress方法注入address的值：" + address);
        this.address = address;
    }

    @Override
    public String toString() {
        return "{id:" + id + ",name:" + userName + ",address:" + address + "}";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("正在通过setUserName方法注入userName的值：" + userName);
        this.userName = userName;
    }
}
