package api.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

@Data
@NonNull
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {

    Long id;

    @NotBlank
    String author;

    @Size(max = 500)
    String title;

    @NotBlank
    String name;

    @Positive
    int count;

    @Positive
    int countOfPages;
}
