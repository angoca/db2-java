db2-java
========

Set of java features for DB2

Please visit the wiki to read more information about all.
https://github.com/angoca/db2-java/wiki

# NSLOOKUP FUNCTION

This function allows to retrieve the Hostname from an IP address, or the
IP Address from a hostname.

## Install

It is necessary Maven to perform the process.

    mvn
    db2 connect to XXX
    db2 "call sqlj.install_jar('file:/home/username/db2-java/target/db2-java.jar','NSLOOKUP')"
    db2 -tf src/main/sql/UDFNslookup.sql

## Test

It need db2unit

    db2 -tf src/test/sql/Tests_NSLOOKUP.sql
    db2 "call db2unit.run_suite('NSLOOKUP')"

## Usage

You need to call the functions in order to get the values.

    db2 "values NSLOOKUP('8.8.4.4')"
    db2 "values reverse_NSLOOKUP('yahoo.com')"

