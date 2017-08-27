package test;

import static org.junit.Assert.*;

import org.junit.Test;

import graph.Graph;

public class graphTest {

	@Test
	public void test() {
		
		     // Create graphs given in the above diagrams
		     Graph g1 = new Graph(5);
		     g1.addEdge(0, 1);
		     g1.addEdge(1, 2);
		     g1.addEdge(2, 3);
		     g1.addEdge(3, 0);
		     g1.addEdge(2, 4);
		     g1.addEdge(4, 2);
		     if (g1.isSC())
		         System.out.println("Yes");
		     else
		         System.out.println("No");

		     Graph g2 = new Graph(4);
		     g2.addEdge(0, 1);
		     g2.addEdge(1, 2);
		     g2.addEdge(2, 3);
		     
		     if (g2.isSC())
		         System.out.println("Yes");
		     else
		         System.out.println("No");
		 }
	}

