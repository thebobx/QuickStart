package me.tillard.quickstart.listener;

import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeUpdateEntityListener;
import com.haulmont.cuba.core.EntityManager;
import me.tillard.quickstart.entity.Order;
import com.haulmont.cuba.core.listener.AfterUpdateEntityListener;
import java.sql.Connection;

@Component("quickstart_NewEntityListener")
public class NewEntityListener implements AfterUpdateEntityListener<Order> {

    /*
    @Override
    public void onBeforeUpdate(Order entity, EntityManager entityManager) {
    }
*/


    @Override
    public void onAfterUpdate(Order entity, Connection connection) {
    }


}