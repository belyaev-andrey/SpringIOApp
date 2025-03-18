package io.spring.jetbrains

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.bind.DefaultValue
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@SpringBootApplication
@ConfigurationPropertiesScan
class SpringIOApp

fun main(args: Array<String>) {
	runApplication<SpringIOApp>(*args)
}

@Configuration
class BoothConfiguration {
	@Bean
	fun boothService(props: BoothProperties) =
		BoothService("Meet ${props.participant} at Spring IO ${props.year}!")
}

@ConfigurationProperties(prefix = "io.spring")
data class BoothProperties(
	@DefaultValue("JetBrains") val participant: String,
	@DefaultValue("2025") val year: String
)

