package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Objects;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Base {
    private int id;

    //(?)
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Base base)) return false;
        return id == base.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                '}';
    }
}
