package tech.danielwaiguru.androidarchitecturecomponents.models.response

import com.squareup.moshi.Json
import tech.danielwaiguru.androidarchitecturecomponents.models.Character

data class CharacterResponse (
    @field:Json(name = "results") val characters: List<Character> = mutableListOf())