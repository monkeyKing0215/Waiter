package com.monkeyking.login

import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.monkeyking.common.base.BaseActivity
import com.monkeyking.login.databinding.ActivityLoginBinding

class LoginActivity :BaseActivity<ActivityLoginBinding>() {

    //在创建viewModel时，通用的方法是
    //viewModel = ViewModelProvider(this,MainViewModel.MainViewModelFactory()).get(MainViewModel::class.java)

    private val viewModel by viewModels<LoginViewModel> {defaultViewModelProviderFactory}

    override fun getLayoutRes() = R.layout.activity_login

    override fun initView() {
        super.initView()
        mBinding.apply {
            vm = viewModel
        }
    }

    override fun initData() {
        super.initData()
    }

    override fun initConfig() {
        super.initConfig()
    }
}