package fuyu.model;

import fuyu.domain.User;
import fuyu.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import java.sql.SQLException;

/*
用户的模型层
 */
public class UserModel {
    public User login(User user) throws SQLException {

        QueryRunner queryRunner=new QueryRunner(JDBCUtils.getDataSource());
        String sql="select * from user where username= ? and password = ?";
        User existUser=queryRunner.query(sql,new BeanHandler<User>(User.class),user.getUsername(),user.getPassword());
        return existUser;
    }
}
