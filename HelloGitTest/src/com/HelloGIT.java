package com;

public class HelloGIT {

	static {
        message = "Hello sangeetha Worlddd!";
    }

    private final static String message;    

    public HelloGIT() {}

    public static void main(String[] args) {
        System.out.println(new HelloGIT().getMessage());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("HelloWorld [");
        if (getMessage() != null)
            builder.append("message=").append(getMessage());
        builder.append("]");
        return builder.toString();
    }

    private final String getMessage() {
        return message;
    }

}
