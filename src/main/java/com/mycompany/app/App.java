package com.mycompany.app;

import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.amazon.redshift.jdbc42.Driver;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import com.amazonaws.services.lambda.runtime.Context;

/**
 * Simple AWS Lambda handler that tries to connect to Redshift database.
 * Demonstrates that the JDBC driver will throw an Exception in the AWS Lambda runtime.
 */
public class App implements RequestStreamHandler
{
    public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {
        Driver d = new Driver();
        try {
            d.connect("jdbc:redshift:iam://mycluster:eu-west-1/mydb", null);
        } catch (java.sql.SQLException e) {
        };
    }
}
