package eu.stolin

import org.springframework.stereotype.Component

@Component
class WorldService {

    fun world(): String {
        return "world"
    }
}