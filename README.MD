# Demo for Redshift JDBC driver redshift-jdbc42 version 1.2.10.1009 problem in AWS Lambda

Steps to reproduce (run with proper credentials present in either environment variables or `~/.aws/credentials`):

    ./install.sh

This should produce the following:

```
0% cat out.log
{"errorMessage":"java.lang.NullPointerException","errorType":"java.lang.NullPointerException","stackTrace":["java.io.File.<init>(File.java:277)","com.amazon.redshift.common.PGClassLoaderSingleton.validateTempDir(Unknown Source)","com.amazon.redshift.jdbc.Driver.getInstance(Unknown Source)","com.amazon.redshift.jdbc.Driver.connect(Unknown Source)","com.mycompany.app.App.handleRequest(App.java:19)"]}%
```
