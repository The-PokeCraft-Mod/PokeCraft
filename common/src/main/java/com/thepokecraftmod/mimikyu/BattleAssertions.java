package com.thepokecraftmod.mimikyu;

/**
 * Make sure everything is acting how it should
 */
public class BattleAssertions {

    public static void assertTrue(boolean isTrue) {
        if (!isTrue) {
            var whereItHappened = new Throwable().getStackTrace()[1];
            var message = "Battle Assertion Failed in " + whereItHappened.getClassName() + "\n" + "Method " + whereItHappened.getMethodName() + " On Line " + whereItHappened.getLineNumber();

            if (Mimikyu.THROW_INSTEAD_OF_ERROR) throw new RuntimeException(message);
            else Mimikyu.LOGGER.error(message);
        }
    }
}
