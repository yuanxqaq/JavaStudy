package string.exer3;

/**
 * ClassName: User
 * Description:
 *   定义用户类，属性为用户名和密码，
 *   提供相关的getter和setter方法，构造器，toString()。
 * @Author ZhangJiaYuan
 * @Create 2023/4/23 23:23
 * @Version 1.0
 */
public class User {
    private String name;
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return name + "-" + password;
    }
}
