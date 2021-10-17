package q1.extract_method.refactored;

import java.util.ArrayList;
import java.util.List;


public class A {

   Node m1(List<Node> nodes, String p) {
      checkExtraced(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	   checkExtraced(edgeList, p);
	   return null;
   }

<G extends Super> void checkExtraced(List<G> contents, String p) {
	   
	for (G content : contents) {
		if (content.contains(p));
	}
   }
}

class Super {
	String name;
	boolean contains(String p) {
		return name.contains(p);
	}
}
class Node extends Super{
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge extends Super{
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}