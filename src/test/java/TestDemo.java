import com.data.Demo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDemo {

    @Test
    public void testAdd() {
        Demo d = new Demo();
        int ans = d.add(20, 20);
        assertEquals(400, ans);
    }
}
