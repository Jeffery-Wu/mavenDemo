package com.jj;

import junit.framework.TestCase;

public class svm_predictTest extends TestCase
{
    public void testMain() throws Exception
    {
        //String cmdLine = "dataset/iris.scale.txt dataset/iris.scale.model dataset/iris.scale.result";
        String cmdLine = "-b 1 dataset/iris.scale.txt dataset/iris.scale.model1 dataset/iris.scale.result1";
        //String cmdLine = "dataset/iris.scale.txt dataset/iris.scale.model dataset/iris.scale.result2";

        svm_predict.main(cmdLine.split(" "));
    }
}