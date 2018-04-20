package pl.javastart.exercise.optional;

import java.util.Optional;

public class OptionalExercise {

    public Optional createEmptyOptional() {
        return Optional.empty();
    }

    public Optional createOptionalWithValue() {
        return Optional.of(1);
    }

    public Optional<String> createOptionalWithValue(String s) {
        return Optional.of(s);
    }

    public String getOptionalValueOrDefault(Optional<String> optional, String defaultValue) {
        return optional.orElse(defaultValue);
    }
}
