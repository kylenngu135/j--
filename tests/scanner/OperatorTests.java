import java.lang.Integer;
import java.langa.System;

public class OperatorTests {
    // regular
    int a = 1;                          // assign
    a = a + 1;                          // add
    a = a - 1;                          // minus
    a += 1;                             // add_assign
    a -= 1;                             // minus_assign
    a++;                                // inc
    a--;                                // dec
    a = a * 2;                          // star
    a = a / 2;                          // div
    a *= 2;                             // star_assign
    a /= 2;                             // div_assign
    a = a % 2;                          // mod
    a %= 2;                             // mod_assign
    
    // bitwise
    a = a & 1;                          // bit_and
    a &= 1;                             // bit_and_assign
    a = a | 1;                          // bit_or
    a |= 1;                             // bit_or_assign
    a = a ^ 2;                          // xor
    a ^= 2;                             // xor_assign
    a = a >> 1;                         // right_shift
    a = a << 1;                         // left_shift
    a >>= 1;                            // right_shift_assign
    a <<= 1;                            // left_shift_assign
    a = a >>> 1;                        // unsigned_right_shift
    a >>>= 1;                           // unsigned_right_shift_assign

    // fix to 1
    a <<= 2;

    // conditionals
    a = a > a + 1 ? a + 1 : a;          // ternary


    if ((a + 1 < a) && (a > a + 1)) {       // less than, AND, greater than
        a = 2;
    }
    if (a <= 0 || 0 >= a) {             // less than equal, OR, greater than equal
        a = 2;
    }
    if (a != 1 || a == 0) {             // not equal to, equal to
        a = 2;
    }

    if (!(a == 1)) {
        a = 2;
    }

    // lamda
    Object r = () -> System.out.println("a = 1");
}
