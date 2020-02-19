package com.liuwen.repository;

import com.liuwen.entity.Order;

import java.util.List;

public interface OrderRepository {

    public List<Order> findAllByUid(long uid,int index,int limit);
    public void save(Order order);
    public int countByUid(long uid);
    public void deleteByMid(long mid);
    public void deleteByUid(long uid);
    public List<Order> findAllByState(int state,int index,int limit);
    public int countByState(int state);
    public void updateState(long id,long aid,int state);
}