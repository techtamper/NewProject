package com.example.myapplication.view.login

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.databinding.FrmLoginBinding
import com.example.myapplication.view.activity.MainActivity
import com.example.myapplication.view.base.BaseFragment

class LoginFrm : BaseFragment() {
    private lateinit var mBinding: FrmLoginBinding

    companion object {
        val TAG = LoginFrm::class.java.simpleName
        fun getInstance(bundle: Bundle): LoginFrm {
            val fragment = LoginFrm()
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun getLayout(): Int {
        return R.layout.frm_login
    }

    override fun initUI(binding: ViewDataBinding) {
        mBinding = binding as FrmLoginBinding
        init()
        clickListener()
    }

    private fun init() {
    }

    private fun clickListener() {
        mBinding.btnLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        super.onClick(v)
        when (v.id) {
            R.id.btn_login -> {
                MainActivity.newClearLogin(activity)
            }
        }
    }


    /**
     * navigate on fragment
     * @param tag represent navigation activity
     */
    private fun navigateScreen(tag: String, bundle: Bundle) {
        val frm: Fragment? = null
        when (tag) {
//            ProfileFrm.TAG -> frm = ProfileFrm.getInstance(Bundle())
//            ZoomImageFrm.TAG -> frm = ZoomImageFrm.getInstance(bundle)
        }
        if (frm != null) navigateFragment(R.id.container, frm, false)
    }

}


