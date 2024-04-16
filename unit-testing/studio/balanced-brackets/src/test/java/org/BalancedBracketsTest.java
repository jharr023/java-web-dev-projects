package java.org;

import org.launchcode.BalancedBrackets;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    //TODO: add tests here

    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }


    public void emptyTest() {
        assertEquals(true, true);
    }


    public void testBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    public void testUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    public void testNonBracketCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code] Rocks!"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]Code Rocks!"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code Rocks]!"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[ Rocks!]"));
    }

    public void testMixedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Launch]Code]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
}



