package com.nestdev.neuroprotocol.domain.roles

import com.nestdev.neuroprotocol.domain.Result

data class Participant(val firstName: String, val secondName: String, val age: Int, val result: Result): Role(firstName, secondName)
