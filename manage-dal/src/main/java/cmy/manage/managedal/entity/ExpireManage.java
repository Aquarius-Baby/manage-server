package cmy.manage.managedal.entity;

/**
 * @author: Aquarius
 * @time: 2023/2/6 23:39
 * @description:
 */
public class ExpireManage {
    public Long id;
    public String name;

    @Override
    public String toString() {
        return "ExpireManage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
