package com.jj;

import junit.framework.TestCase;

public class svm_scaleTest extends TestCase
{
    public void testScaleS() throws Exception
    {
        String cmdLine = "-s diabetes.scale.txt -l 1 -u 10 -y 0 1 dataset/diabetes.txt";
        svm_scale.main(cmdLine.split(" "));
    }
}