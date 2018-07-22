package com.jj;

import junit.framework.TestCase;

public class svm_trainTest extends TestCase
{
    public void testMain() throws Exception
    {
        String cmdLine = "-b 1 dataset/iris.scale.txt dataset/iris.scale.model1";
        svm_train.main(cmdLine.split(" "));
    }
}