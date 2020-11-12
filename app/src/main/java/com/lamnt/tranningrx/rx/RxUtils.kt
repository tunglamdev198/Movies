package com.lamnt.tranningrx.rx

import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object RxUtils {
    @JvmStatic
    fun<E> handleObservable(observable: Observable<E>,
                            observer: BaseObserver<E>){
        observable.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(observer)
    }
}