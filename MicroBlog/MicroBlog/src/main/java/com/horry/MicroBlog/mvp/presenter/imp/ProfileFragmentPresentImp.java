package com.horry.MicroBlog.mvp.presenter.imp;

import android.content.Context;

import com.horry.MicroBlog.entity.User;
import com.horry.MicroBlog.mvp.model.UserModel;
import com.horry.MicroBlog.mvp.model.imp.UserModelImp;
import com.horry.MicroBlog.mvp.presenter.ProfileFragmentPresent;
import com.horry.MicroBlog.mvp.view.ProfileFragmentView;

/**
 * Created by wenmingvs on 16/5/16.
 */
public class ProfileFragmentPresentImp implements ProfileFragmentPresent {

    private UserModel mUserModel;
    private ProfileFragmentView mProfileFragmentView;

    public ProfileFragmentPresentImp(ProfileFragmentView profileFragmentView) {
        this.mProfileFragmentView = profileFragmentView;
        this.mUserModel = new UserModelImp();
    }

    @Override
    public void refreshUserDetail(long uid, Context context, boolean loadIcon) {
        if (loadIcon) {
            mProfileFragmentView.showProgressDialog();
        }
        mUserModel.show(uid, context, new UserModel.OnUserDetailRequestFinish() {
            @Override
            public void onComplete(User user) {
                mProfileFragmentView.showScrollView();
                mProfileFragmentView.hideProgressDialog();
                mProfileFragmentView.setUserDetail(user);
            }

            @Override
            public void onError(String error) {
                mProfileFragmentView.showScrollView();
                mProfileFragmentView.hideProgressDialog();
            }
        });
    }
}
