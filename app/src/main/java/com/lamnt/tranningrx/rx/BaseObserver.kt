package com.lamnt.tranningrx.rx

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import javax.inject.Inject

class BaseObserver<T> @Inject constructor(private val context: Context) : Observer<T> {
    var liveData = MutableLiveData<T>()
    lateinit var disposable : Disposable
    override fun onSubscribe(d: Disposable) {
        disposable = d
    }

    override fun onNext(t: T) {
        if (t!=null){
            liveData.postValue(t)
        }else{
            onError(Throwable("Không có dữ liệu trả về"))
        }
    }

    override fun onError(e: Throwable) {
        Toast.makeText(context,e.message,Toast.LENGTH_SHORT).show()
    }

    override fun onComplete() {

    }
}