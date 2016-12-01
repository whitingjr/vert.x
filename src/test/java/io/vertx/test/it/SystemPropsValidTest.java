package io.vertx.test.it;

import io.vertx.core.http.HttpServerOptions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class SystemPropsValidTest {

  @Test
  public void testDefaultHttpServerOptions() {
    assertEquals(1234, HttpServerOptions.DEFAULT_PORT);
    assertEquals(1234, new HttpServerOptions().getPort());
    assertEquals("wibble", HttpServerOptions.DEFAULT_HOST);
    assertEquals("wibble", new HttpServerOptions().getHost());
  }
}
