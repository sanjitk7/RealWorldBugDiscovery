var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":39,"id":2458,"methods":[{"el":33,"sc":5,"sl":27},{"el":38,"sc":5,"sl":35}],"name":"UtilTest","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_123":{"methods":[{"sl":35}],"name":"testStripLeadingAndTrailingQuotes","pass":true,"statements":[{"sl":37}]},"test_87":{"methods":[{"sl":27}],"name":"testStripLeadingHyphens","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [87], [], [87], [87], [87], [87], [], [], [123], [], [123], [], []]
