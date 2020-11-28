package com.dmsd.framework.framework.component.impl;

import com.dmsd.framework.framework.component.IActivityComponent;

import java.util.List;

/**
 * 抽象活动组件
 *
 * 提供活动组件代码复用的基础类
 * @author cao xueliang
 * @date 2020/9/28 10:44
*/
public abstract class AbsActivityComponent implements IActivityComponent {
    /**
     * 有序的下一层活动组件
     */
    private List<IActivityComponent> childComponents;

    @Override
    public <O> O proccess(T o) {
        return null;
    }

    public abstract void execute();
}
