package ku.util;

import static org.junit.Assert.*;

import org.junit.*;
/**
 * 
 * @author Thitiwat Thongbor
 *
 */
public class StackTest {
	private Stack<String> stack;

	@Before
	public void setUp() {
		StackFactory.setStackType(0);
		stack = StackFactory.makeStack(3);
	}

	@After
	public void tearDown() {
		stack = null;
	}

	// test capacity

	@Test
	public void testMakeRightCapacity() {
		assertEquals(3, stack.capacity());
		stack = StackFactory.makeStack(0);
		assertEquals(0, stack.capacity());
	}

	@Test (expected = java.lang.IllegalArgumentException.class)
	public void testImposibleCapacity() {
		stack = StackFactory.makeStack(-1);
	}

	// test isEmpty

	@Test
	public void testIsEmptyWhenCreated() {
		assertTrue(stack.isEmpty());
	}

	@Test
	public void testIsEmptyWhenPushAndPop() {
		stack = (Stack<String>) StackFactory.makeStack(10);
		stack.push("1");
		assertFalse(stack.isEmpty());
		stack.pop();
		assertTrue(stack.isEmpty());
	}

	@Test
	public void testIsEmptyWhenCreateZeroCapacity() {
		stack = StackFactory.makeStack(0);
		assertTrue(stack.isEmpty());
	}

	@Test
	public void testIsFull() {
		assertFalse(stack.isFull());
		stack = (Stack<String>) StackFactory.makeStack(1);
		stack.push("1");
		assertTrue(stack.isFull());
	}

	@Test
	public void testIsFullWhenCreateZeroCapicity() {
		stack = StackFactory.makeStack(0);
		assertTrue(stack.isFull());
	}

	// test peek

	@Test
	public void testPeekMustBeNull() {
		assertNull(stack.peek());
	}

	@Test
	public void testPeekWhenPush() {
		stack.push("1");
		assertEquals("1", stack.peek());
		// peek should not change the stack
		assertEquals("1", stack.peek());
		assertEquals(1, stack.size());
		stack.push("2");
		assertEquals("2", stack.peek());
	}

	// test pop
	@Test(expected = java.util.EmptyStackException.class)
	public void throwIsEmptyWhenPopEmpty() {
		stack.pop();
	}

	@Test
	public void testPop() {
		stack.push("1");
		assertEquals("1", stack.pop());
		stack.push("2");
		stack.push("3");
		assertEquals("3", stack.pop());
		assertEquals("2", stack.pop());
	}
	
	//test push
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void pushNullMustThrow(){
		stack.push(null);
	}
	
	@Test(expected = java.lang.IllegalStateException.class)
	public void pushOverSize(){
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
	}
	
	//test size
	@Test
	public void testCorrectSize(){
		assertEquals(0, stack.size());
		stack.push("1");
		assertEquals(1, stack.size());
		stack.push("2");
		assertEquals(2, stack.size());
		stack.push("3");
		assertEquals(3, stack.size());
		stack.pop();
		assertEquals(2, stack.size());
	}
}
