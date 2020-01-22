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

    @Test
    public void should_return_two_with_iio_command_string() {
        assertThat(parser("iio")).isEqualTo(new int[]{2});
    }

    @Test
    public void should_return_nine_with_iiiso_command_string() {
        assertThat(parser("iiiso")).isEqualTo(new int[]{9});
    }

    private int[] parser(String commands) {
        if (commands.length() == 0)
            return new int[0];
        return new int[]{calculateSum(commands)};
    }

    private int calculateSum(String commands) {
        int sum = 0;
        for (int i = 0; i<commands.length();i++) {
            if (commands.charAt(i) == 'i') sum++;
            else if (commands.charAt(i) == 's') sum*=sum;
        }
        return sum;
    }
}
