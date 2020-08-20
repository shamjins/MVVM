package com.logicipher.mvvm.utils.rx

import io.reactivex.Scheduler

/**
 * Created by Shamji N S on 20-08-2020.
 */
open interface SchedulerProvider {
    fun computation(): Scheduler?
    fun io(): Scheduler?
    fun ui(): Scheduler?
}
