package com.mycompany.webserv;

public class Api {
    private final long requestNumber;
    private final String content;
    private final String serverDateTime;
    private final String requestId;
    private final String userAgent;
    private final String userIpAddress;

    public Api(long requestNumber, String content, String serverDateTime, String requestId, String userAgent, String userIpAddress) {
        this.requestNumber = requestNumber;
        this.content = content;
        this.serverDateTime = serverDateTime;
        this.requestId = requestId;
        this.userAgent = userAgent;
        this.userIpAddress = userIpAddress;
    }

    public long getRequestNumber() {
        return requestNumber;
    }

    public String getContent() {
        return content;
    }

    public String getServerDateTime() {
        return serverDateTime;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public String getUserIpAddress() {
        return userIpAddress;
    }
}
