//class level ignore method is only used, when we created test suite

package task3_Ignore;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Program1Test.class })
public class AllTests {

}
