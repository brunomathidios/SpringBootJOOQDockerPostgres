/*
 * This file is generated by jOOQ.
 */
package br.com.mathidios.springboot.jooq.docker.postgres.model.jooq.tables.records;


import br.com.mathidios.springboot.jooq.docker.postgres.model.jooq.tables.DeliveryOrder;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DeliveryOrderRecord extends UpdatableRecordImpl<DeliveryOrderRecord> implements Record6<Integer, Integer, Integer, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -1048337028;

    /**
     * Setter for <code>public.delivery_order.id_order</code>.
     */
    public void setIdOrder(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.delivery_order.id_order</code>.
     */
    public Integer getIdOrder() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.delivery_order.id_restaurant</code>.
     */
    public void setIdRestaurant(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.delivery_order.id_restaurant</code>.
     */
    public Integer getIdRestaurant() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.delivery_order.id_user</code>.
     */
    public void setIdUser(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.delivery_order.id_user</code>.
     */
    public Integer getIdUser() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.delivery_order.in_status_order</code>.
     */
    public void setInStatusOrder(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.delivery_order.in_status_order</code>.
     */
    public String getInStatusOrder() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.delivery_order.dt_order</code>.
     */
    public void setDtOrder(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.delivery_order.dt_order</code>.
     */
    public LocalDateTime getDtOrder() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.delivery_order.dt_cancel</code>.
     */
    public void setDtCancel(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.delivery_order.dt_cancel</code>.
     */
    public LocalDateTime getDtCancel() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DeliveryOrder.DELIVERY_ORDER.ID_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return DeliveryOrder.DELIVERY_ORDER.ID_RESTAURANT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return DeliveryOrder.DELIVERY_ORDER.ID_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DeliveryOrder.DELIVERY_ORDER.IN_STATUS_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field5() {
        return DeliveryOrder.DELIVERY_ORDER.DT_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field6() {
        return DeliveryOrder.DELIVERY_ORDER.DT_CANCEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getIdOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getIdRestaurant();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getIdUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getInStatusOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component5() {
        return getDtOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component6() {
        return getDtCancel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getIdRestaurant();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getIdUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getInStatusOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value5() {
        return getDtOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value6() {
        return getDtCancel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeliveryOrderRecord value1(Integer value) {
        setIdOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeliveryOrderRecord value2(Integer value) {
        setIdRestaurant(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeliveryOrderRecord value3(Integer value) {
        setIdUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeliveryOrderRecord value4(String value) {
        setInStatusOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeliveryOrderRecord value5(LocalDateTime value) {
        setDtOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeliveryOrderRecord value6(LocalDateTime value) {
        setDtCancel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeliveryOrderRecord values(Integer value1, Integer value2, Integer value3, String value4, LocalDateTime value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DeliveryOrderRecord
     */
    public DeliveryOrderRecord() {
        super(DeliveryOrder.DELIVERY_ORDER);
    }

    /**
     * Create a detached, initialised DeliveryOrderRecord
     */
    public DeliveryOrderRecord(Integer idOrder, Integer idRestaurant, Integer idUser, String inStatusOrder, LocalDateTime dtOrder, LocalDateTime dtCancel) {
        super(DeliveryOrder.DELIVERY_ORDER);

        set(0, idOrder);
        set(1, idRestaurant);
        set(2, idUser);
        set(3, inStatusOrder);
        set(4, dtOrder);
        set(5, dtCancel);
    }
}
