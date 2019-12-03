package Day2;

/**
 * Day2 is used for --
 * © 2019 NetSuite Inc.
 *
 * @author ezhang
 * @since 02-Dec-2019
 */
public enum OpCode {
    ADD(1),
    MULTIPLE(2),

    END(99);

    int value;

    OpCode(int i) {
        value = i;
    }
}
