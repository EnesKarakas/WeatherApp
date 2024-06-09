package io.swagger.api;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-04T09:41:03.559554872Z[GMT]")
public class ApiException extends Exception {
    @SuppressWarnings("unused")
    private int code;

    public ApiException(int code, String msg) {
        super(msg);
        this.code = code;
    }
}
