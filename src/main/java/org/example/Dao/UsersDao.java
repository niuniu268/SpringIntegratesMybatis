package org.example.Dao;

import org.apache.ibatis.annotations.Select;
import org.example.Domain.Users;

import java.util.List;

public interface UsersDao {
    @Select("select * from users"  )
    List<Users> selectAll();
}
