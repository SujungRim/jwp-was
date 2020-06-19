package http;

import http.request.RequestLine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class RequestLineTest {

    @DisplayName("HTTP GET요청에 대한 RequestLine을 method, path, protocol, version으로 파싱")
    @Test
    void test_parsing_requestline_about_get_should_pass() {
        // given
        String fullRequestLine = "GET /users HTTP/1.1";
        // when
        RequestLine requestLine = RequestLine.from(fullRequestLine);
        // then
        assertThat(requestLine.equals(RequestLine.of("GET", "/users", "HTTP", "1.1"))).isTrue();
    }

    @DisplayName("HTTP POST요청에 대한 RequestLine을 method, path, protocol, version으로 파싱")
    @Test
    void test_parsing_requestline_about_post_should_pass() {
        // given
        String fullRequestLine = "POST /users HTTP/1.1";
        // when
        RequestLine requestLine = RequestLine.from(fullRequestLine);
        // then
        assertThat(requestLine.equals(RequestLine.of("POST", "/users", "HTTP", "1.1"))).isTrue();
    }
}
