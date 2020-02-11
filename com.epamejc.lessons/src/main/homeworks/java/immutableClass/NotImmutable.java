package homeworks.java.immutableClass;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Getter
public class NotImmutable {
    protected double constant;
    protected String constantName;
}

