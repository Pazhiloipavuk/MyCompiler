Program TestLanguage {
    function Unit workWithStrings(String a, String b) {
        var str = a - b;
        var strFirst = a * b;
        var strSecond = a / b;
        return;
    }


    function Integer forTest(String str) {
        var result = 0;
        for (var i = 0; i < length(str); i ++) {
            result++
        }
        return result;
    }

    function Integer sum(Integer a, Integer b){
        return a + b;
    }

    function Integer blockTest(Integer a, Integer b) {
        if (a > b) {
            print(b);
        } else {
            print(a);
        }

        while (b < 6) {
            print(b);
        }
        return a;
    }

    function Unit main() {

        var a = 3;

        var b = 2;

        var l = "4";

        var k = 2;

        k = (Integer) l;

        l = (String) k;

        var sum = 3 + 5 + 8;

        var testSum = sum(a, b);

        var testBlock = blockTest(a, b);

        var eeee = "eeeee";

        var testLength = length(eeee);

        var test = "test";

        var sumStr = eeee + test;

        forTest(sumStr);

        var s = sum(a,b);

        workWithStrings(eeee, test);

        var first = 3;
        var second = 2;
        first = second;
        print(first);
    }
}