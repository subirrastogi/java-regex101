package com.example.java.regex101;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
/*import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;*/

public class CapturingGroupExampleTest {
    private CapturingGroupExample example;

    @BeforeEach
    void setup() {
        example = new CapturingGroupExample();
    }

    @Test
    void run_ValidMultipleInput_ReturnResults() {
        String sample1 = """
                dhh>>_D_>>gjjd 103djd 39 
                {1:}{2:}
                {5:}
                <<_F_<<
                >>_D_>>yeys 103 dJPY
                {1:}{2:}
                {5:}
                <<_F_<<
                """;

        List<String> results = example.run(sample1);
        //assertThat(results).hasSize(2);
    }

    @Test
    void run_ValidSingleInput_ReturnResults() {
        String sample1 = """
                >>_D_>>gjjd103djd 39
                {1:}{2:
                }{5:}
                <<_F_<<
                """;
        //String simple = "dhh>>_D_>>gjjddd<<_F_<<";
        //String simple = "dhh>>_D_>>gjjddd<<_F_<<ddd>>_D_>>yes<<_F_<<";

        CapturingGroupExample example = new CapturingGroupExample();
        List<String> results = example.run(sample1);

        assertThat(results).hasSize(1);

        String expected = """
                {1:}{2:
                }{5:}
                """;

        System.out.println("Result - " + results);

        //using assertj
        assertThat(results)
                .containsExactlyInAnyOrder(expected);

        ////using hamcrest
        //assertThat(results, contains(expected));
    }
}
