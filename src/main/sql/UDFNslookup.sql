--#SET TERMINATOR ;

/**
 * Tests for NS LOOK UP function.
 *
 * Version: 2014-08-18
 * Author: Andres Gomez Casanova (AngocA)
 * Made in COLOMBIA.
 */

/**
 * Resolves a given IP and returns the name of the server.
 *
 * IN
 *   IP address in x.x.x.x format.
 * RETURNS the string that conatains the hostname.
 */
CREATE FUNCTION NSLOOKUP(VARCHAR(255))
  RETURNS VARCHAR(255)
  FENCED
  EXTERNAL NAME 'NSLOOKUP:UDFNslookup.resolveIP'
  NOT VARIANT
  NO SQL
  PARAMETER STYLE java
  LANGUAGE java
  NO EXTERNAL ACTION;

/**
 * Resolves a given name and returns the IP associated to the server.
 *
 * IN
 *   HOSTNAME Name of the server.
 * RETURNS the string that conatains the hostname.
 */
CREATE FUNCTION REVERSE_NSLOOKUP(VARCHAR(255))
  RETURNS VARCHAR(255)
  FENCED
  EXTERNAL NAME 'NSLOOKUP:UDFNslookup.resolveName'
  NOT VARIANT
  NO SQL
  PARAMETER STYLE java
  LANGUAGE java
  NO EXTERNAL ACTION;

