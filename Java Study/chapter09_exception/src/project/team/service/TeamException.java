package project.team.service;

/**
 * ClassName: TeamException
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/18 13:27
 * @Version 1.0
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -33879948L;
    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
