package top.niyihua.demo04.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.niyihua.demo04.entity.User;

public interface UserDao extends JpaRepository<User,Long> {
}
