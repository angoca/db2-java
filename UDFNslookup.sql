/**
 * Resolves a given IP and returns the name of the server.
 *
 * IN
 *   IP address in x.x.x.x format.
 * RETURNS the string that conatains the hostname.
 */
CREATE FUNCTION nslookup(VARCHAR(255))
  RETURNS VARCHAR(255)
  FENCED
  EXTERNAL NAME 'UDFNSLOOKUPJAR:UDFNslookup.resolveIP'
  NOT VARIANT
  NO SQL
  PARAMETER STYLE java
  LANGUAGE java
  NO EXTERNAL ACTION;

/**
 * Resolves a given name and returns the IP associated to the server.
 *
 * IN
 *   IP address in x.x.x.x format.
 * RETURNS the string that conatains the hostname.
 */
CREATE FUNCTION reverseNslookup(VARCHAR(255))
  RETURNS VARCHAR(255)
  FENCED
  EXTERNAL NAME 'UDFNSLOOKUPJAR:UDFNslookup.resolveName'
  NOT VARIANT
  NO SQL
  PARAMETER STYLE java
  LANGUAGE java
  NO EXTERNAL ACTION;

