package me.tillard.quickstart.web.order;

import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.aggregation.impl.BigDecimalAggregation;
import me.tillard.quickstart.entity.Order;
import me.tillard.quickstart.entity.OrderLine;

import javax.inject.Inject;
import java.math.BigDecimal;

public class OrderEdit extends AbstractEditor<Order> {
    @Inject
    private CollectionDatasource<OrderLine, java.util.UUID> linesDs;

    @java.lang.Override
    public void init(java.util.Map<java.lang.String, java.lang.Object> params) {
        linesDs.addCollectionChangeListener(e -> calculateAmount());
    }

    private void calculateAmount() {
        BigDecimal amount = BigDecimal.ZERO;
        for (OrderLine line : linesDs.getItems()) {
            amount = amount.add(line.getProduct().getPrice().multiply(line.getQuantity()));
        }
        getItem().setAmount(amount);
        //Test Github
    }
}