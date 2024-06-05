- Author: Jun Yang (UIUC Spring 2024 CS527 TA)

## Note
Only include Java 8.

Should have defects4j installed ahead of the time.

Chart requires SVN, other bugs require Git.

Should be a maven project (or ant for d4j projects)

Options to mvn cmd: -Dcheckstyle.skip -Denforcer.skip -Danimal.sniffer.skip -fn

We'd better also use maven clover for d4j and quixbugs projects coverage collection. Here is the compatibility information: 
- hack: for Codec projects (e.g. Codec-12) we need to remove src/test/java/org/apache/commons/codec/binary/Base64Codec13Test.java to avoid code too large compilation error.

The selected QuixBugs bugs must be based on JUnit.

We either need to restrict the JUnit version to 4.12+ or use a script to update it.

Please run "export PYTHONPATH=path/to/scripts" command before you execute any scripts