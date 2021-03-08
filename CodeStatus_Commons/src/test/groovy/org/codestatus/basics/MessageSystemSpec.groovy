package org.codestatus.basics

import spock.lang.Specification

class MessageSystemSpec extends Specification {

    def 'sendMessage_Test01' () {

        when:
        def objMsgSystem = new MessageSystem()

        then:
        objMsgSystem.sendMessage("Hello !!! ")
    }

    def 'sendMessage_Test02' () {

        when:
        def objMsgSystem = new MessageSystem()

        then:
        objMsgSystem.sendMessage(" ")
    }

    def 'sendMessage_Test03' () {

        when:
        def objMsgSystem = new MessageSystem()

        then:
        !objMsgSystem.sendMessage(" ".trim())
    }

    def 'sendMessage_Test04' () {

        when:
        def objMsgSystem = new MessageSystem()

        then:
        !objMsgSystem.sendMessage(null)
    }

}
