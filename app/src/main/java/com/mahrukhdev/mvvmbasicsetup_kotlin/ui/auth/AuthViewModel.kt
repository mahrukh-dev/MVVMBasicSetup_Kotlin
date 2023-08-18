package com.mahrukhdev.mvvmbasicsetup_kotlin.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {

    var email: String? = null
    var password: String? = null

    var authListener: AuthListener? = null

    fun onSignInClick(view: View){
        authListener?.onStarted()
        if(email.isNullOrEmpty() || password.isNullOrEmpty()){
            //ERROR MESSAGE
            authListener?.onFailure("Invalid email or password")
        }
        else {
            //SUCCESS
            authListener?.onSuccess()
        }
    }
}