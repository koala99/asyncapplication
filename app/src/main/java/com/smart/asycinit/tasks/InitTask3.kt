package com.smart.asycinit.tasks

import com.smart.starter.task.Task

class InitTask3: Task() {
    override fun needRunAsSoon(): Boolean {//提高优先级,也可以指定优先级大小
        return true
    }

    override fun run() {
        //初始化
    }
}