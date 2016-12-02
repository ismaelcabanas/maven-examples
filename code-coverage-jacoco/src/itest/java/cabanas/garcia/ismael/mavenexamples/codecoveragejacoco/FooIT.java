package cabanas.garcia.ismael.mavenexamples.codecoveragejacoco;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by XI317311 on 02/12/2016.
 */
public class FooIT {
    @Test
    public void fooIT_whenInvoke_returnFoo() {
        // GIVEN
        Foo foo = new Foo();

        // WHEN
        String message = foo.foo();

        // THEN
        Assert.assertThat(message, Is.is(IsEqual.equalTo("Foo")));
    }
}
