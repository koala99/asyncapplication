package com.smart.asycinit.tasks

import com.smart.starter.task.Task


class InitTask2: Task() {
    override fun runOnMainThread(): Boolean {//是否需要运行在主线程
        return true
    }

    override fun run() {
        //初始化
    }
}