package com.okdevtv.tdd.junit5;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
  HelloWorldTest.class,
})
public class AllTests {

}
