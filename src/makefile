OBJ = ../class

all: $(OBJ)/UGraph.class $(OBJ)/P.class $(OBJ)/RandGraph.class $(OBJ)/MainClass.class 

$(OBJ)/MainClass.class: MainClass.java
	javac -d ../class/ MainClass.java

$(OBJ)/UGraph.class: UGraph.java
	javac -d ../class/ UGraph.java	
	
$(OBJ)/P.class: P.java
	javac -d ../class/ P.java

$(OBJ)/RandGraph.class: RandGraph.java
	javac -d ../class/ RandGraph.java
	
clean:
	rm -f ../class/*.class
