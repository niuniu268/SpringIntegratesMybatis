package org.example;

import org.example.Config.SpringConfig;
import org.example.Dao.UsersDao;
import org.example.Domain.Users;
import org.example.Service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( SpringConfig.class );
        UserService bean = context.getBean( UserService.class );
        List <Users> users = bean.selectAll( );
        System.out.println(users );
    }
}
