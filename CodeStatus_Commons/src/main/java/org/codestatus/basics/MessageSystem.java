package org.codestatus.basics;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageSystem {

    private static Logger logger = LoggerFactory.getLogger(MessageSystem.class);

    public MessageSystem(){
        logger.info("Constructor - MessageSystem :: ");
    }

    public boolean sendMessage(String strMessage) throws NullPointerException {

        return StringUtils.isNotEmpty(strMessage);
    }
}
