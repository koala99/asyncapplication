package com.smart.asycinit.tasks

import com.smart.starter.task.Task


class InitTask1 : Task() {
    override fun needWait(): Boolean {//是否需要在阻塞在await(),在Application的onCreate方法之前执行完
        return true
    }

    override fun dependsOn(): MutableList<Class<out Task>> {//等待另一个Task执行完再执行此任务初始化
        return mutableListOf(InitTask2::class.java)
    }

    override fun run() {
        //初始化
    }
}