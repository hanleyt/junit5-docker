package com.github.junit5docker;

/**
 * <p>Asks JUnit-docker to wait for something to appear in the container's log before running any test.</p>
 *
 * @since 1.0
 */
public @interface WaitFor {

    /**
     * <p>Special value.
     * If used, JUnit-docker does not wait for anything and just start the tests.</p>
     * <p>This is the default value in {@link Docker}</p>
     */
    String NOTHING = "";

    /**
     * @return the log text to wait for.
     */
    String value();

    /**
     * @return the time in milliseconds to wait for the log before giving up.
     */
    int timeoutInMillis() default 10 * 1000;
}
