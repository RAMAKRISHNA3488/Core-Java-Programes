package com.ram.Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RequestParser {

    public static void main(String[] args) {
        // Example usage:
        String[] validAuthTokens = {"token1", "token2"};
        String[][] requests = {
                {"GET", "/endpoint?token=token1&param1=Ram&param2=Ram"},
                {"POST", "/endpoint?token=token2&csrf=asc&param3=Ram"}
        };

        List<String> results = parseRequests(validAuthTokens, requests);

        for (String result : results) {
            System.out.println(result);
        }
    }

    public static List<String> parseRequests(String[] validAuthTokens, String[][] requests) {
        List<String> results = new ArrayList<>();

        for (String[] request : requests) {
            String requestType = request[0];
            String url = request[1];

            if (isValidAuthenticationToken(validAuthTokens, url)) {
                if ("POST".equals(requestType)) {
                    String csrfToken = extractCSRFToken(url);
                    if (isValidCSRFToken(csrfToken)) {
                        results.add("VALID, " + parseURLParameters(url));
                    } else {
                        results.add("INVALID");
                    }
                } else {
                    results.add("VALID, " + parseURLParameters(url));
                }
            } else {
                results.add("INVALID");
            }
        }

        return results;
    }

    private static boolean isValidAuthenticationToken(String[] validAuthTokens, String url) {
        String tokenRegex = "token=([^&]+)";
        Pattern pattern = Pattern.compile(tokenRegex);
        Matcher matcher = pattern.matcher(url);

        if (matcher.find()) {
            String token = matcher.group(1);
            return Arrays.asList(validAuthTokens).contains(token);
        }

        return false;
    }

    private static String parseURLParameters(String url) {
        int questionMarkIndex = url.indexOf("?");
        if (questionMarkIndex != -1) {
            return url.substring(questionMarkIndex + 1);
        }
        return "";
    }

    private static String extractCSRFToken(String url) {
        String csrfRegex = "csrf=([^&]+)";
        Pattern pattern = Pattern.compile(csrfRegex);
        Matcher matcher = pattern.matcher(url);

        if (matcher.find()) {
            return matcher.group(1);
        }

        return "";
    }

    private static boolean isValidCSRFToken(String csrfToken) {
        // CSRF token validation logic, e.g., alphanumeric and minimum length check
        return csrfToken.matches("[a-zA-Z0-9]+") && csrfToken.length() >= 8;
    }
}

