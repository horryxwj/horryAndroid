package com.horry.MicroBlog.mvp.view;

import com.horry.MicroBlog.entity.Status;

import java.util.ArrayList;

/**
 * Created by wenmingvs on 16/5/14.
 */
public interface HomeFragmentView {
    /**
     * 刷新数据集
     */
    public void updateListView(ArrayList<Status> statuselist);


    /**
     * 显示loading动画
     */
    public void showLoadingIcon();

    /**
     * 隐藏loadding动画
     */
    public void hideLoadingIcon();

    /**
     * 显示正在加载的FooterView
     */
    public void showLoadFooterView();

    /**
     * 隐藏FooterView
     */
    public void hideFooterView();

    /**
     * 显示FooterView，提示没有任何内容了
     */
    public void showEndFooterView();

    /**
     * 显示FooterView，提示没有网络
     */
    public void showErrorFooterView();


    /**
     * 设置顶部的分组名
     */
    public void setGroupName(String userName);

    /**
     * 设置用户名
     *
     * @param userName
     */
    public void setUserName(String userName);

    /**
     * 滑动到顶部
     */
    public void scrollToTop(boolean refreshData);


    public void showRecyclerView();

    public void hideRecyclerView();

    public void showEmptyBackground(String text);

    public void hideEmptyBackground();

    public void popWindowsDestory();

}
