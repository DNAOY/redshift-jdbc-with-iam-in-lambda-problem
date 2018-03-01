#!/bin/bash

mvn clean
mvn package
aws lambda create-function \
    --function-name myapp \
    --runtime java8 \
    --memory-size 512 \
    --role arn:aws:iam::`aws iam get-user --query User.Arn --out text | cut -d: -f5`:role/lambda_basic_execution \
    --handler com.mycompany.app.App \
    --zip-file fileb://target/my-app-1.0-SNAPSHOT.jar
aws lambda invoke --function-name myapp out.log
