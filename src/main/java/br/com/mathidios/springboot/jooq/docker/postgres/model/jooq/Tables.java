/*
 * This file is generated by jOOQ.
 */
package br.com.mathidios.springboot.jooq.docker.postgres.model.jooq;


import br.com.mathidios.springboot.jooq.docker.postgres.model.jooq.tables.DeliveryOrder;
import br.com.mathidios.springboot.jooq.docker.postgres.model.jooq.tables.DeliveryOrderProduct;
import br.com.mathidios.springboot.jooq.docker.postgres.model.jooq.tables.DeliveryProduct;
import br.com.mathidios.springboot.jooq.docker.postgres.model.jooq.tables.DeliveryRestaurant;
import br.com.mathidios.springboot.jooq.docker.postgres.model.jooq.tables.DeliveryUser;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.delivery_order</code>.
     */
    public static final DeliveryOrder DELIVERY_ORDER = br.com.mathidios.springboot.jooq.docker.postgres.model.jooq.tables.DeliveryOrder.DELIVERY_ORDER;

    /**
     * The table <code>public.delivery_order_product</code>.
     */
    public static final DeliveryOrderProduct DELIVERY_ORDER_PRODUCT = br.com.mathidios.springboot.jooq.docker.postgres.model.jooq.tables.DeliveryOrderProduct.DELIVERY_ORDER_PRODUCT;

    /**
     * The table <code>public.delivery_product</code>.
     */
    public static final DeliveryProduct DELIVERY_PRODUCT = br.com.mathidios.springboot.jooq.docker.postgres.model.jooq.tables.DeliveryProduct.DELIVERY_PRODUCT;

    /**
     * The table <code>public.delivery_restaurant</code>.
     */
    public static final DeliveryRestaurant DELIVERY_RESTAURANT = br.com.mathidios.springboot.jooq.docker.postgres.model.jooq.tables.DeliveryRestaurant.DELIVERY_RESTAURANT;

    /**
     * The table <code>public.delivery_user</code>.
     */
    public static final DeliveryUser DELIVERY_USER = br.com.mathidios.springboot.jooq.docker.postgres.model.jooq.tables.DeliveryUser.DELIVERY_USER;
}
