package com.example.scheduler.task

import jdk.nashorn.internal.runtime.regexp.joni.Config.log
import lombok.extern.slf4j.Slf4j
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component


@Slf4j
@Component
class ExampleTaskKT {

    @Scheduled(fixedDelay = 1000)
    fun checkFiles() {
        println("test test")
    }

}