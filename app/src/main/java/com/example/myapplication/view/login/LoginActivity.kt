package com.example.myapplication.view.login

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityCommonBinding
import com.example.myapplication.view.base.BaseActivity

class LoginActivity : BaseActivity() {
    private lateinit var mBinding: ActivityCommonBinding

    companion object {
        val TAG: String = LoginActivity::class.java.simpleName
        fun newIntent(activity: Activity) {
            activity.startActivity(Intent(activity, LoginActivity::class.java))
        }

        fun newClearLogin(context: Activity?) {
            val intent = Intent(context, LoginActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            context?.startActivity(intent)
            context?.finish()
        }
    }

    override fun getLayout(): Int {
        return R.layout.activity_common
    }

    override fun initUI(binding: ViewDataBinding) {
        mBinding = binding as ActivityCommonBinding
        init()
        clickListener()
    }

    private fun init() {
        navigateScreen(LoginFrm.TAG)
    }

    private fun clickListener() {
    }

    private fun navigateScreen(tag: String) {
        var frm: Fragment? = null
        when (tag) {
            LoginFrm.TAG -> frm = LoginFrm.getInstance(Bundle())
        }
        if (frm != null) navigateFragment(R.id.container, frm, false)
    }
}