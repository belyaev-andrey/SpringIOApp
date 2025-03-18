package io.spring.jetbrains

import org.springframework.stereotype.Service

@Service
class BoothService(val s: String) {

    fun getConf() = s

}
