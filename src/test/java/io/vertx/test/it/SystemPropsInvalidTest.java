package io.vertx.test.it;

import io.vertx.core.http.HttpServerOptions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class SystemPropsInvalidTest {

  @Test
  public void testDefaultHttpServerOptions() {
    assertEquals(80, HttpServerOptions.DEFAULT_PORT);
    assertEquals(80, new HttpServerOptions().getPort());
    assertEquals("0.0.0.0", HttpServerOptions.DEFAULT_HOST);
    assertEquals("0.0.0.0", new HttpServerOptions().getHost());
  }
}
