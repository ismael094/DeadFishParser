import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DeadFishParser_ {
    @Test
    public void should_return_empty_with_no_commands_string() {
        assertThat(parser("")).isEqualTo(new int[0]);
    }

    @Test
    public void should_return_one_zero_with_oo_command_string() {
        assertThat(parser("o")).isEqualTo(new int[1]);
    }

    @Test
    public void should_return_one_with_io_command_string() {
        assertThat(parser("io")).isEqualTo(new int[]{1});
    }

    private int[] parser(String commands) {
        return new int[commands.length()];
    }
}
