package com.smart.asycinit

import android.app.Application
import com.smart.asycinit.tasks.InitTask1
import com.smart.asycinit.tasks.InitTask2
import com.smart.asycinit.tasks.InitTask3
import com.smart.starter.LauncherStarter

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        LauncherStarter.init(this)
        val starter = LauncherStarter.createInstance()

        starter.addTask(InitTask1())
            .addTask(InitTask2())
            .addTask(InitTask3())
        //addTask()...
        starter.start()
        starter.await()
        //LauncherStarter.createInstance()
        //            .run {
        //                addTask(InitTask1())
        //                    .addTask(InitTask2())
        //                    .addTask(InitTask3())
        //                    //addTask()...
        //                    .start()
        //                await()
        //            }
    }
}