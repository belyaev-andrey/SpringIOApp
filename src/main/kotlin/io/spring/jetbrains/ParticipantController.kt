package io.spring.jetbrains

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping( "/api")
class ParticipantController(private val boothService: BoothService) {

    @GetMapping( "conf")
    fun sayConfig(): String {
        return boothService.getConf()
    }

}
