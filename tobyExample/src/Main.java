import springbook.user.dao.UserDao;
import springbook.user.domain.User;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        UserDao dao = new UserDao();

        User user = new User();
        user.setId("korea");
        user.setName("코리아");
        user.setPassword("pwd");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");
    }
}
