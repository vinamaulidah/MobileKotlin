package week2.`object`

import week2.Class.Manager
import week2.Class.member

fun main() {

    val manager = Manager("plugin")
    manager.sayHello("Mobile")

    val member = member("vina")
    member.sayHello("plugin")
}