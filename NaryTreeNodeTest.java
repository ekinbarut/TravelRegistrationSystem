
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;


class NaryTreeNodeTest {

	@Test
	void test() {
		String test = "ekin";
		int number = 5;
		
		NaryTreeNode node = new NaryTreeNode(test, number);
		
		node.addChild("test");
		node.addChild("test1");
				
		
		node.getChild(1).addChild("fdsa");
		node.getChild(1).addChild("another child");
		node.getChild(1).getChild(1).addChild("another child");
		
			
		//Check that node contains child at element 0 
		assertTrue(node.getChildren().contains(node.getChild(0)));
		
		//Check that node contains child at element 1
		assertTrue(node.getChildren().contains(node.getChild(1)));
		
		//Confirm that node doesn't contain a child at element 2
		assertFalse(node.getChildren().contains(node.getChild(2)));
		
		//check that getChild function returns null
		assertNull(node.getChild(5));
	}

}
