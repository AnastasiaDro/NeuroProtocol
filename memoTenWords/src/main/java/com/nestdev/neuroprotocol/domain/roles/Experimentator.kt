package com.nestdev.neuroprotocol.domain.roles


data class Experimentator (val firstName: String, val secondName: String, val specialisation: String): Role(firstName, secondName)