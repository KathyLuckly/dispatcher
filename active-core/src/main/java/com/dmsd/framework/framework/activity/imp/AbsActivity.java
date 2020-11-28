package com.dmsd.framework.framework.activity.imp;

import com.dmsd.framework.framework.activity.IActivity;
import com.dmsd.framework.framework.activity.IActivityCallBack;
import com.dmsd.framework.framework.component.IActivityComponent;

/**
 * 抽象活动类
 * @author cao xueliang
 * @date 2020/9/28 10:29
*/
public class AbsActivity implements IActivity {
    /**
     * 起始节点
     */
    private IActivityComponent startComponent;
    /**
     * 结束节点
     */
    private IActivityComponent endComponent;

    @Override
    public void start(IActivityCallBack activityCallBack) {

    }
}
