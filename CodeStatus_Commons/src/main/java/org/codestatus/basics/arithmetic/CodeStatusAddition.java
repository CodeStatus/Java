package org.codestatus.basics.arithmetic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CodeStatusAddition {

    private static Logger logger = LoggerFactory.getLogger(CodeStatusAddition.class);

    public CodeStatusAddition(){
        logger.info("Constructor - CodeStatusAddition :: ");
    }

    public int addNumbers(int iNum1, int iNum2){

        logger.debug("Adding int variables :: ");

        return (iNum1 + iNum2);
    }

    public double addNumbers(double dNum1, double dNum2){

        logger.debug("Adding double variables :: ");

        return (dNum1 + dNum2);
    }


}
