import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DeadFishParser_ {

    @Test
    public void should_return_empty_with_no_commands_string() {
        assertThat(DeadFishParser.parser("")).isEqualTo(new int[0]);
    }

    @Test
    public void should_return_one_zero_with_o_command_string() {
        assertThat(DeadFishParser.parser("o")).isEqualTo(new int[1]);
    }

    @Test
    public void should_return_two_posistion_with_zero_with_oo_command_string() {
        assertThat(DeadFishParser.parser("oo")).isEqualTo(new int[2]);
    }

    @Test
    public void should_return_one_with_io_command_string() {
        assertThat(DeadFishParser.parser("io")).isEqualTo(new int[]{1});
    }

    @Test
    public void should_return_two_with_iio_command_string() {
        assertThat(DeadFishParser.parser("iio")).isEqualTo(new int[]{2});
    }

    @Test
    public void should_return_nine_with_iiiso_command_string() {
        assertThat(DeadFishParser.parser("iiiso")).isEqualTo(new int[]{9});
    }

    @Test
    public void should_return_two_with_iiido_command_string() {
        assertThat(DeadFishParser.parser("iiido")).isEqualTo(new int[]{2});
    }

}
