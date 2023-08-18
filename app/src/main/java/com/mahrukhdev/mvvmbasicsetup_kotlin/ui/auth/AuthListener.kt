package com.mahrukhdev.mvvmbasicsetup_kotlin.ui.auth

interface AuthListener {
    fun onStarted()
    fun onSuccess()
    fun onFailure(message: String)
}