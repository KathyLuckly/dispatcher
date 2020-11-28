package com.dmsd.framework.framework.handler;

import org.springframework.stereotype.Component;

/**
 * Created by JYJ on 2019/10/31.
 */
public interface IHandler<T> {
    boolean canExecute(T t);
    Object doExecute(T t);
}
