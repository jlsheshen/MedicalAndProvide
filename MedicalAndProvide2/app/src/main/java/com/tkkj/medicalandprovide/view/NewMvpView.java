package com.tkkj.medicalandprovide.view;

import com.tkkj.medicalandprovide.base.BaseView;

import java.util.List;



public interface NewMvpView extends BaseView {
    void setListItem(List<String> data);
    void showMessage(String message);
}
