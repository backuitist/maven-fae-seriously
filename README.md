
## Problem

Run the tests on all modules even if their dependencies failed, but exit with code 1 if the build failed.

     mvn clean install -fn | perl -pe 'END { exit $status } $status=1 if /BUILD FAILURE/;'