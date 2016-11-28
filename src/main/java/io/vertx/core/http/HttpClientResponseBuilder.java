package io.vertx.core.http;

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import io.vertx.core.streams.ReadStream;

/**
 * A builder for configuring client-side HTTP responses.
 *
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@VertxGen
public interface HttpClientResponseBuilder<T> {

  /**
   * Send a request, the {@code handler} will receive the response as an {@link HttpResponse}.
   */
  void send(Handler<AsyncResult<HttpResponse<T>>> handler);

  /**
   * Like {@link #send(Handler)} but with an HTTP request {@code body} stream.
   *
   * @param body the body
   */
  void send(ReadStream<Buffer> body, Handler<AsyncResult<HttpResponse<T>>> handler);

  /**
   * Configure the builder to decode the response as a {@code String}.
   *
   * @return a new {@code HttpClientResponseBuilder} instance decoding the response as a {@code String}
   */
  HttpClientResponseBuilder<String> asString();

  /**
   * Like {@link #asString()} but with the specified {@code encoding} param.
   */
  HttpClientResponseBuilder<String> asString(String encoding);

  /**
   * Configure the builder to decode the response as a Json object.
   *
   * @return a new {@code HttpClientResponseBuilder} instance decoding the response as a Json object
   */
  HttpClientResponseBuilder<JsonObject> asJsonObject();

  /**
   * Configure the builder to decode the response using a specified {@code type} using the Jackson mapper.
   *
   * @return a new {@code HttpClientResponseBuilder} instance decoding the response as specified type
   */
  <R> HttpClientResponseBuilder<R> as(Class<R> type);

}
