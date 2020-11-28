package com.dmsd.framework.framework.activity;
/**  
 * 活动的上下文
 *
 * 作用：为活动组件提供共享数据的平台
 * @author cao xueliang
 * @date 2020/9/28 10:26
*/
public interface IActivityContext {
    <T> T get(String key);
}
