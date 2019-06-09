package dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import pojo.User;

import java.util.List;
@Repository
public interface UserDao {
    @Select("select * from user")
    public List<User> findall();
    @Insert("insert into user(account,password) values(#{account},#{password})")
    public void save(User user);
 }
