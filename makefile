JC = javac
JA = java

default: complie run

complie: clean
	$(JC) BubbleSort.java TestBubbleSort.java TestRunner.java
clean:
	rm -f *.class
run:
	$(JA) TestRunner
