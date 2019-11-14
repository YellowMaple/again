package com.hfy.bottom.extentions

import android.content.Context
import android.util.Log
import android.widget.Toast


fun Context.toast(message:String){
    Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
}
fun Context.longToast(message:String){
    Toast.makeText(this,message,Toast.LENGTH_LONG).show()
}
fun Context.logd(message: String){
    Log.d(this.javaClass.simpleName,message)
}
fun Context.logi(message: String){
    Log.i(this.javaClass.simpleName,message)
}
fun Context.logw(message: String){
    Log.w(this.javaClass.simpleName,message)
}