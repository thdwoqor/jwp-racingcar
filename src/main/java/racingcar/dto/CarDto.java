package racingcar.dto;

public class CarDto {

    private final String name;
    private final int position;

    public CarDto(final String name, final int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
