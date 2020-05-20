package result;


public class TestLanguage {
public static void main(String[] args) {

int a = 3;

int b = 2;

String l = "4";

int k = 2;

k = Integer.parseInt(l);

l = Integer.toString(k);

int sum = 3+ 5+ 8;
sum(a, b);

int testSum = sum(a, b);
blockTest(a, b);

int testBlock = blockTest(a, b);

String eeee = "eeeee";

int testLength = eeee.length();

String test = "test";

String sumStr = eeee + test;
forTest(sumStr);
sum(a, b);

int s = sum(a, b);
workWithStrings(eeee, test);

int first = 3;

int second = 2;

first = second;
System.out.println(first);
}
public static void workWithStrings (String a, String b) {

String str = a.replaceFirst(a, b);
String strFirst = a.concat(b);
String strSecond = a.replace(a, b);}

public static int forTest (String str) {

int result = 0;for (int i = 0; i < str.length(); i ++) {
result ++;
}
return result;
}

public static int sum (int a, int b) {
return a + b;
}

public static int blockTest (int a, int b) {
if (a>b) {
System.out.println(b);
}
else {
System.out.println(a);
}
while (b<6) {
System.out.println(b);
}
return a;
}


}
