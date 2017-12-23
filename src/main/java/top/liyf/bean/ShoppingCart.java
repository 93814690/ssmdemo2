package top.liyf.bean;

public class ShoppingCart {

    private Integer sid;
    private User user;

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "sid=" + sid +
                ", user=" + user.getUsername() +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
