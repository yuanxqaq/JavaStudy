package project.team.domain;

/**
 * ClassName: PC
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/18 11:20
 * @Version 1.0
 */
public class PC implements Equipment {
    private String model;
    private String display;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
