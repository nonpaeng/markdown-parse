#target 				#what target is dependent on 
MarkDownParseTest.class : MarkdownParse.java
	javac MarkdownParse.java

MarkDownParseTest.class : MarkdownParseTest.java
	javac -cp .:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
	
test : MarkdownParseTest.class MarkdownParse.class
	java -cp .:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest 
